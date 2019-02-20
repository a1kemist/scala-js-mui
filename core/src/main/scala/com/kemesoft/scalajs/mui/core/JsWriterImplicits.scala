package com.kemesoft.scalajs.mui.core

import com.payalabs.scalajs.react.bridge.JsWriter
import enumeratum.EnumEntry
import japgolly.scalajs.react.vdom.VdomNode

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.|

object JsWriterImplicits {
    implicit def vdomNodeWriter: JsWriter[VdomNode] = JsWriter(_.rawNode.asInstanceOf[js.Dynamic])

    implicit def enumeratumWriter[A <: EnumEntry]: JsWriter[A] = JsWriter(_.entryName)

    implicit def unionWriter3[A : ClassTag, B : ClassTag, C : ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter4[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C], writerD: JsWriter[D]): JsWriter[A | B | C | D] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
            case value: D => writerD.toJs(value)
        })

    implicit def unionWriter5[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C], writerD: JsWriter[D], writerE: JsWriter[E]): JsWriter[A | B | C | D | E] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
            case value: D => writerD.toJs(value)
            case value: E => writerE.toJs(value)
        })

    implicit def unionWriter6[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C], writerD: JsWriter[D], writerE: JsWriter[E], writerF: JsWriter[F]): JsWriter[A | B | C | D | E | F] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
            case value: D => writerD.toJs(value)
            case value: E => writerE.toJs(value)
            case value: F => writerF.toJs(value)
        })

    /*
    implicit def unionWriter7[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter8[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter9[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter10[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter11[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter12[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter13[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter14[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter15[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag, O: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter16[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag, O: ClassTag, P: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter17[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag, O: ClassTag, P: ClassTag, Q: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter18[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag, O: ClassTag, P: ClassTag, Q: ClassTag, R: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter19[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag, O: ClassTag, P: ClassTag, Q: ClassTag, R: ClassTag, S: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter20[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag, O: ClassTag, P: ClassTag, Q: ClassTag, R: ClassTag, S: ClassTag, T: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter21[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag, O: ClassTag, P: ClassTag, Q: ClassTag, R: ClassTag, S: ClassTag, T: ClassTag, U: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })

    implicit def unionWriter22[A : ClassTag, B : ClassTag, C: ClassTag, D: ClassTag, E: ClassTag, F: ClassTag, G: ClassTag, H: ClassTag, I: ClassTag, J: ClassTag, K: ClassTag, L: ClassTag, M: ClassTag, N: ClassTag, O: ClassTag, P: ClassTag, Q: ClassTag, R: ClassTag, S: ClassTag, T: ClassTag, U: ClassTag, V: ClassTag](implicit writerA: JsWriter[A], writerB: JsWriter[B], writerC: JsWriter[C]): JsWriter[A | B | C] =
        JsWriter({
            case value: A => writerA.toJs(value)
            case value: B => writerB.toJs(value)
            case value: C => writerC.toJs(value)
        })
    */
}
