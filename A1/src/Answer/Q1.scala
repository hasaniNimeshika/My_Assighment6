package Answer

object Q1 extends App {
  
  println("Enter the first point x coordinates: ")
  var num1=scala.io.StdIn.readInt()
  println("Enter the first point y coordinates: ")
  var num2=scala.io.StdIn.readInt()
  
  println("Enter the second point x coordinates: ")
  var num3=scala.io.StdIn.readInt()
  println("Enter the second point y coordinates: ")
  var num4=scala.io.StdIn.readInt()
  
  val p1 = Point(num1,num2)
  val p2 = Point(num3,num4)
  
   println("After add two given points: "+(p1+p2))
}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
 
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  
 
  
}