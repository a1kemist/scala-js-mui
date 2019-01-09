package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/expansion-panels/
  */
object MuiExpansionPanelSummary extends ReactBridgeComponent {
    import JsWriterImplicits.vdomNodeWriter

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/ExpansionPanelSummary", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              disabled: Option[Boolean] = Some(false),
              expanded: Option[Boolean] = None,
              expandIcon: Option[VdomNode] = None,
              onChange: Option[js.Function] = None,
              onClick: Option[js.Function] = None): WithProps = auto
}