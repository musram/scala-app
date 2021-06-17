package dao.generic

import generated.Tables.LinkedAccount
import generated.Tables.profile.api._
import play.api.db.slick._
import slick.lifted.CanBeQueryCondition

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._

/**
  * Generic DAO implementation
  */
abstract class GenericDaoImpl[T <: Table[E] with IdentifyableTable[PK], E <: Entity[PK], PK: BaseColumnType]
    (dbConfigProvider: DatabaseConfigProvider, tableQuery: TableQuery[T]) extends GenericDao[T, E, PK] {
  //------------------------------------------------------------------------
  // public
  //------------------------------------------------------------------------
  /**
    * Returns the row count for this Model
    * @return the row count for this Model
    */
  override def count(): Future[Int] = db.run(tableQuery.length.result)

  //------------------------------------------------------------------------
  /**
    * Returns the matching entity for the given id
    * @param id identifier
    * @return the matching entity for the given id
    */
  override def findById(id: PK): Future[Option[E]] = db.run(tableQuery.filter(_.id === id).result.headOption)

  //------------------------------------------------------------------------
  /**
    * Returns all entities in this model
    * @return all entities in this model
    */
  override def findAll(): Future[Seq[E]] = db.run(tableQuery.result)

  //------------------------------------------------------------------------
  /**
    * Returns entities that satisfy the filter expression.
    * @param expr input filter expression
    * @param wt
    * @tparam C
    * @return entities that satisfy the filter expression.
    */
  override def filter[C <: Rep[_]](expr: T => C)(implicit wt: CanBeQueryCondition[C]) : Future[Seq[E]] =
    db.run(tableQuery.filter(expr).result)

  //------------------------------------------------------------------------
  /**
    * Returns newly created entity
    * @param entity entity to create, input id is ignored
    * @return newly created entity
    */
  override def create(entity: E): Future[Unit] = {
    val action = (tableQuery += entity)
    db.run(action).map(_ => ())
  }

  //------------------------------------------------------------------------
  /**
    * Returns number of inserted entities
    * @param entities to be inserted
    * @return number of inserted entities
    */
  override def create(entities: Seq[E]): Future[Unit] = db.run(tableQuery ++= entities).map(_ => ())

  //------------------------------------------------------------------------
  /**
    * Updates the given entity and returns a Future
    * @param update Entity to update (by id)
    * @return returns a Future
    */
  override def update(update: E): Future[Unit] = {
    db.run(tableQuery.filter(_.id === update.id).update(update)).map(_ => ())
  }

  //------------------------------------------------------------------------
  /**
    * Deletes the given entity by Id and returns a Future
    * @param id The Id to delete
    * @return returns a Future
    */
  override def delete(id: PK): Future[Unit] = db.run(tableQuery.filter(_.id === id).delete).map(_ => ())

  //------------------------------------------------------------------------
  /**
    * Deletes the given entity by Id and returns a Future
    * @return returns a Future
    */
  override def deleteAll: Future[Unit] = db.run(sqlu"""TRUNCATE TABLE "#${tableQuery.baseTableRow.tableName}" RESTART IDENTITY CASCADE""").map(_ => ())
}
