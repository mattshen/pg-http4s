package io.github.mattshen.pghttp4s.repository

trait Repository[T] {
  def add(item: T)
  def update(item: T)
  def remove(itme: T)
  def query(spec: Specification[T]): Vector[T]
}
