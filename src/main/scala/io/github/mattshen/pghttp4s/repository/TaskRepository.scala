package io.github.mattshen.pghttp4s.repository

import java.sql.Date

import cats.effect.IO
import doobie.implicits._
import doobie.util.transactor.Transactor


case class Task(id: Int, subject: String,
                description: String,
                createOn: Date, createBy: Int,
                points: Int, assignee: String)

case class TaskRepository(xa: Transactor[IO]) extends Repository[Task] {
  override def add(item: Task): Unit = throw new Exception("not implemented")

  override def update(item: Task): Unit = throw new Exception("not implemented")

  override def remove(itme: Task): Unit = throw new Exception("not implemented")

  override def query(spec: Specification[Task]): Vector[Task] = {
    spec.toQuery.process.vector.transact(xa).unsafeRunSync()
  }
}

object TaskRepository extends TaskRepository(DBConfig.xa)