package com.keme.scalajs.mui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

package object colors {

    @JSImport("@material-ui/core/colors/amber", JSImport.Default)
    @js.native
    object amber extends MuiColor

    @JSImport("@material-ui/core/colors/grey", JSImport.Default)
    @js.native
    object grey extends MuiColor

    @JSImport("@material-ui/core/colors/indigo", JSImport.Default)
    @js.native
    object indigo extends MuiColor

    @JSImport("@material-ui/core/colors/pink", JSImport.Default)
    @js.native
    object pink extends MuiColor

    @JSImport("@material-ui/core/colors/red", JSImport.Default)
    @js.native
    object red extends MuiColor

    @JSImport("@material-ui/core/colors/common", JSImport.Default)
    object common extends js.Object {
        def black: String = js.native
        def white: String = js.native
    }
}
