package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/list/
  */
object MuiList extends ReactBridgeComponent {
    import JsWriterImplicits.vdomNodeWriter
    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/List", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = Some("ul"),
              dense: Option[Boolean] = Some(false),
              disablePadding: Option[Boolean] = Some(false),
              subheader: Option[VdomNode] = None): WithProps = auto
}