// Определение базового класса Point (точка)
open class Point(var x: Double, var y: Double) {
    // Первичный конструктор с двумя аргументами x и y
    constructor() : this(0.0, 0.0)

    // Метод для перемещения точки по оси OX
    open fun moveX(delta: Double) {
        x += delta
    }

    // Метод для перемещения точки по оси OY
    open fun moveY(delta: Double) {
        y += delta
    }

    // Метод для перемещения точки по обеим осям одновременно
    open fun moveXY(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }

    // Метод для вывода информации о точке
    open fun displayInfo() {
        println("Point: x = $x, y = $y")
    }
}