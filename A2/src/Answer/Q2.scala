package Answer

object Q2 extends App {
  
  println("Enter the x coordinates: ")
  var num1=scala.io.StdIn.readInt()
  println("Enter the y coordinates: ")
  var num2=scala.io.StdIn.readInt()
  
  println("Enter the move point x coordinates: ")
  var num3=scala.io.StdIn.readInt()
  println("Enter the move point y coordinates: ")
  var num4=scala.io.StdIn.readInt()
  
  val p1 = Point(num1,num2)
  val p3 = p1.move(num3,num4)
  println("After move a point: "+p3)
}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  
 
  
}