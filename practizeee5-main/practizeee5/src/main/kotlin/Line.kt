// Определение класса Line (линия)
open class Line(var start: Point, var end: Point) {
    // Первичный конструктор с двумя аргументами для начальной и конечной точек
    constructor() : this(Point(), Point())

    // Метод для вывода информации о линии
    open fun displayInfo() {
        println("Line: Start - (${start.x}, ${start.y}), End - (${end.x}, ${end.y})")
    }
}