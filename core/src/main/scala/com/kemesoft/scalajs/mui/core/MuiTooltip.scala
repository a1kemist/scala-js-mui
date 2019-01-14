package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/**
  * https://material-ui-next.com/api/tooltip/
  */
object MuiTooltip extends ReactBridgeComponent {
    import JsWriterImplicits.vdomNodeWriter

    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/Tooltip/Tooltip", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(classes: js.Object = js.Object(),
              className: Option[String] = None,
              disableFocusListener: Option[Boolean] = Some(false),
              disableHoverListener: Option[Boolean] = Some(false),
              disableTouchListener: Option[Boolean] = Some(false),
              enterDelay: Option[Int] = Some(0),
              enterTouchDelay: Option[Int] = Some(1000),
              leaveDelay: Option[Int] = Some(0),
              leaveTouchDelay: Option[Int] = Some(1500),
              onClose: Option[js.Function] = None,
              onOpen: Option[js.Function] = None,
              placement: Option[String] = Some("bottom"),
              PopperProps: Option[js.Object] = None,
              title: Option[VdomNode] = None): WithProps = auto
}