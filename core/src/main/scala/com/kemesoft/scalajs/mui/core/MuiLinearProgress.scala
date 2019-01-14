package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/progress/
  */
object MuiLinearProgress extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/LinearProgress", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              color: Option[String] = Some("primary"),
              value: Option[Int] = None,
              valueBuffer: Option[Int] = None,
              variant: Option[String] = Some("indeterminate")
            ): WithProps = auto
}