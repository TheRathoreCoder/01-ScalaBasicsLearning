package org.iqvia.TTS.MyScalaLearning
// DoWhile Object.
object DoWhile {
  def main(args: Array[String]): Unit = {
    var a = 1
    do {
      print( s"$a, ")
      a = a+1
    }
    while (a<10)
  }
}