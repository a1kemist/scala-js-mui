package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/table/
  */
object MuiTableRow extends ReactBridgeComponent {

  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core/TableRow/TableRow", JSImport.Default)
  @js.native
  object RawComponent extends js.Function

  def apply(classes: js.Object = js.Object(),
            className: Option[String] = None,
            component: Option[String | js.Function] = Some("tr"),
            hover: Option[Boolean] = Some(false),
            selected: Option[Boolean] = Some(false)
           ): WithProps = auto
}