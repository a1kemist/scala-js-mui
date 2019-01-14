package com.kemesoft.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait SpacingOptions extends js.Object {
    def unit: js.UndefOr[Double] = js.native
}

object SpacingOptions {
    def apply(unit: Option[Double]) = {
        val o: Map[String, Any] = unit.map("unit" -> _).toMap
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[SpacingOptions]
    }
}