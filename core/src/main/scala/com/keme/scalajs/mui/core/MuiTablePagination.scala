package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/Table/
  */

@js.native
trait DisplayedProps extends js.Object {
    var from: Int
    var to: Int
    var count: Int
}

object DisplayedProps {
    def apply(from: Int, to: Int, count: Int) : DisplayedProps = {
        val o = (new js.Object()).asInstanceOf[DisplayedProps]
        o.from = from
        o.to = to
        o.count = count
        o
    }
}

object MuiTablePagination extends ReactBridgeComponent {
    // implicit def anchorOriginWriter: JsWriter[AnchorOrigin] = JsWriter(_.asInstanceOf[js.Dynamic])
    import JsWriterImplicits.vdomNodeWriter
    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/TablePagination/TablePagination", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(ActionsComponent: Option[js.Object | String] = Some(MuiTablePaginationActions.RawComponent),
              backIconButtonProps: Option[js.Object] = None,
              classes: js.Object = js.Object(),
              colSpan: Option[Int] = None,
              component: Option[String | js.Function] = Some("div"),
              count: Option[Int] = None,
              labelDisplayedRows: Option[js.Function] = Some((dprop: DisplayedProps) => s"${dprop.from}-${dprop.to} of ${dprop.count}"),
              labelRowsPerPage: Option[VdomNode] = Some("Rows per page:"),
              nextIconButtonProps: js.Object = js.Object(),
              onChangePage: Option[js.Function] = None,
              onChangeRowsPerPage: Option[js.Function] = None,
              page: Option[Int] = None,
              rowsPerPage: Option[Int] = None,
              rowsPerPageOptions: Option[js.Array[Int]] = Some(js.Array(5, 10, 25)),
              SelectProps: Option[Boolean] = None
             ): WithProps = auto
}