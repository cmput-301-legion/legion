abstract class Shape
{
	var x: Int = 0
	var y: Int = 0

	val color: String = "dark"
}

class Octagon : Shape{
	val sides: Int = 8
}
class Circle(var radius : Int = 1): Shape{}
