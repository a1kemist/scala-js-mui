package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/table/
  */
object MuiTableBody extends ReactBridgeComponent {

  override protected lazy val componentValue: js.Object = RawComponent

  @JSImport("@material-ui/core/TableBody/TableBody", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  def apply(classes: js.Object = js.Object(),
            className: Option[String] = None,
            component: Option[String | js.Function] = Some("tbody")): WithProps = auto
}