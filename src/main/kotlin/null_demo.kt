/**
 * @author Bright
 * @date 2017/11/13 0013
 */

/********************************************* NULL机制 ******************************************************/
fun main(args: Array<String>) {

    // 类型后面加?表示可空
    var s: String? = "14"

    println(nullFun(null))
    println(handleFun(null))
//    throwFun(null)

    // 对于可能为null的函数我们只需要对其进行判断，即可将其转换为非null变量
    val a = nullFun("12")
    val b = 2
    if (a != null) {
        print(a + b)
    }

}

fun throwFun(s: String?): Int {
    // 字段后加!! 抛出空指针异常
    val age1 = s!!.toInt()
    return age1
}

fun nullFun(s: String?): Int? {
    // 字段后加? 不做处理直接返回null
    // 如果不做处理那么接收类型也必须加?指明可以为null
    val age2 = s?.toInt()
    return age2
}

fun handleFun(s: String?): Int {
    // 字段后加? 配合?:进行处理，如果为空则返回-1
    val age3 = s?.toInt() ?: -1
    return age3
}