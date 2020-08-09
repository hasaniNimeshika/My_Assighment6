package Answer
import math.{sqrt, pow}

object Q3 extends App {
  
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
  
  val p4 = p1.distance(p2)
  println("Distance between two given points: "+p4)
}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def distance(other: Point): Double =
    sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dx)
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  
 
  
}