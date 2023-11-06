fun main() {
    // Создание объектов разных классов
    val point1 = ColoredPoint(5.0, 6.0, "Blue")
    val point2 = Point(7.0, 8.0)

    val line1 = Line(point1, point2)
    val line2 = ColoredLine(point2, point1, "Red")

    val polygonPoints = listOf(Point(5.0, 5.0), Point(6.0, 6.0), Point(7.0, 7.0))
    val polygon = Polygon(polygonPoints, "Green")

    // Массив объектов базового класса
    val objects: Array<Line> = arrayOf(line1, line2, polygon)

    // Вывод информации об объектах
    objects.forEach { it.displayInfo() }
}