package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** MuiMenuList component
  *
  * [[https://material-ui-next.com/api/menu-list/ MenuList]]
  */
object MuiMenuList extends ReactBridgeComponent {
    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/MenuList", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(): WithProps = auto
}
