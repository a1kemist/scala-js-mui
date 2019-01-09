package com.keme.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.scalajs.js.JSConverters._

/**
  * https://material-ui-next.com/api/typography/
  */

@js.native
trait HeadlineMapping extends js.Object {
    def display4: String
    def display3: String
    def display2: String
    def display1: String
    def headline: String
    def title: String
    def subheading: String
    def body2: String
    def body1: String
}

object HeadlineMapping {
    def apply(display4: String,
              display3: String,
              display2: String,
              display1: String,
              headline: String,
              title: String,
              subheading: String,
              body2: String,
              body1: String) : HeadlineMapping = {
        val o: Map[String, String] = Map(
            "display4" -> display4,
            "display3" -> display3,
            "display2" -> display2,
            "display1" -> display1,
            "headline" -> headline,
            "title" -> title,
            "subheading" -> subheading,
            "body2" -> body2,
            "body1" -> body1
        )
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[HeadlineMapping]
    }
}

object MuiTypography extends ReactBridgeComponent {
    
    override protected lazy val componentValue: js.Function = RawComponent

    @JSImport("@material-ui/core/Typography/Typography", JSImport.Default)
    @js.native
    object RawComponent extends js.Function

    def apply(align: Option[String] = Some("inherit"),
              classes: js.Object = js.Object(),
              className: Option[String] = None,
              color: Option[String] = Some("default"),
              component: Option[String | js.Function] = None,
              gutterBottom: Option[Boolean] = Some(false),
              headlineMapping: Option[HeadlineMapping] = Some(HeadlineMapping(display4 = "h1", display3 = "h1",
                display2 = "h1", display1 = "h1", headline = "h1", title = "h2", subheading = "h3", body2 = "aside", body1 = "p1")),
              noWrap: Option[Boolean] = Some(false),
              paragraph: Option[Boolean] = Some(false),
              variant: Option[String] = Some("body1")
             ): WithProps = auto
}