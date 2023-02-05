package intro

 fun main() {
     println("Variables")
     val myString: String = "This is my String"
     println(myString)

     val myInteger: Int = 10
     println(myInteger)

     val myOtherInteger = 20
     println(myOtherInteger)

     val myOtherString = "Bla bla bla"
     println(myOtherString)

     if (myInteger == myOtherInteger) {
         println("myInteger IS equal to myOtherInteger")

     }else {
         println("myInteger IS NOT equal to myOtherInteger")
     }

 }