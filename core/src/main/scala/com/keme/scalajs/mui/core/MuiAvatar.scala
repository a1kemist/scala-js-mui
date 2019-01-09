package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/avatar/
  */
object MuiAvatar extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Avatar", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(alt: Option[String] = None,
              childrenClassName: Option[String] = None,
              classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = Some("div"),
              imgProps: Option[js.Object] = None,
              src: Option[String] = None,
              srcSet: Option[String] = None): WithProps = auto
}