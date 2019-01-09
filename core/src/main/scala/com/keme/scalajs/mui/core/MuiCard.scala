package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui.com/api/card/
  */
object MuiCard extends ReactBridgeComponent {
    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Card", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              raised: Option[Boolean] = Some(false)): WithProps = auto
}