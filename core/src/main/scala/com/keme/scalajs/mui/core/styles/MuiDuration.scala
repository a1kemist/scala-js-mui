package com.keme.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait MuiDuration extends js.Object {
    def shortest: Int = js.native
    def shorter: Int = js.native
    def short: Int = js.native
    def standard: Int = js.native
    def complex: Int = js.native
    def enteringScreen: Int = js.native
    def leavingScreen: Int = js.native
}

object MuiDuration {
    def apply(shortest: Int,
              shorter: Int,
              short: Int,
              standard: Int,
              complex: Int,
              enteringScreen: Int,
              leavingScreen: Int): MuiDuration = {
        val o: Map[String, Any] = Map(
                "shortest" -> shortest,
                "shorter" -> shorter,
                "short" -> short,
                "standard" -> standard,
                "complex" -> complex,
                "enteringScreen" -> enteringScreen,
                "leavingScreen" -> leavingScreen
        )
        
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiDuration]
    }
}