package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/expansion-panels/
  */
object MuiExpansionPanel extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/ExpansionPanel", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              CollapseProps: Option[js.Object] = None,
              defaultExpanded: Option[Boolean] = Some(false),
              disabled: Option[Boolean] = Some(false),
              expanded: Option[Boolean] = None,
              onChange: Option[js.Function] = None): WithProps = auto
}