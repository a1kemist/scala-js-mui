package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/input-label/
  */
object MuiInputLabel extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/InputLabel", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              disableAnimation: Option[Boolean] = Some(false),
              disabled: Option[Boolean] = None,
              error: Option[Boolean] = None,
              focused: Option[Boolean] = None,
              FormLabelClasses: Option[js.Object] = None,
              margin: Option[String] = None,
              required: Option[Boolean] = None,
              shrink: Option[Boolean] = None
             ): WithProps = auto
}
