package io.github.mattshen.pghttp4s.repository

import doobie.util.query.Query0
import doobie.implicits._

trait Specification[T] {
  def toQuery: Query0[T]
}

object getAllTasksSpecification extends Specification[Task] {
  def toQuery: Query0[Task] =
    sql"select * from task".query[Task]
}


