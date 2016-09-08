package webapp

import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object LearningApp extends JSApp{
  @JSExport
  override def main(): Unit = {
    jQuery("body").append("<p>Hello World</p>")
  }

  @JSExport
  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }
}
