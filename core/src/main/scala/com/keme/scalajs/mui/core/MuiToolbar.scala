package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/toolbar/
  */

object MuiToolbar extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Toolbar/Toolbar", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
              disableGutters: Boolean = false
             ): WithProps = auto
}