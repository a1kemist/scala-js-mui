package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/table/
  */
object MuiTableSortLabel extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/TableSortLabel/TableSortLabel", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(active: Option[Boolean] = Some(false),
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              direction: Option[String] = Some("desc")): WithProps = auto
}