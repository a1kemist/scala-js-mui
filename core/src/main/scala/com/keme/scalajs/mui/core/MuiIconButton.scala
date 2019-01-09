package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/icon-button/
  */
object MuiIconButton extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/IconButton/IconButton", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
              color: Option[String] = Some("default"),
              disabled: Option[Boolean] = Some(false),
              disableRipple: Option[Boolean] = Some(false)
             ): WithProps = auto
}