package com.keme.scalajs.mui.core

import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

package object styles {
    @JSImport("@material-ui/core/styles/createMuiTheme.js", JSImport.Default)
    @js.native
    object createMuiTheme extends js.Function1[js.Object, js.Object] {
        override def apply(theme: js.Object = js.Object()): js.Object = js.native
    }

    @JSImport("@material-ui/core/styles/createPalette.js", JSImport.Default)
    @js.native
    object createPalette extends js.Function1[js.Object, js.Object] {
        override def apply(palette: js.Object = js.Object()): js.Object = js.native
    }

    @JSImport("@material-ui/core/styles/createMixins.js", JSImport.Default)
    @js.native
    object createMixins extends js.Function3[js.Object, js.Object, js.Object, js.Object] {
        override def apply(breakpoints: js.Object, spacing: js.Object, mixins: js.Object): js.Object = js.native
    }

    @JSImport("@material-ui/core/styles/createBreakpoints.js", JSImport.Default)
    @js.native
    object createBreakpoints extends js.Function1[js.Object, js.Object] {
        override def apply(breakpoints: js.Object): js.Object = js.native
    }

    @JSImport("@material-ui/core/styles/createTypography.js", JSImport.Default)
    @js.native
    object createTypography extends js.Function2[js.Object, js.Object | js.Function, js.Object] {
        override def apply(breakpoints: js.Object, typography: js.Object | js.Function): js.Object = js.native
    }

    @JSImport("@material-ui/core/styles/getStylesCreator.js", JSImport.Default)
    @js.native
    object getStylesCreator extends js.Function1[js.Object | js.Function, js.Object] {
        override def apply(stylesOrCreator: js.Object | js.Function): js.Object = js.native
    }

    @JSImport("@material-ui/core/styles/getThemeProps.js", JSImport.Default)
    @js.native
    object getThemeProps extends js.Function1[js.Object, js.Any] {
        override def apply(params: js.Object): js.Any = js.native
    }

    @JSImport("@material-ui/core/styles/shadows.js", JSImport.Default)
    @js.native
    object shadows extends js.Array[String]

    @JSImport("@material-ui/core/styles/spacing.js", JSImport.Default)
    @js.native
    object spacing extends MuiSpacing

    @JSImport("@material-ui/core/styles/transitions.js", JSImport.Default)
    @js.native
    object transitions extends js.Object {
        def easing: MuiEasing = js.native
        def duration: MuiDuration = js.native
        def create(props: js.Array[String] = js.Array("all"),
                   options: MuiTransitionOptions = MuiTransitionOptions()): js.Object = js.native
        def getAutoHeightDuration(height: js.UndefOr[Int]): Int = js.native
    }

    @JSImport("@material-ui/core/styles/withStyles.js", JSImport.Default)
    @js.native
    object withStyles extends js.Function2[js.Any, js.Object, js.Function1[VdomNode, VdomNode]] {

        override def apply(stylesOrCreator: js.Any,
                           options: js.Object): js.Function1[VdomNode, VdomNode] = js.native

        def apply(styles: js.Object,
                  options: js.Object): js.Function1[VdomNode, VdomNode] = {
            apply(stylesOrCreator = styles, options)
        }

        def apply(styles: js.Object): js.Function1[VdomNode, VdomNode] = {
            apply(styles = styles, js.Object())
        }

        def apply(creator: MuiTheme => js.Object,
                  options: js.Object): js.Function1[VdomNode, VdomNode] = {
            apply(stylesOrCreator = creator(_), options)
        }

        def apply(creator: MuiTheme => js.Object): js.Function1[VdomNode, VdomNode] = {
            apply(creator = creator, js.Object())
        }
    }

    @JSImport("@material-ui/core/styles/withTheme.js", JSImport.Default)
    @js.native
    object withTheme extends js.Function0[js.Function1[VdomNode, VdomNode]] {
        override def apply(): js.Function1[VdomNode, VdomNode] = js.native
    }

    @JSImport("@material-ui/core/styles/spacing.js", JSImport.Default)
    @js.native
    object zIndex extends js.Object {
        def mobileStepper: Int = js.native
        def appBar: Int = js.native
        def drawer: Int = js.native
        def modal: Int = js.native
        def snackbar: Int = js.native
        def tooltip: Int = js.native
    }
}
