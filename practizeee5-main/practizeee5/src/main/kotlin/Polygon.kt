// Определение класса Polygon (многоугольник), производного от класса Line
class Polygon(points: List<Point>, var color: String) : Line(points.first(), points.last()) {
    // Переопределение метода для вывода информации о многоугольнике
    override fun displayInfo() {
        println("Polygon: color = $color")
        points.forEachIndexed { index, point ->
            println("Point $index: x = ${point.x}, y = ${point.y}")
        }
    }

    // Метод для перемещения многоугольника по оси OX
    fun moveX(delta: Double) {
        points.forEach { it.moveX(delta) }
    }

    // Метод для перемещения многоугольника по оси OY
    fun moveY(delta: Double) {
        points.forEach { it.moveY(delta) }
    }

    // Метод для перемещения многоугольника по обеим осям одновременно
    fun moveXY(deltaX: Double, deltaY: Double) {
        points.forEach { it.moveXY(deltaX, deltaY) }
    }

    // Список точек, образующих многоугольник
    private var points: List<Point> = points
}