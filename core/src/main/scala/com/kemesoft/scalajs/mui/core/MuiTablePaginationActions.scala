package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/Table/
  */

object MuiTablePaginationActions extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/TablePagination/TablePaginationActions", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(backIconButtonProps: Option[js.Object] = Some(js.Object()),
              count: Int,
              nextIconButtonProps: Option[js.Object] = Some(js.Object()),
              onChangePage: js.Function,
              page: Int,
              rowsPerPage: Int,
              theme: Option[js.Object]
             ): WithProps = auto
}