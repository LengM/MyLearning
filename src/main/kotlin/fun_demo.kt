/**
 * @author Bright
 * @date 2017/11/13 0013
 */

/********************************************* 函数 ******************************************************/
// 参数Int，返回值Int
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 表达式做为函数体
fun sum1(a: Int, b: Int) = a + b

public fun sum2(a: Int, b: Int) = a + b

// 无返回值
fun printSum(a: Int, b: Int) {
    print(a + b)
}

/*
 * 匿名函数(lambda)
 * val sumLambda: Int = sum(x, y)
 * fun sum(x: Int, y Int): Int {}
 * 以上演变
 */
fun main(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2))
}
