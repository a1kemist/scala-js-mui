package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.scalajs.js.JSConverters._
import com.kemesoft.scalajs.mui.core.styles.transitions

/**
  * https://material-ui-next.com/api/snackbar/
  */
@js.native
trait AnchorOrigin extends js.Object {
    def vertical: String = js.native
    def horizontal: String = js.native
}

object AnchorOrigin {
    def apply(vertical: String = "bottom", horizontal: String = "center") : AnchorOrigin = {
        val o: Map[String, Any] = Map(
            "vertical" -> vertical,
            "horizontal" -> horizontal
        )

        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[AnchorOrigin]
    }
}

object MuiSnackbar extends ReactBridgeComponent {
    // implicit def anchorOriginWriter: JsWriter[AnchorOrigin] = JsWriter(_.asInstanceOf[js.Dynamic])
    import JsWriterImplicits.vdomNodeWriter
    override protected lazy val componentValue: js.Object = RawComponent

    @JSImport("@material-ui/core/Snackbar/Snackbar", JSImport.Default)
    @js.native
    object RawComponent extends js.Object

    def apply(action: Option[VdomNode] = None,
              anchorOrigin: AnchorOrigin = AnchorOrigin(),
              autoHideDuration: Option[Int] = None,
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              ContentProps: Option[js.Object] = Some(js.Object()),
              disableWindowBlurListener: Boolean = false,
              key: Option[js.Any] = None,
              message: Option[VdomNode] = None,
              onClose: Option[js.Function] = None,
              onEnter: Option[js.Function] = None,
              onEntered: Option[js.Function] = None,
              onEntering: Option[js.Function] = None,
              onExit: Option[js.Function] = None,
              onExited: Option[js.Function] = None,
              onExiting: Option[js.Function] = None,
              onMouseEnter: Option[js.Function] = None,
              onMouseLeave: Option[js.Function] = None,
              open: Option[Boolean] = Some(false),
              resumeHideDuration: Option[Int] = None,
              transition: Option[String | js.Function] = Some("Slide"),
              transitionDuration: Option[Int | js.Object] = Some(transitions.duration.enteringScreen),
              TransitionProps: Option[js.Object] = None
             ): WithProps = auto
}