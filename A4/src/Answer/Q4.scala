package Answer

object Q4 extends App {
  
  println("Enter the x coordinates: ")
  var num1=scala.io.StdIn.readInt()
  println("Enter the y coordinates: ")
  var num2=scala.io.StdIn.readInt()
  
   println("After switch the x and y coordinates: "+switch(num1,num2))
  
   def switch(dx:Int,dy:Int)=(dy,dx)
  
  
}