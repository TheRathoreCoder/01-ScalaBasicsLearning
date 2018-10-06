package org.iqvia.TTS.MyScalaLearning
// For Loop
object ForLoop {
  def main(args: Array[String]): Unit = {
    for(i <- 1 until 10 by 1){
      print (i+"; ")
    }
  }
}