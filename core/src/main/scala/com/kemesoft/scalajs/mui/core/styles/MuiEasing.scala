package com.kemesoft.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiEasing extends  js.Object {
    def easeInOut: String = js.native
    def easeOut: String = js.native
    def easeIn: String = js.native
    def sharp: String = js.native
}

object MuiEasing {
    def apply(easeInOut: String, easeOut: String, easeIn: String, sharp: String): MuiEasing = {
        val o: Map[String, Any] = Map(
            "easeInOut" -> easeInOut,
            "easeOut" -> easeOut,
            "easeIn" -> easeIn,
            "sharp" -> sharp
        )

        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiEasing]
    }
}