package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/table/
  */
object MuiTableCell extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/TableCell/TableCell", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    @JSImport("@material-ui/core/TableCell/TableCell", JSImport.Default)
    @js.native
    object asFunction extends js.Function2[js.Object, js.Object, VdomNode] {
        override def apply(props: js.Object, context: js.Object): VdomNode = js.native
    }

    def apply(classes: js.Object = js.Object(),
              table: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = None,
              numeric: Option[Boolean] = Some(false),
              padding: Option[String] = Some("default"),
              scope: Option[String] = None,
              sortDirection: Option[String | Boolean] = None,
              variant: Option[String] = None): WithProps = auto
}