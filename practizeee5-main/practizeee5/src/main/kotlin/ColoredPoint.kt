// Определение класса ColoredPoint (цветная точка), производного от базового класса Point
class ColoredPoint(x: Double, y: Double, var color: String) : Point(x, y) {
    // Переопределение метода для вывода информации о цветной точке
    override fun displayInfo() {
        println("ColoredPoint: x = $x, y = $y, color = $color")
    }
}