package com.keme.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.JSConverters._

@js.native
trait MuiTransitionOptions extends js.Object {
    def prop: js.UndefOr[String] = js.native
    def duration: js.UndefOr[Int | String]  = js.native
    def easing: js.UndefOr[String]  = js.native
    def delay: js.UndefOr[Int | String]  = js.native
}

object MuiTransitionOptions {
    def apply(prop: js.UndefOr[String] = js.undefined,
              duration: js.UndefOr[Int | String]  = js.undefined,
              easing: js.UndefOr[String]  = js.undefined,
              delay: js.UndefOr[Int | String]  = js.undefined): MuiTransitionOptions = {
        val o: Map[String, Any] = Map(
            "prop" -> prop,
            "duration" -> duration,
            "easing" -> easing,
            "delay" -> delay
        )

        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiTransitionOptions]
    }
}
