package org.iqvia.TTS.MyScalaLearning

object ScalaConditions {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    print(" Give any number => ")
    
    val a = sc.nextInt()
    if (a%2==0) {
      println(s"Input value $a is Even No")
    }
    else if (a%2 != 0){
      
      println(s"Input value $a is Odd No")
    }
    else {
      
      println(s"Input value $a is not a Number")
    }
  }
}