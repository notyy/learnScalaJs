package webapp

import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {
  def main(args: Array[String]): Unit = {
    jQuery("body").append("<p>Hello World</p>")
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    jQuery("body").append("You clicked the button!")
  }
}
