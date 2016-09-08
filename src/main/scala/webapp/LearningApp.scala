package webapp

import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp

object LearningApp extends JSApp{
  override def main(): Unit = {
    jQuery(setupUI _)
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
  }
}
