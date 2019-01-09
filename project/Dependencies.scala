import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object Dependencies {

    /** Material UI
      * 
      * 
      * 
      */
    object materialUI {
        val version = "3.8.2"
        val core = "@material-ui/core"
        val iconsVersion = "3.0.2"
        val icons = "@material-ui/icons"
    }
    
    /** React
      * 
      * Facebook's infamous frontend framework
      * 
      * 
      */
    object react {
        val version = "16.5.1"
        val core = "react"
        val dom = "react-dom"
    }

    /** ScalaCSS
      *
      * Write type safe css (works well with ScalaJs React).
      *
      * https://github.com/japgolly/scalacss
      */
    object scalaCSS {
        val version = "0.5.5"
        val group = "com.github.japgolly.scalacss"
        val core = "core"
        val extReact = "ext-react"
    }

    /** ScalaJs
      *
      * Write type safe javascript.
      *
      * https://www.scala-js.org/
      */
    object scalaJS {
        val group = "org.scala-js"

        // https://github.com/scala-js/scala-js-dom
        val domVersion = "0.9.3"
        val dom = "scalajs-dom"
    }

    /** ScalaJs React
      *
      * ScalaJs Facade for ReactJS with many useful additions.
      *
      * https://github.com/japgolly/scalajs-react
      */
    object scalaJsReact {
        val version = "1.3.1"
        val group = "com.github.japgolly.scalajs-react"
        val core = "core"
        val extra = "extra"
        val extMonocle = "ext-monocle"
    }
    
    object scalaJsReactBridge {
        val version = "0.7.0"
        val group = "com.payalabs"
        val core = "scalajs-react-bridge"
    }

    val common = Def.setting(Seq(
        scalaJS.group %%% scalaJS.dom % scalaJS.domVersion,
        scalaJsReact.group %%% scalaJsReact.core % scalaJsReact.version,
        scalaJsReact.group %%% scalaJsReact.extra % scalaJsReact.version,
        scalaJsReact.group %%% scalaJsReact.extMonocle % scalaJsReact.version,
        scalaJsReactBridge.group %%% scalaJsReactBridge.core % scalaJsReactBridge.version,
        scalaCSS.group %%% scalaCSS.core % scalaCSS.version,
        scalaCSS.group %%% scalaCSS.extReact % scalaCSS.version
    ))

    val commonJs: Seq[(String, String)] = Seq(
        materialUI.core -> materialUI.version,
        react.core -> react.version,
        react.dom -> react.version
    )
    
    val core = Def.setting(common.value)
    
    val coreJs: Seq[(String, String)] = commonJs
    
    val icons = Def.setting(common.value)
    
    val iconsJs: Seq[(String, String)] = commonJs ++ Seq(
        materialUI.icons -> materialUI.iconsVersion
    )
}
