package com.kemesoft.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.{UndefOr, |}

@js.native
trait MuiThemeOptions extends js.Object {
    def shape: js.UndefOr[ShapeOptions] = js.native
    def breakpoints: js.UndefOr[BreakpointsOptions] = js.native
    def direction: js.UndefOr[String] = js.native
    def mixins: js.UndefOr[MixinsOptions] = js.native
    def overrides: js.UndefOr[Overrides] = js.native
    def palette: js.UndefOr[PaletteOptions] = js.native
    def props: js.UndefOr[ComponentsProps] = js.native
    def shadows: js.UndefOr[Shadows] = js.native
    def spacing: js.UndefOr[SpacingOptions] = js.native
    def transitions: js.UndefOr[TransitionsOptions] = js.native
    def typography: js.UndefOr[TypographyOptions | js.Function1[MuiPalette, TypographyOptions]] = js.native
    def zIndex: js.UndefOr[ZIndexOptions] = js.native
}

object MuiThemeOptions {
    def apply(shape: Option[ShapeOptions] = None,
              breakpoints: Option[BreakpointsOptions] = None,
              direction: Option[String] = None,
              mixins: Option[MixinOptions] = None,
              overrides: Option[Overrides] = None,
              palette: Option[PaletteOptions] = None,
              props: Option[ComponentsProps] = None,
              shadows: Option[Shadows] = None,
              spacing: Option[SpacingOptions] = None,
              transitions: Option[TransitionOptions] = None,
              typography: Option[TypographyOptions | js.Function1[Palette, TypographyOptions]] = None) = {
        val o: Map[String, Any] = Seq(
            shape.map("shape" -> _),
            breakpoints.map("breakpoints" -> _),
            direction.map("direction" -> _),
            mixins.map("mixins" -> _),
            overrides.map("overrides" -> _),
            palette.map("palette" -> _),
            props.map("props" -> _),
            shadows.map("shadows" -> _),
            spacing.map("spacing" -> _),
            transitions.map("transitions" -> _),
            typography.map("typography" -> _)
        ).flatten.toMap

        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[MuiThemeOptions]
    }
}

@js.native
trait ShapeOptions extends js.Object {
    def borderRadius: js.UndefOr[Double] = js.native
}

object ShapeOptions {
    def apply(borderRadius: Option[Double]) = {
        val o: Map[String, Any] = borderRadius.map("borderRadius" -> _).toMap
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[ShapeOptions]
    }
}

@js.native
trait BreakpointValues extends js.Object {
    def xs: Double = js.native
    def sm: Double = js.native
    def md: Double = js.native
    def lg: Double = js.native
    def xl: Double = js.native
}

object BreakpointValues {
    def apply(xs: Double,
              sm: Double,
              md: Double,
              lg: Double,
              xl: Double) = {
        val o: Map[String, Any] = Map(
            "xs" -> xs,
            "sm" -> sm,
            "md" -> md,
            "lg" -> lg,
            "xl" -> xl
        )

        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[BreakpointValues]
    }
}

@js.native
trait Breakpoints extends js.Object {
    def keys: Array[String] = js.native
    def values: BreakpointValues = js.native
    def up: js.Function1[String | Double, String] = js.native
    def down: js.Function1[String | Double, String] = js.native
    def between: js.Function2[String, String, String] = js.native
    def only: js.Function1[String, String] = js.native
    def width: js.Function1[String, Double] = js.native
}

object Breakpoints {
    def apply(keys: Array[String],
              values: BreakpointValues,
              up: String | Double => String,
              down: String | Double => String,
              between: String | Double => String,
              only: String | Double => String,
              width: String | Double => String) = {
        val o: Map[String, Any] = Map(

        )

        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[Breakpoints]
    }
}

@js.native
trait BreakpointsOptions extends Breakpoints {
    def unit: js.UndefOr[String] = js.native
    def step: js.UndefOr[Double] = js.native
}

object BreakpointsOptions {
    def apply(unit: Option[String] = None,
              step: Option[Double] = None) = {
        val o: Map[String, Any] = Seq(
            unit.map("unit" -> _),
            step.map("step" -> _)
        ).flatten.toMap
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[BreakpointsOptions]
    }
}

@js.native
trait MixinsOptions extends js.Object {

}