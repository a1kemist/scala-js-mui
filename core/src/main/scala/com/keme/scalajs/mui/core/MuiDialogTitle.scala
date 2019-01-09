package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/dialog/
  */
object MuiDialogTitle extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/DialogTitle", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
              disableTypography: Option[Boolean] = Some(false)
             ): WithProps = auto

}