package com.kemesoft.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Spacing extends js.Object {
    def unit: Double = js.native
}

object Spacing {
    def apply(unit: Double) = {
        val o: Map[String, Any] = Map("unit" -> unit)
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Spacing]
    }
}
