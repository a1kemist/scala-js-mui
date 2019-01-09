package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui.com/api/card-header/
  */
object MuiCardHeader extends ReactBridgeComponent {
    import JsWriterImplicits.vdomNodeWriter

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/CardHeader", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(action: Option[VdomNode] = None,
              avatar: Option[VdomNode] = None,
              classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = Some("div"),
              subheader: Option[VdomNode] = None,
              title: Option[VdomNode] = None): WithProps = auto
}