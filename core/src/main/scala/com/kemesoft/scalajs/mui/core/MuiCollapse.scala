package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/collapse/
  */
object MuiCollapse extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Collapse", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              collapsedHeight: Option[String] = Some("0px"),
              component: Option[String | js.Function] = Some("div"),
              in: Option[Boolean] = None
              // timeout: Option[Int | js.Object | String] = None
             ): WithProps = auto
}