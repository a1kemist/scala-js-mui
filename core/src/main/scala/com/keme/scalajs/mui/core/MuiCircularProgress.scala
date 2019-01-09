package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/progress/
  */

object MuiCircularProgress extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/CircularProgress", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
              color: Option[String] = Some("primary"),
              size: Option[Int | String] = Some(40),
              style: Option[js.Object] = None,
              thickness: Option[Double] = Some(3.6),
              value: Option[Int] = Some(0),
              variant: Option[String] = Some("indeterminate")
             ): WithProps = auto

}