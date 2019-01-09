package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui.com/api/card-content/
  */
object MuiCardContent extends ReactBridgeComponent {
    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/CardContent", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = Some("div")): WithProps = auto
}