abstract class Shape
{
	var x: Int = 0
	var y: Int = 0

	val color: String = "$PUT_YOUR_CHOICE_OF_COLOR"
}

class Octagon : Shape{
	val sides: Int = 8
}