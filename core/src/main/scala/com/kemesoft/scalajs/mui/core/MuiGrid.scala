package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * https://material-ui-next.com/api/grid/
  */
object MuiGrid extends ReactBridgeComponent {

    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Grid", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(alignContent: Option[String] = Some("stretch"),
              alignItems: Option[String] = Some("stretch"),
              classes: Option[js.Object] = Some(js.Object()),
              className: Option[String] = None,
              component: Option[String | js.Function] = Some("div"),
              container: Option[Boolean] = Some(false),
              direction: Option[String] = Some("row"),
              item: Option[Boolean] = Some(false),
              justify: Option[String] = Some("flex-start"),
              lg: Option[Int] = None,
              md: Option[Int] = None,
              sm: Option[Int] = None,
              spacing: Option[Int] = Some(0),
              wrap: Option[String] = Some("wrap"),
              xl: Option[Int] = None,
              xs: Option[Int] = None,
              zeroMinWidth: Option[Boolean] = Some(false)): WithProps = auto
}
