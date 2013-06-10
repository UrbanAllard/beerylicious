package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Hola!"))
  }
  // -- Javascript routing

  def javascriptRoutes = Action { implicit request =>
    NotImplemented
    /*import routes.javascript._
    Ok(
      Routes.javascriptRouter("jsRoutes")(

      )
    ).as("text/javascript")
  }  */

}


}