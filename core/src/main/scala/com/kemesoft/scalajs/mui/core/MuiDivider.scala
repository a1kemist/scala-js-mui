package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/divider/
  */
object MuiDivider extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Divider", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(absolute: Option[Boolean] = Some(false),
              classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = Some("hr"),
              inset: Option[Boolean] = Some(false),
              light: Option[Boolean] = Some(false)): WithProps = auto
}