package controllers

import javax.inject._

import actions.NoCache
import be.objectify.deadbolt.scala.DeadboltActions
import com.feth.play.module.pa.PlayAuthenticate
import com.nappin.play.recaptcha.{RecaptchaVerifier, WidgetHelper}
import constants.SecurityRoleKey
import play.api.mvc._
import services.UserService
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.routing.JavaScriptReverseRouter
import play.core.j.JavaHelpers
import play.mvc.Http.RequestBody
import providers.MyAuthProvider
import views.form._
import play.api.mvc.MultipartFormData.FilePart
import models._
import views.form._
import play.api.data.Form
import play.api.data.Forms._
import utils._
import java.io.{InputStream, File, FileInputStream}

@Singleton
class Upload @Inject() (implicit
                             val messagesApi: MessagesApi,
                             val verifier: RecaptchaVerifier,
                             widgetHelper: WidgetHelper,
                             webJarAssets: WebJarAssets,
                             deadbolt: DeadboltActions,
                             auth: PlayAuthenticate,
                             userService: UserService,
                             authProvider: MyAuthProvider,
                             formContext: FormContext) extends Controller with I18nSupport {
  import scala.concurrent._
  import ExecutionContext.Implicits.global

  //-------------------------------------------------------------------
  // public
  //-------------------------------------------------------------------

  //-------------------------------------------------------------------
  def upload = deadbolt.WithAuthRequest()() { implicit request =>
    Future {
      val jContext = JavaHelpers.createJavaContext(request)
      val localUser = userService.findInSession(jContext.session)
      Ok(views.html.uploadcustomerdata(userService, formContext.uploadCustomerForm.Instance))
    }
  }

  
  
  
 def doUpload = NoCache {
   deadbolt.WithAuthRequest()(parse.multipartFormData) { implicit request =>
     Future {
       import java.io.File
       val uploadForm = Form(
         mapping(
           "updateExistingRecords" -> boolean
         )(UploadResource.apply)(UploadResource.unapply)
       )
       val sp: Option[UploadResource] = uploadForm.bindFromRequest().fold(
         errFrm => None,
         UploadResource => Some(UploadResource)
       )
       request.body.file("file").map { f =>
         sp.map { UploadResource =>
           val filename = f.filename
           print(filename)
           val contentType = f.contentType
           print(contentType)
           print(UploadResource.updateExistingRecords)
           f.ref.moveTo(new File(s"tmp/$filename"), replace = true)

           var list = ExcelReader.inputFeed(new FileInputStream(s"tmp/$filename"), "$filename", "customers", 20, true)
           print(list)
           // ReadWriteExcelFile.readXLSFile(new FileInputStream(s"tmp/$filename"), filename)
           //  ec.readXLSFile(new FileInputStream(s"tmp/$filename"), filename)
           // ec.readXLSFile( InputStream ExcelFileToRead , String filaname)
           Ok("File uploaded")
         }.getOrElse {
           BadRequest("Form binding error.")
         }
       }.getOrElse {
         BadRequest("File not attached.")
       }
     }
   }

 }
 
} 