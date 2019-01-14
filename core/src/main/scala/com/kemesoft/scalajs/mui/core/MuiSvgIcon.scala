package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/icon/
  */
object MuiSvgIcon extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/SvgIcon", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              color: Option[String] = Some("inherit"),
              nativeColor: Option[String] = None,
              titleAccess: Option[String] = None,
              viewBox: Option[String] = Some("0 0 24 24")
             ): WithProps = auto
}