/**
 * @author Bright
 * @date 2017/11/10 0010
 */
fun main(args: Array<String>) {
    println("Hello World")
    Hello("bright").hello()
}

class Hello(val str: String) {
    fun hello() {
        println("hello $str")
        a = 3
    }
}