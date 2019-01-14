package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui.com/api/click-away-listener/
  */
object MuiClickAwayListener extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/ClickAwayListener", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(mouseEvent: Option[String] = Some("onMouseUp"),
              onClickAway: js.Function,
              touchEvent: Option[String] = Some("onTouchEnd")
             ): WithProps = auto
}