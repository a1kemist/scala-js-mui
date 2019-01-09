package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/drawer/
  */
object MuiDrawer extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Drawer", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(anchor: Option[String] = Some("left"),
              classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              elevation: Option[Int] = Some(16),
              ModalProps: Option[js.Object] = Some(js.Object()),
              onClose: Option[js.Function] = None,
              open: Option[Boolean] = Some(false),
              PaperProps: Option[js.Object] = None,
              SlideProps: Option[js.Object] = None,
              theme: Option[js.Object] = None,
              transitionDuration: Option[Int | js.Object] = None,
              variant: Option[String] = None): WithProps = auto
}