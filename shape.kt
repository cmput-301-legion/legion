abstract class Shape
{
	var x: Int = 0
	var y: Int = 0

	val color: String = "red"
}

class Octagon : Shape{
	val sides: Int = 8
	val color: String = "teal"
}
class Circle(var radius : Int = 1): Shape{}
