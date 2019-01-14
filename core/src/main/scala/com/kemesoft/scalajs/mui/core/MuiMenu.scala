package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/menu/
  */
object MuiMenu extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/Menu/Menu", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(anchorEl: Option[js.Object] = None,
              classes: js.Object = js.Object(),
              MenuListProps: Option[js.Object] = None,
              onClose: Option[js.Function] = None,
              onEnter: Option[js.Function] = None,
              onEntered: Option[js.Function] = None,
              onEntering: Option[js.Function] = None,
              onExit: Option[js.Function] = None,
              onExited: Option[js.Function] = None,
              onExiting: Option[js.Function] = None,
              open: Boolean = false,
              PaperProps: Option[js.Object] = None,
              PopoverClasses: Option[js.Object] = None,
              // theme: MuiTheme,
              transitionDuration: Option[String] = Some("auto")
             ): WithProps = auto
}