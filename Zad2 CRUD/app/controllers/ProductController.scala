package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class ProductController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def get(prodId: String) = Action {
    Ok("")
  }

  def getAll = Action {
    Ok("")
  }

  def add = Action {
    Ok("")
  }

  def delete(prodId: String) = Action {
    Ok("")
  }

  def update(prodId: String) = Action {
    Ok("")
  }

}
