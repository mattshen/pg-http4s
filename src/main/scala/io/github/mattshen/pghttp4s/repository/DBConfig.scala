package io.github.mattshen.pghttp4s.repository

import cats.effect.IO
import doobie._

object DBConfig {
  val xa = Transactor.fromDriverManager[IO](
    "com.mysql.jdbc.Driver", "jdbc:mysql://localhost/awtest", "root", ""
  )
}
