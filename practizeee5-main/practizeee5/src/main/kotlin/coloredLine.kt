// Определение класса ColoredLine (цветная линия), производного от класса Line
class ColoredLine(start: Point, end: Point, var color: String) : Line(start, end) {
    // Переопределение метода для вывода информации о цветной линии
    override fun displayInfo() {
        println("ColoredLine: Start - (${start.x}, ${start.y}), End - (${end.x}, ${end.y}), color = $color")
    }
}