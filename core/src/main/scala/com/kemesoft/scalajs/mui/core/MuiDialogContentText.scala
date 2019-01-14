package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/dialog/
  */
object MuiDialogContentText extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/DialogContentText", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
             ): WithProps = auto

}