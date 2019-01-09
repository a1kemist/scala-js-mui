package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui.com/api/card-actions
  */
object MuiCardActions extends ReactBridgeComponent {
    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/CardActions", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              disableActionSpacing: Option[Boolean] = Some(false)): WithProps = auto
}