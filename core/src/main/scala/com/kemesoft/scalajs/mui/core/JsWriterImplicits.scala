package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.JsWriter
import enumeratum.EnumEntry
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js

object JsWriterImplicits {
    implicit def vdomNodeWriter: JsWriter[VdomNode] = JsWriter(_.rawNode.asInstanceOf[js.Dynamic])

    implicit def enumeratumWriter[A <: EnumEntry]: JsWriter[A] = JsWriter(_.entryName)
}
