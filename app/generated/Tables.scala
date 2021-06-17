package generated
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.driver.JdbcProfile
  import profile.api._
  import be.objectify.deadbolt.scala.models._
  import dao.generic._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(Language.schema, LinkedAccount.schema, PlayEvolutions.schema, Promotion.schema, PromotionMessageForLanguage.schema, PromotionReceiversFilter.schema, PromotionReceiversFilterCombine.schema, PromotionReceiversFilterSingle.schema, PromotionStage.schema, SecurityPermission.schema, SecurityRole.schema, Tenant.schema, TenantCustomer.schema, TokenAction.schema, User.schema, UserSecurityPermission.schema, UserSecurityRole.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Language
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param name Database column name SqlType(VARCHAR), Length(100,true)
    *  @param tenantId Database column tenant_id SqlType(BIGINT)
    *  @param defaultLanguage Database column default_language SqlType(VARCHAR), Length(100,true)
    *  @param active Database column active SqlType(BIT), Default(Some(false)) */
  case class LanguageRow(id: Long, name: String, tenantId: Long, defaultLanguage: String, active: Option[Boolean] = Some(false)) extends EntityAutoInc[Long, LanguageRow]
  /** GetResult implicit for fetching LanguageRow objects using plain SQL queries */
  implicit def GetResultLanguageRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]]): GR[LanguageRow] = GR{
    prs => import prs._
      LanguageRow.tupled((<<[Long], <<[String], <<[Long], <<[String], <<?[Boolean]))
  }
  /** Table description of table language. Objects of this class serve as prototypes for rows in queries. */
  class Language(_tableTag: Tag) extends Table[LanguageRow](_tableTag, "language") with IdentifyableTable[Long] {
    def * = (id, name, tenantId, defaultLanguage, active) <> (LanguageRow.tupled, LanguageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(tenantId), Rep.Some(defaultLanguage), active).shaped.<>({r=>import r._; _1.map(_=> LanguageRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column tenant_id SqlType(BIGINT) */
    val tenantId: Rep[Long] = column[Long]("tenant_id")
    /** Database column default_language SqlType(VARCHAR), Length(100,true) */
    val defaultLanguage: Rep[String] = column[String]("default_language", O.Length(100,varying=true))
    /** Database column active SqlType(BIT), Default(Some(false)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(false)))

    /** Foreign key referencing Tenant (database name language_ibfk_1) */
    lazy val tenantFk = foreignKey("language_ibfk_1", tenantId, Tenant)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Language */
  lazy val Language = new TableQuery(tag => new Language(tag))

  /** Entity class storing rows of table LinkedAccount
    *  @param userId Database column user_id SqlType(BIGINT)
    *  @param providerKey Database column provider_key SqlType(VARCHAR), Length(255,true)
    *  @param providerPassword Database column provider_password SqlType(VARCHAR), Length(255,true)
    *  @param modified Database column modified SqlType(DATETIME), Default(None) */
  case class LinkedAccountRow(userId: Long, providerKey: String, providerPassword: String, modified: Option[java.sql.Timestamp] = None) extends Entity[Long] { override def id = userId }
  /** GetResult implicit for fetching LinkedAccountRow objects using plain SQL queries */
  implicit def GetResultLinkedAccountRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]]): GR[LinkedAccountRow] = GR{
    prs => import prs._
      LinkedAccountRow.tupled((<<[Long], <<[String], <<[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table linked_account. Objects of this class serve as prototypes for rows in queries. */
  class LinkedAccount(_tableTag: Tag) extends Table[LinkedAccountRow](_tableTag, "linked_account") with IdentifyableTable[Long] {
    override def id = userId
    def * = (userId, providerKey, providerPassword, modified) <> (LinkedAccountRow.tupled, LinkedAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userId), Rep.Some(providerKey), Rep.Some(providerPassword), modified).shaped.<>({r=>import r._; _1.map(_=> LinkedAccountRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_id SqlType(BIGINT) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column provider_key SqlType(VARCHAR), Length(255,true) */
    val providerKey: Rep[String] = column[String]("provider_key", O.Length(255,varying=true))
    /** Database column provider_password SqlType(VARCHAR), Length(255,true) */
    val providerPassword: Rep[String] = column[String]("provider_password", O.Length(255,varying=true))
    /** Database column modified SqlType(DATETIME), Default(None) */
    val modified: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified", O.Default(None))

    /** Foreign key referencing User (database name linked_account_ibfk_1) */
    lazy val userFk = foreignKey("linked_account_ibfk_1", userId, User)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table LinkedAccount */
  lazy val LinkedAccount = new TableQuery(tag => new LinkedAccount(tag))

  /** Entity class storing rows of table PlayEvolutions
    *  @param id Database column id SqlType(INT), PrimaryKey
    *  @param hash Database column hash SqlType(VARCHAR), Length(255,true)
    *  @param appliedAt Database column applied_at SqlType(TIMESTAMP)
    *  @param applyScript Database column apply_script SqlType(MEDIUMTEXT), Length(16777215,true), Default(None)
    *  @param revertScript Database column revert_script SqlType(MEDIUMTEXT), Length(16777215,true), Default(None)
    *  @param state Database column state SqlType(VARCHAR), Length(255,true), Default(None)
    *  @param lastProblem Database column last_problem SqlType(MEDIUMTEXT), Length(16777215,true), Default(None) */
  case class PlayEvolutionsRow(id: Int, hash: String, appliedAt: java.sql.Timestamp, applyScript: Option[String] = None, revertScript: Option[String] = None, state: Option[String] = None, lastProblem: Option[String] = None)
  /** GetResult implicit for fetching PlayEvolutionsRow objects using plain SQL queries */
  implicit def GetResultPlayEvolutionsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[String]]): GR[PlayEvolutionsRow] = GR{
    prs => import prs._
      PlayEvolutionsRow.tupled((<<[Int], <<[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table play_evolutions. Objects of this class serve as prototypes for rows in queries. */
  class PlayEvolutions(_tableTag: Tag) extends Table[PlayEvolutionsRow](_tableTag, "play_evolutions") {
    def * = (id, hash, appliedAt, applyScript, revertScript, state, lastProblem) <> (PlayEvolutionsRow.tupled, PlayEvolutionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(hash), Rep.Some(appliedAt), applyScript, revertScript, state, lastProblem).shaped.<>({r=>import r._; _1.map(_=> PlayEvolutionsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column hash SqlType(VARCHAR), Length(255,true) */
    val hash: Rep[String] = column[String]("hash", O.Length(255,varying=true))
    /** Database column applied_at SqlType(TIMESTAMP) */
    val appliedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("applied_at")
    /** Database column apply_script SqlType(MEDIUMTEXT), Length(16777215,true), Default(None) */
    val applyScript: Rep[Option[String]] = column[Option[String]]("apply_script", O.Length(16777215,varying=true), O.Default(None))
    /** Database column revert_script SqlType(MEDIUMTEXT), Length(16777215,true), Default(None) */
    val revertScript: Rep[Option[String]] = column[Option[String]]("revert_script", O.Length(16777215,varying=true), O.Default(None))
    /** Database column state SqlType(VARCHAR), Length(255,true), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Length(255,varying=true), O.Default(None))
    /** Database column last_problem SqlType(MEDIUMTEXT), Length(16777215,true), Default(None) */
    val lastProblem: Rep[Option[String]] = column[Option[String]]("last_problem", O.Length(16777215,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table PlayEvolutions */
  lazy val PlayEvolutions = new TableQuery(tag => new PlayEvolutions(tag))

  /** Entity class storing rows of table Promotion
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param tenantId Database column tenant_id SqlType(BIGINT)
    *  @param name Database column name SqlType(VARCHAR), Length(100,true)
    *  @param filterId Database column filter_id SqlType(BIGINT)
    *  @param active Database column active SqlType(BIT), Default(Some(false)) */
  case class PromotionRow(id: Long, tenantId: Long, name: String, filterId: Long, active: Option[Boolean] = Some(false)) extends EntityAutoInc[Long, PromotionRow]
  /** GetResult implicit for fetching PromotionRow objects using plain SQL queries */
  implicit def GetResultPromotionRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[Boolean]]): GR[PromotionRow] = GR{
    prs => import prs._
      PromotionRow.tupled((<<[Long], <<[Long], <<[String], <<[Long], <<?[Boolean]))
  }
  /** Table description of table promotion. Objects of this class serve as prototypes for rows in queries. */
  class Promotion(_tableTag: Tag) extends Table[PromotionRow](_tableTag, "promotion") with IdentifyableTable[Long] {
    def * = (id, tenantId, name, filterId, active) <> (PromotionRow.tupled, PromotionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(tenantId), Rep.Some(name), Rep.Some(filterId), active).shaped.<>({r=>import r._; _1.map(_=> PromotionRow.tupled((_1.get, _2.get, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column tenant_id SqlType(BIGINT) */
    val tenantId: Rep[Long] = column[Long]("tenant_id")
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column filter_id SqlType(BIGINT) */
    val filterId: Rep[Long] = column[Long]("filter_id")
    /** Database column active SqlType(BIT), Default(Some(false)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(false)))

    /** Foreign key referencing PromotionReceiversFilter (database name promotion_ibfk_2) */
    lazy val promotionReceiversFilterFk = foreignKey("promotion_ibfk_2", filterId, PromotionReceiversFilter)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Tenant (database name promotion_ibfk_1) */
    lazy val tenantFk = foreignKey("promotion_ibfk_1", tenantId, Tenant)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Promotion */
  lazy val Promotion = new TableQuery(tag => new Promotion(tag))

  /** Entity class storing rows of table PromotionMessageForLanguage
    *  @param promotionStageId Database column promotion_stage_id SqlType(BIGINT)
    *  @param languageId Database column language_id SqlType(BIGINT)
    *  @param promotionMessageForLanguageMessageTemplate Database column promotion_message_for_language_message_template SqlType(VARCHAR), Length(400,true) */
  case class PromotionMessageForLanguageRow(promotionStageId: Long, languageId: Long, promotionMessageForLanguageMessageTemplate: String)
  /** GetResult implicit for fetching PromotionMessageForLanguageRow objects using plain SQL queries */
  implicit def GetResultPromotionMessageForLanguageRow(implicit e0: GR[Long], e1: GR[String]): GR[PromotionMessageForLanguageRow] = GR{
    prs => import prs._
      PromotionMessageForLanguageRow.tupled((<<[Long], <<[Long], <<[String]))
  }
  /** Table description of table promotion_message_for_language. Objects of this class serve as prototypes for rows in queries. */
  class PromotionMessageForLanguage(_tableTag: Tag) extends Table[PromotionMessageForLanguageRow](_tableTag, "promotion_message_for_language") {
    def * = (promotionStageId, languageId, promotionMessageForLanguageMessageTemplate) <> (PromotionMessageForLanguageRow.tupled, PromotionMessageForLanguageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(promotionStageId), Rep.Some(languageId), Rep.Some(promotionMessageForLanguageMessageTemplate)).shaped.<>({r=>import r._; _1.map(_=> PromotionMessageForLanguageRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column promotion_stage_id SqlType(BIGINT) */
    val promotionStageId: Rep[Long] = column[Long]("promotion_stage_id")
    /** Database column language_id SqlType(BIGINT) */
    val languageId: Rep[Long] = column[Long]("language_id")
    /** Database column promotion_message_for_language_message_template SqlType(VARCHAR), Length(400,true) */
    val promotionMessageForLanguageMessageTemplate: Rep[String] = column[String]("promotion_message_for_language_message_template", O.Length(400,varying=true))

    /** Foreign key referencing Language (database name promotion_message_for_language_ibfk_2) */
    lazy val languageFk = foreignKey("promotion_message_for_language_ibfk_2", languageId, Language)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing PromotionStage (database name promotion_message_for_language_ibfk_1) */
    lazy val promotionStageFk = foreignKey("promotion_message_for_language_ibfk_1", promotionStageId, PromotionStage)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PromotionMessageForLanguage */
  lazy val PromotionMessageForLanguage = new TableQuery(tag => new PromotionMessageForLanguage(tag))
  /** Entity class storing rows of table PromotionReceiversFilter
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param tenantId Database column tenant_id SqlType(BIGINT)
    *  @param name Database column name SqlType(VARCHAR), Length(200,true), Default(None)
    *  @param active Database column active SqlType(BIT), Default(Some(false)) */
  case class PromotionReceiversFilterRow(id: Long, tenantId: Long, name: Option[String] = None, active: Option[Boolean] = Some(false)) extends EntityAutoInc[Long, PromotionReceiversFilterRow]
  /** GetResult implicit for fetching PromotionReceiversFilterRow objects using plain SQL queries */
  implicit def GetResultPromotionReceiversFilterRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Boolean]]): GR[PromotionReceiversFilterRow] = GR{
    prs => import prs._
      PromotionReceiversFilterRow.tupled((<<[Long], <<[Long], <<?[String], <<?[Boolean]))
  }
  /** Table description of table promotion_receivers_filter. Objects of this class serve as prototypes for rows in queries. */
  class PromotionReceiversFilter(_tableTag: Tag) extends Table[PromotionReceiversFilterRow](_tableTag, "promotion_receivers_filter") with IdentifyableTable[Long] {
    def * = (id, tenantId, name, active) <> (PromotionReceiversFilterRow.tupled, PromotionReceiversFilterRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(tenantId), name, active).shaped.<>({r=>import r._; _1.map(_=> PromotionReceiversFilterRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column tenant_id SqlType(BIGINT) */
    val tenantId: Rep[Long] = column[Long]("tenant_id")
    /** Database column name SqlType(VARCHAR), Length(200,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(200,varying=true), O.Default(None))
    /** Database column active SqlType(BIT), Default(Some(false)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(false)))

    /** Foreign key referencing Tenant (database name promotion_receivers_filter_ibfk_1) */
    lazy val tenantFk = foreignKey("promotion_receivers_filter_ibfk_1", tenantId, Tenant)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PromotionReceiversFilter */
  lazy val PromotionReceiversFilter = new TableQuery(tag => new PromotionReceiversFilter(tag))


  /** Entity class storing rows of table PromotionReceiversFilterCombine
    *  @param firstPromotionReceiversFilterId Database column first_promotion_receivers_filter_id SqlType(BIGINT)
    *  @param secondPromotionReceiversFilterId Database column second_promotion_receivers_filter_id SqlType(BIGINT)
    *  @param id Database column id SqlType(BIGINT), PrimaryKey
    *  @param combineType Database column combine_type SqlType(CHAR), Length(3,false) */
  case class PromotionReceiversFilterCombineRow(firstPromotionReceiversFilterId: Long, secondPromotionReceiversFilterId: Long, id: Long, combineType: String) extends Entity[Long]
  /** GetResult implicit for fetching PromotionReceiversFilterCombineRow objects using plain SQL queries */
  implicit def GetResultPromotionReceiversFilterCombineRow(implicit e0: GR[Long], e1: GR[String]): GR[PromotionReceiversFilterCombineRow] = GR{
    prs => import prs._
      PromotionReceiversFilterCombineRow.tupled((<<[Long], <<[Long], <<[Long], <<[String]))
  }
  /** Table description of table promotion_receivers_filter_combine. Objects of this class serve as prototypes for rows in queries. */
  class PromotionReceiversFilterCombine(_tableTag: Tag) extends Table[PromotionReceiversFilterCombineRow](_tableTag, "promotion_receivers_filter_combine")  with IdentifyableTable[Long] {
    def * = (firstPromotionReceiversFilterId, secondPromotionReceiversFilterId, id, combineType) <> (PromotionReceiversFilterCombineRow.tupled, PromotionReceiversFilterCombineRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(firstPromotionReceiversFilterId), Rep.Some(secondPromotionReceiversFilterId), Rep.Some(id), Rep.Some(combineType)).shaped.<>({r=>import r._; _1.map(_=> PromotionReceiversFilterCombineRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column first_promotion_receivers_filter_id SqlType(BIGINT) */
    val firstPromotionReceiversFilterId: Rep[Long] = column[Long]("first_promotion_receivers_filter_id")
    /** Database column second_promotion_receivers_filter_id SqlType(BIGINT) */
    val secondPromotionReceiversFilterId: Rep[Long] = column[Long]("second_promotion_receivers_filter_id")
    /** Database column id SqlType(BIGINT), PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.PrimaryKey)
    /** Database column combine_type SqlType(CHAR), Length(3,false) */
    val combineType: Rep[String] = column[String]("combine_type", O.Length(3,varying=false))

    /** Foreign key referencing PromotionReceiversFilter (database name promotion_receivers_filter_combine_ibfk_1) */
    lazy val promotionReceiversFilterFk1 = foreignKey("promotion_receivers_filter_combine_ibfk_1", firstPromotionReceiversFilterId, PromotionReceiversFilter)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing PromotionReceiversFilter (database name promotion_receivers_filter_combine_ibfk_2) */
    lazy val promotionReceiversFilterFk2 = foreignKey("promotion_receivers_filter_combine_ibfk_2", firstPromotionReceiversFilterId, PromotionReceiversFilter)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing PromotionReceiversFilter (database name promotion_receivers_filter_combine_ibfk_3) */
    lazy val promotionReceiversFilterFk3 = foreignKey("promotion_receivers_filter_combine_ibfk_3", id, PromotionReceiversFilter)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PromotionReceiversFilterCombine */
  lazy val PromotionReceiversFilterCombine = new TableQuery(tag => new PromotionReceiversFilterCombine(tag))

  /** Entity class storing rows of table PromotionReceiversFilterSingle
    *  @param field Database column field SqlType(VARCHAR), Length(100,true)
    *  @param types Database column types SqlType(VARCHAR), Length(100,true)
    *  @param value Database column value SqlType(VARCHAR), Length(100,true)
    *  @param id Database column id SqlType(BIGINT), PrimaryKey */
  case class PromotionReceiversFilterSingleRow(field: String, types: String, value: String, id: Long) extends Entity[Long]
  /** GetResult implicit for fetching PromotionReceiversFilterSingleRow objects using plain SQL queries */
  implicit def GetResultPromotionReceiversFilterSingleRow(implicit e0: GR[String], e1: GR[Long]): GR[PromotionReceiversFilterSingleRow] = GR{
    prs => import prs._
      PromotionReceiversFilterSingleRow.tupled((<<[String], <<[String], <<[String], <<[Long]))
  }
  /** Table description of table promotion_receivers_filter_single. Objects of this class serve as prototypes for rows in queries. */
  class PromotionReceiversFilterSingle(_tableTag: Tag) extends Table[PromotionReceiversFilterSingleRow](_tableTag, "promotion_receivers_filter_single") with IdentifyableTable[Long] {
    def * = (field, types, value, id) <> (PromotionReceiversFilterSingleRow.tupled, PromotionReceiversFilterSingleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(field), Rep.Some(types), Rep.Some(value), Rep.Some(id)).shaped.<>({r=>import r._; _1.map(_=> PromotionReceiversFilterSingleRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column field SqlType(VARCHAR), Length(100,true) */
    val field: Rep[String] = column[String]("field", O.Length(100,varying=true))
    /** Database column types SqlType(VARCHAR), Length(100,true) */
    val types: Rep[String] = column[String]("types", O.Length(100,varying=true))
    /** Database column value SqlType(VARCHAR), Length(100,true) */
    val value: Rep[String] = column[String]("value", O.Length(100,varying=true))
    /** Database column id SqlType(BIGINT), PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.PrimaryKey)

    /** Foreign key referencing PromotionReceiversFilter (database name promotion_receivers_filter_single_ibfk_1) */
    lazy val promotionReceiversFilterFk = foreignKey("promotion_receivers_filter_single_ibfk_1", id, PromotionReceiversFilter)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PromotionReceiversFilterSingle */
  lazy val PromotionReceiversFilterSingle = new TableQuery(tag => new PromotionReceiversFilterSingle(tag))

  /** Entity class storing rows of table PromotionStage
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param promotionId Database column promotion_id SqlType(BIGINT)
    *  @param datetimeOfMessaging Database column datetime_of_messaging SqlType(DATETIME)
    *  @param onlyNonPurchasedUsers Database column only_non_purchased_users SqlType(VARCHAR), Length(200,true), Default(None)
    *  @param active Database column active SqlType(BIT), Default(Some(false)) */
  case class PromotionStageRow(id: Long, promotionId: Long, datetimeOfMessaging: java.sql.Timestamp, onlyNonPurchasedUsers: Option[String] = None, active: Option[Boolean] = Some(false)) extends EntityAutoInc[Long, PromotionStageRow]
  /** GetResult implicit for fetching PromotionStageRow objects using plain SQL queries */
  implicit def GetResultPromotionStageRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[String]], e3: GR[Option[Boolean]]): GR[PromotionStageRow] = GR{
    prs => import prs._
      PromotionStageRow.tupled((<<[Long], <<[Long], <<[java.sql.Timestamp], <<?[String], <<?[Boolean]))
  }
  /** Table description of table promotion_stage. Objects of this class serve as prototypes for rows in queries. */
  class PromotionStage(_tableTag: Tag) extends Table[PromotionStageRow](_tableTag, "promotion_stage") with IdentifyableTable[Long] {
    def * = (id, promotionId, datetimeOfMessaging, onlyNonPurchasedUsers, active) <> (PromotionStageRow.tupled, PromotionStageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(promotionId), Rep.Some(datetimeOfMessaging), onlyNonPurchasedUsers, active).shaped.<>({r=>import r._; _1.map(_=> PromotionStageRow.tupled((_1.get, _2.get, _3.get, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column promotion_id SqlType(BIGINT) */
    val promotionId: Rep[Long] = column[Long]("promotion_id")
    /** Database column datetime_of_messaging SqlType(DATETIME) */
    val datetimeOfMessaging: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("datetime_of_messaging")
    /** Database column only_non_purchased_users SqlType(VARCHAR), Length(200,true), Default(None) */
    val onlyNonPurchasedUsers: Rep[Option[String]] = column[Option[String]]("only_non_purchased_users", O.Length(200,varying=true), O.Default(None))
    /** Database column active SqlType(BIT), Default(Some(false)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(false)))

    /** Foreign key referencing Promotion (database name promotion_stage_ibfk_1) */
    lazy val promotionFk = foreignKey("promotion_stage_ibfk_1", promotionId, Promotion)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PromotionStage */
  lazy val PromotionStage = new TableQuery(tag => new PromotionStage(tag))

  /** Entity class storing rows of table SecurityPermission
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param value Database column value SqlType(VARCHAR), Length(255,true)
    *  @param modified Database column modified SqlType(DATETIME), Default(None) */
  case class SecurityPermissionRow(id: Long, value: String, modified: Option[java.sql.Timestamp] = None) extends EntityAutoInc[Long, SecurityPermissionRow] with Permission
  /** GetResult implicit for fetching SecurityPermissionRow objects using plain SQL queries */
  implicit def GetResultSecurityPermissionRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[java.sql.Timestamp]]): GR[SecurityPermissionRow] = GR{
    prs => import prs._
      SecurityPermissionRow.tupled((<<[Long], <<[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table security_permission. Objects of this class serve as prototypes for rows in queries. */
  class SecurityPermission(_tableTag: Tag) extends Table[SecurityPermissionRow](_tableTag, "security_permission") with IdentifyableTable[Long] {
    def * = (id, value, modified) <> (SecurityPermissionRow.tupled, SecurityPermissionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(value), modified).shaped.<>({r=>import r._; _1.map(_=> SecurityPermissionRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column value SqlType(VARCHAR), Length(255,true) */
    val value: Rep[String] = column[String]("value", O.Length(255,varying=true))
    /** Database column modified SqlType(DATETIME), Default(None) */
    val modified: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified", O.Default(None))
  }
  /** Collection-like TableQuery object for table SecurityPermission */
  lazy val SecurityPermission = new TableQuery(tag => new SecurityPermission(tag))

  /** Entity class storing rows of table SecurityRole
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param name Database column name SqlType(VARCHAR), Length(255,true) */
  case class SecurityRoleRow(id: Long, name: String) extends EntityAutoInc[Long, SecurityRoleRow] with Role
  /** GetResult implicit for fetching SecurityRoleRow objects using plain SQL queries */
  implicit def GetResultSecurityRoleRow(implicit e0: GR[Long], e1: GR[String]): GR[SecurityRoleRow] = GR{
    prs => import prs._
      SecurityRoleRow.tupled((<<[Long], <<[String]))
  }
  /** Table description of table security_role. Objects of this class serve as prototypes for rows in queries. */
  class SecurityRole(_tableTag: Tag) extends Table[SecurityRoleRow](_tableTag, "security_role")  with IdentifyableTable[Long] {
    def * = (id, name) <> (SecurityRoleRow.tupled, SecurityRoleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name)).shaped.<>({r=>import r._; _1.map(_=> SecurityRoleRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table SecurityRole */
  lazy val SecurityRole = new TableQuery(tag => new SecurityRole(tag))

  /** Entity class storing rows of table Tenant
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param name Database column name SqlType(VARCHAR), Length(200,true)
    *  @param email Database column email SqlType(VARCHAR), Length(100,true)
    *  @param phone Database column phone SqlType(VARCHAR), Length(20,true)
    *  @param addrLine1 Database column addr_line1 SqlType(VARCHAR), Length(100,true)
    *  @param addrLine2 Database column addr_line2 SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param addrLine3 Database column addr_line3 SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param addrLine4 Database column addr_line4 SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param city Database column city SqlType(VARCHAR), Length(100,true)
    *  @param state Database column state SqlType(VARCHAR), Length(100,true)
    *  @param country Database column country SqlType(VARCHAR), Length(100,true)
    *  @param postCode Database column post_code SqlType(VARCHAR), Length(100,true)
    *  @param smsSendingCode Database column sms_sending_code SqlType(VARCHAR), Length(100,true)
    *  @param website Database column website SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param status Database column status SqlType(BIT), Default(Some(false)) */
  case class TenantRow(id: Long, name: String, email: String, phone: String, addrLine1: String, addrLine2: Option[String] = None, addrLine3: Option[String] = None, addrLine4: Option[String] = None, city: String, state: String, country: String, postCode: String, smsSendingCode: String, website: Option[String] = None, status: Option[Boolean] = Some(false)) extends EntityAutoInc[Long, TenantRow]
  /** GetResult implicit for fetching TenantRow objects using plain SQL queries */
  implicit def GetResultTenantRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Boolean]]): GR[TenantRow] = GR{
    prs => import prs._
      TenantRow.tupled((<<[Long], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[Boolean]))
  }
  /** Table description of table tenant. Objects of this class serve as prototypes for rows in queries. */
  class Tenant(_tableTag: Tag) extends Table[TenantRow](_tableTag, "tenant") with IdentifyableTable[Long] {
    def * = (id, name, email, phone, addrLine1, addrLine2, addrLine3, addrLine4, city, state, country, postCode, smsSendingCode, website, status) <> (TenantRow.tupled, TenantRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(email), Rep.Some(phone), Rep.Some(addrLine1), addrLine2, addrLine3, addrLine4, Rep.Some(city), Rep.Some(state), Rep.Some(country), Rep.Some(postCode), Rep.Some(smsSendingCode), website, status).shaped.<>({r=>import r._; _1.map(_=> TenantRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7, _8, _9.get, _10.get, _11.get, _12.get, _13.get, _14, _15)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(200,true) */
    val name: Rep[String] = column[String]("name", O.Length(200,varying=true))
    /** Database column email SqlType(VARCHAR), Length(100,true) */
    val email: Rep[String] = column[String]("email", O.Length(100,varying=true))
    /** Database column phone SqlType(VARCHAR), Length(20,true) */
    val phone: Rep[String] = column[String]("phone", O.Length(20,varying=true))
    /** Database column addr_line1 SqlType(VARCHAR), Length(100,true) */
    val addrLine1: Rep[String] = column[String]("addr_line1", O.Length(100,varying=true))
    /** Database column addr_line2 SqlType(VARCHAR), Length(100,true), Default(None) */
    val addrLine2: Rep[Option[String]] = column[Option[String]]("addr_line2", O.Length(100,varying=true), O.Default(None))
    /** Database column addr_line3 SqlType(VARCHAR), Length(100,true), Default(None) */
    val addrLine3: Rep[Option[String]] = column[Option[String]]("addr_line3", O.Length(100,varying=true), O.Default(None))
    /** Database column addr_line4 SqlType(VARCHAR), Length(100,true), Default(None) */
    val addrLine4: Rep[Option[String]] = column[Option[String]]("addr_line4", O.Length(100,varying=true), O.Default(None))
    /** Database column city SqlType(VARCHAR), Length(100,true) */
    val city: Rep[String] = column[String]("city", O.Length(100,varying=true))
    /** Database column state SqlType(VARCHAR), Length(100,true) */
    val state: Rep[String] = column[String]("state", O.Length(100,varying=true))
    /** Database column country SqlType(VARCHAR), Length(100,true) */
    val country: Rep[String] = column[String]("country", O.Length(100,varying=true))
    /** Database column post_code SqlType(VARCHAR), Length(100,true) */
    val postCode: Rep[String] = column[String]("post_code", O.Length(100,varying=true))
    /** Database column sms_sending_code SqlType(VARCHAR), Length(100,true) */
    val smsSendingCode: Rep[String] = column[String]("sms_sending_code", O.Length(100,varying=true))
    /** Database column website SqlType(VARCHAR), Length(100,true), Default(None) */
    val website: Rep[Option[String]] = column[Option[String]]("website", O.Length(100,varying=true), O.Default(None))
    /** Database column status SqlType(BIT), Default(Some(false)) */
    val status: Rep[Option[Boolean]] = column[Option[Boolean]]("status", O.Default(Some(false)))
  }
  /** Collection-like TableQuery object for table Tenant */
  lazy val Tenant = new TableQuery(tag => new Tenant(tag))

  /** Entity class storing rows of table TenantCustomer
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param tenantId Database column tenant_id SqlType(BIGINT)
    *  @param title Database column title SqlType(VARCHAR), Length(10,true), Default(None)
    *  @param firstName Database column first_name SqlType(VARCHAR), Length(200,true)
    *  @param lastName Database column last_name SqlType(VARCHAR), Length(200,true)
    *  @param storeName Database column store_name SqlType(VARCHAR), Length(200,true), Default(None)
    *  @param email Database column email SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param phone Database column phone SqlType(VARCHAR), Length(20,true)
    *  @param addrLine1 Database column addr_line1 SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param addrLine2 Database column addr_line2 SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param addrLine3 Database column addr_line3 SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param addrLine4 Database column addr_line4 SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param city Database column city SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param state Database column state SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param country Database column country SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param postCode Database column post_code SqlType(VARCHAR), Length(100,true), Default(None)
    *  @param sex Database column sex SqlType(CHAR), Default(None)
    *  @param dob Database column dob SqlType(DATE), Default(None)
    *  @param maritalStatus Database column marital_status SqlType(CHAR), Default(None)
    *  @param numChildren Database column num_children SqlType(INT), Default(None)
    *  @param childrenAge Database column children_age SqlType(INT), Default(None)
    *  @param active Database column active SqlType(BIT), Default(Some(false)) */
  case class TenantCustomerRow(id: Long, tenantId: Long, title: Option[String] = None, firstName: String, lastName: String, storeName: Option[String] = None, email: Option[String] = None, phone: String, addrLine1: Option[String] = None, addrLine2: Option[String] = None, addrLine3: Option[String] = None, addrLine4: Option[String] = None, city: Option[String] = None, state: Option[String] = None, country: Option[String] = None, postCode: Option[String] = None, sex: Option[Char] = None, dob: Option[java.sql.Date] = None, maritalStatus: Option[Char] = None, numChildren: Option[Int] = None, childrenAge: Option[Int] = None, active: Option[Boolean] = Some(false)) extends EntityAutoInc[Long, TenantCustomerRow]
  /** GetResult implicit for fetching TenantCustomerRow objects using plain SQL queries */
  implicit def GetResultTenantCustomerRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[String], e3: GR[Char], e4: GR[java.sql.Date], e5: GR[Option[Char]], e6: GR[Option[Int]], e7: GR[Option[Boolean]]): GR[TenantCustomerRow] = GR{
    prs => import prs._
      TenantCustomerRow.tupled((<<[Long], <<[Long], <<?[String], <<[String], <<[String], <<?[String], <<?[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Char], <<?[java.sql.Date], <<?[Char], <<?[Int], <<?[Int], <<?[Boolean]))
  }
  /** Table description of table tenant_customer. Objects of this class serve as prototypes for rows in queries. */
  class TenantCustomer(_tableTag: Tag) extends Table[TenantCustomerRow](_tableTag, "tenant_customer") with IdentifyableTable[Long] {
    def * = (id, tenantId, title, firstName, lastName, storeName, email, phone, addrLine1, addrLine2, addrLine3, addrLine4, city, state, country, postCode, sex, dob, maritalStatus, numChildren, childrenAge, active) <> (TenantCustomerRow.tupled, TenantCustomerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(tenantId), title, Rep.Some(firstName), Rep.Some(lastName), storeName, email, Rep.Some(phone), addrLine1, addrLine2, addrLine3, addrLine4, city, state, country, postCode, sex, dob, maritalStatus, numChildren, childrenAge, active).shaped.<>({r=>import r._; _1.map(_=> TenantCustomerRow.tupled((_1.get, _2.get, _3, _4.get, _5.get, _6, _7, _8.get, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column tenant_id SqlType(BIGINT) */
    val tenantId: Rep[Long] = column[Long]("tenant_id")
    /** Database column title SqlType(VARCHAR), Length(10,true), Default(None) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(10,varying=true), O.Default(None))
    /** Database column first_name SqlType(VARCHAR), Length(200,true) */
    val firstName: Rep[String] = column[String]("first_name", O.Length(200,varying=true))
    /** Database column last_name SqlType(VARCHAR), Length(200,true) */
    val lastName: Rep[String] = column[String]("last_name", O.Length(200,varying=true))
    /** Database column store_name SqlType(VARCHAR), Length(200,true), Default(None) */
    val storeName: Rep[Option[String]] = column[Option[String]]("store_name", O.Length(200,varying=true), O.Default(None))
    /** Database column email SqlType(VARCHAR), Length(100,true), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Length(100,varying=true), O.Default(None))
    /** Database column phone SqlType(VARCHAR), Length(20,true) */
    val phone: Rep[String] = column[String]("phone", O.Length(20,varying=true))
    /** Database column addr_line1 SqlType(VARCHAR), Length(100,true), Default(None) */
    val addrLine1: Rep[Option[String]] = column[Option[String]]("addr_line1", O.Length(100,varying=true), O.Default(None))
    /** Database column addr_line2 SqlType(VARCHAR), Length(100,true), Default(None) */
    val addrLine2: Rep[Option[String]] = column[Option[String]]("addr_line2", O.Length(100,varying=true), O.Default(None))
    /** Database column addr_line3 SqlType(VARCHAR), Length(100,true), Default(None) */
    val addrLine3: Rep[Option[String]] = column[Option[String]]("addr_line3", O.Length(100,varying=true), O.Default(None))
    /** Database column addr_line4 SqlType(VARCHAR), Length(100,true), Default(None) */
    val addrLine4: Rep[Option[String]] = column[Option[String]]("addr_line4", O.Length(100,varying=true), O.Default(None))
    /** Database column city SqlType(VARCHAR), Length(100,true), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Length(100,varying=true), O.Default(None))
    /** Database column state SqlType(VARCHAR), Length(100,true), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Length(100,varying=true), O.Default(None))
    /** Database column country SqlType(VARCHAR), Length(100,true), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Length(100,varying=true), O.Default(None))
    /** Database column post_code SqlType(VARCHAR), Length(100,true), Default(None) */
    val postCode: Rep[Option[String]] = column[Option[String]]("post_code", O.Length(100,varying=true), O.Default(None))
    /** Database column sex SqlType(CHAR), Default(None) */
    val sex: Rep[Option[Char]] = column[Option[Char]]("sex", O.Default(None))
    /** Database column dob SqlType(DATE), Default(None) */
    val dob: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("dob", O.Default(None))
    /** Database column marital_status SqlType(CHAR), Default(None) */
    val maritalStatus: Rep[Option[Char]] = column[Option[Char]]("marital_status", O.Default(None))
    /** Database column num_children SqlType(INT), Default(None) */
    val numChildren: Rep[Option[Int]] = column[Option[Int]]("num_children", O.Default(None))
    /** Database column children_age SqlType(INT), Default(None) */
    val childrenAge: Rep[Option[Int]] = column[Option[Int]]("children_age", O.Default(None))
    /** Database column active SqlType(BIT), Default(Some(false)) */
    val active: Rep[Option[Boolean]] = column[Option[Boolean]]("active", O.Default(Some(false)))

    /** Foreign key referencing Tenant (database name tenant_customer_ibfk_1) */
    lazy val tenantFk = foreignKey("tenant_customer_ibfk_1", tenantId, Tenant)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table TenantCustomer */
  lazy val TenantCustomer = new TableQuery(tag => new TenantCustomer(tag))

  /** Entity class storing rows of table TokenAction
    *  @param userId Database column user_id SqlType(BIGINT)
    *  @param token Database column token SqlType(VARCHAR), Length(255,true)
    *  @param `type` Database column type SqlType(CHAR), Length(2,false)
    *  @param created Database column created SqlType(DATETIME)
    *  @param expires Database column expires SqlType(DATETIME)
    *  @param modified Database column modified SqlType(DATETIME), Default(None) */
  case class TokenActionRow(userId: Long, token: String, `type`: String, created: java.sql.Timestamp, expires: java.sql.Timestamp, modified: Option[java.sql.Timestamp] = None) extends Entity[Long] { override def id = userId }
  /** GetResult implicit for fetching TokenActionRow objects using plain SQL queries */
  implicit def GetResultTokenActionRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[java.sql.Timestamp]]): GR[TokenActionRow] = GR{
    prs => import prs._
      TokenActionRow.tupled((<<[Long], <<[String], <<[String], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[java.sql.Timestamp]))
  }
  /** Table description of table token_action. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class TokenAction(_tableTag: Tag) extends Table[TokenActionRow](_tableTag, "token_action") with IdentifyableTable[Long] {
    override def id = userId
    def * = (userId, token, `type`, created, expires, modified) <> (TokenActionRow.tupled, TokenActionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userId), Rep.Some(token), Rep.Some(`type`), Rep.Some(created), Rep.Some(expires), modified).shaped.<>({r=>import r._; _1.map(_=> TokenActionRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_id SqlType(BIGINT) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column token SqlType(VARCHAR), Length(255,true) */
    val token: Rep[String] = column[String]("token", O.Length(255,varying=true))
    /** Database column type SqlType(CHAR), Length(2,false)
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type", O.Length(2,varying=false))
    /** Database column created SqlType(DATETIME) */
    val created: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created")
    /** Database column expires SqlType(DATETIME) */
    val expires: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("expires")
    /** Database column modified SqlType(DATETIME), Default(None) */
    val modified: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified", O.Default(None))

    /** Foreign key referencing User (database name token_action_ibfk_1) */
    lazy val userFk = foreignKey("token_action_ibfk_1", userId, User)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (token) (database name token) */
    val index1 = index("token", token, unique=true)
  }
  /** Collection-like TableQuery object for table TokenAction */
  lazy val TokenAction = new TableQuery(tag => new TokenAction(tag))

  /** Entity class storing rows of table User
    *  @param id Database column id SqlType(BIGINT), AutoInc, PrimaryKey
    *  @param tenantId Database column tenant_id SqlType(BIGINT)
    *  @param firstName Database column first_name SqlType(VARCHAR), Length(50,true), Default(None)
    *  @param middleName Database column middle_name SqlType(VARCHAR), Length(50,true), Default(None)
    *  @param lastName Database column last_name SqlType(VARCHAR), Length(50,true), Default(None)
    *  @param dateOfBirth Database column date_of_birth SqlType(DATE), Default(None)
    *  @param username Database column username SqlType(VARCHAR), Length(100,true)
    *  @param email Database column email SqlType(VARCHAR), Length(100,true)
    *  @param lastLogin Database column last_login SqlType(DATETIME), Default(None)
    *  @param active Database column active SqlType(BIT), Default(false)
    *  @param emailValidated Database column email_validated SqlType(BIT), Default(false)
    *  @param modified Database column modified SqlType(DATETIME), Default(None) */
  case class UserRow(id: Long, tenantId: Long, firstName: Option[String] = None, middleName: Option[String] = None, lastName: Option[String] = None, dateOfBirth: Option[java.sql.Date] = None, username: String, email: String, lastLogin: Option[java.sql.Timestamp] = None, active: Boolean = false, emailValidated: Boolean = false, modified: Option[java.sql.Timestamp] = None) extends EntityAutoInc[Long, UserRow]
  /** GetResult implicit for fetching UserRow objects using plain SQL queries */
  implicit def GetResultUserRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Date]], e3: GR[String], e4: GR[Option[java.sql.Timestamp]], e5: GR[Boolean]): GR[UserRow] = GR{
    prs => import prs._
      UserRow.tupled((<<[Long], <<[Long], <<?[String], <<?[String], <<?[String], <<?[java.sql.Date], <<[String], <<[String], <<?[java.sql.Timestamp], <<[Boolean], <<[Boolean], <<?[java.sql.Timestamp]))
  }
  /** Table description of table user. Objects of this class serve as prototypes for rows in queries. */
  class User(_tableTag: Tag) extends Table[UserRow](_tableTag, "user") with IdentifyableTable[Long] {
    def * = (id, tenantId, firstName, middleName, lastName, dateOfBirth, username, email, lastLogin, active, emailValidated, modified) <> (UserRow.tupled, UserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(tenantId), firstName, middleName, lastName, dateOfBirth, Rep.Some(username), Rep.Some(email), lastLogin, Rep.Some(active), Rep.Some(emailValidated), modified).shaped.<>({r=>import r._; _1.map(_=> UserRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7.get, _8.get, _9, _10.get, _11.get, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(BIGINT), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column tenant_id SqlType(BIGINT) */
    val tenantId: Rep[Long] = column[Long]("tenant_id")
    /** Database column first_name SqlType(VARCHAR), Length(50,true), Default(None) */
    val firstName: Rep[Option[String]] = column[Option[String]]("first_name", O.Length(50,varying=true), O.Default(None))
    /** Database column middle_name SqlType(VARCHAR), Length(50,true), Default(None) */
    val middleName: Rep[Option[String]] = column[Option[String]]("middle_name", O.Length(50,varying=true), O.Default(None))
    /** Database column last_name SqlType(VARCHAR), Length(50,true), Default(None) */
    val lastName: Rep[Option[String]] = column[Option[String]]("last_name", O.Length(50,varying=true), O.Default(None))
    /** Database column date_of_birth SqlType(DATE), Default(None) */
    val dateOfBirth: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("date_of_birth", O.Default(None))
    /** Database column username SqlType(VARCHAR), Length(100,true) */
    val username: Rep[String] = column[String]("username", O.Length(100,varying=true))
    /** Database column email SqlType(VARCHAR), Length(100,true) */
    val email: Rep[String] = column[String]("email", O.Length(100,varying=true))
    /** Database column last_login SqlType(DATETIME), Default(None) */
    val lastLogin: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_login", O.Default(None))
    /** Database column active SqlType(BIT), Default(false) */
    val active: Rep[Boolean] = column[Boolean]("active", O.Default(false))
    /** Database column email_validated SqlType(BIT), Default(false) */
    val emailValidated: Rep[Boolean] = column[Boolean]("email_validated", O.Default(false))
    /** Database column modified SqlType(DATETIME), Default(None) */
    val modified: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified", O.Default(None))

    /** Foreign key referencing Tenant (database name user_ibfk_1) */
    lazy val tenantFk = foreignKey("user_ibfk_1", tenantId, Tenant)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table User */
  lazy val User = new TableQuery(tag => new User(tag))

  /** Entity class storing rows of table UserSecurityPermission
    *  @param userId Database column user_id SqlType(BIGINT)
    *  @param securityPermissionId Database column security_permission_id SqlType(BIGINT)
    *  @param modified Database column modified SqlType(DATETIME), Default(None) */
  case class UserSecurityPermissionRow(userId: Long, securityPermissionId: Long, modified: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching UserSecurityPermissionRow objects using plain SQL queries */
  implicit def GetResultUserSecurityPermissionRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]]): GR[UserSecurityPermissionRow] = GR{
    prs => import prs._
      UserSecurityPermissionRow.tupled((<<[Long], <<[Long], <<?[java.sql.Timestamp]))
  }
  /** Table description of table user_security_permission. Objects of this class serve as prototypes for rows in queries. */
  class UserSecurityPermission(_tableTag: Tag) extends Table[UserSecurityPermissionRow](_tableTag, "user_security_permission") {
    def * = (userId, securityPermissionId, modified) <> (UserSecurityPermissionRow.tupled, UserSecurityPermissionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userId), Rep.Some(securityPermissionId), modified).shaped.<>({r=>import r._; _1.map(_=> UserSecurityPermissionRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_id SqlType(BIGINT) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column security_permission_id SqlType(BIGINT) */
    val securityPermissionId: Rep[Long] = column[Long]("security_permission_id")
    /** Database column modified SqlType(DATETIME), Default(None) */
    val modified: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified", O.Default(None))

    /** Primary key of UserSecurityPermission (database name user_security_permission_PK) */
    val pk = primaryKey("user_security_permission_PK", (userId, securityPermissionId))

    /** Foreign key referencing SecurityPermission (database name user_security_permission_ibfk_2) */
    lazy val securityPermissionFk = foreignKey("user_security_permission_ibfk_2", securityPermissionId, SecurityPermission)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing User (database name user_security_permission_ibfk_1) */
    lazy val userFk = foreignKey("user_security_permission_ibfk_1", userId, User)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table UserSecurityPermission */
  lazy val UserSecurityPermission = new TableQuery(tag => new UserSecurityPermission(tag))

  /** Entity class storing rows of table UserSecurityRole
    *  @param userId Database column user_id SqlType(BIGINT)
    *  @param securityRoleId Database column security_role_id SqlType(BIGINT)
    *  @param modified Database column modified SqlType(DATETIME), Default(None) */
  case class UserSecurityRoleRow(userId: Long, securityRoleId: Long, modified: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching UserSecurityRoleRow objects using plain SQL queries */
  implicit def GetResultUserSecurityRoleRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]]): GR[UserSecurityRoleRow] = GR{
    prs => import prs._
      UserSecurityRoleRow.tupled((<<[Long], <<[Long], <<?[java.sql.Timestamp]))
  }
  /** Table description of table user_security_role. Objects of this class serve as prototypes for rows in queries. */
  class UserSecurityRole(_tableTag: Tag) extends Table[UserSecurityRoleRow](_tableTag, "user_security_role") {
    def * = (userId, securityRoleId, modified) <> (UserSecurityRoleRow.tupled, UserSecurityRoleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userId), Rep.Some(securityRoleId), modified).shaped.<>({r=>import r._; _1.map(_=> UserSecurityRoleRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_id SqlType(BIGINT) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column security_role_id SqlType(BIGINT) */
    val securityRoleId: Rep[Long] = column[Long]("security_role_id")
    /** Database column modified SqlType(DATETIME), Default(None) */
    val modified: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("modified", O.Default(None))

    /** Primary key of UserSecurityRole (database name user_security_role_PK) */
    val pk = primaryKey("user_security_role_PK", (userId, securityRoleId))

    /** Foreign key referencing SecurityRole (database name user_security_role_ibfk_2) */
    lazy val securityRoleFk = foreignKey("user_security_role_ibfk_2", securityRoleId, SecurityRole)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing User (database name user_security_role_ibfk_1) */
    lazy val userFk = foreignKey("user_security_role_ibfk_1", userId, User)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table UserSecurityRole */
  lazy val UserSecurityRole = new TableQuery(tag => new UserSecurityRole(tag))
}