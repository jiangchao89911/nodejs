package io.scalajs.nodejs.timers

import scala.scalajs.js

/**
  * Timeout Object
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait Timeout extends js.Object {

  /**
    * Indicates whether the timeout has been called
    * @return true, if the timeout has already been called
    */
  def _called: Boolean = js.native

}