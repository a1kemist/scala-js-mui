package com.kemesoft.scalajs.mui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

package object colors {

    @JSImport("@material-ui/core/colors/amber", JSImport.Default)
    @js.native
    object amber extends Color

    @JSImport("@material-ui/core/colors/grey", JSImport.Default)
    @js.native
    object grey extends Color

    @JSImport("@material-ui/core/colors/indigo", JSImport.Default)
    @js.native
    object indigo extends Color

    @JSImport("@material-ui/core/colors/pink", JSImport.Default)
    @js.native
    object pink extends Color

    @JSImport("@material-ui/core/colors/red", JSImport.Default)
    @js.native
    object red extends Color

    @JSImport("@material-ui/core/colors/common", JSImport.Default)
    @js.native
    object common extends CommonColors
}
