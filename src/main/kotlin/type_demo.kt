/**
 * @author Bright
 * @date 2017/11/13 0013
 */

/********************************************* 类型判定 ******************************************************/
/**
 * 使用 is 关键字判断一个表达式是否是某一类型的实例
 */
fun main(args: Array<String>) {
    val a = getStringLength(1)
    val b = getStringLength1("我就是")
    val c = getStringLength2("")
    println(a)
    println(b)
    println(c)
}

// Any类似于java中的Object
fun getStringLength(obj: Any): Int? {
    // 如果obj的类型是String，则返回长度，否则返回null
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLength1(obj: Any): Int? {
    // 如果obj不是String类型，返回null，否则返回长度
    if (obj !is String) {
        return null
    }
    return obj.length
}

fun getStringLength2(obj: Any): Int? {
    // 如果obj是String类型，并且obj长度大于0，则返回长度，否则返回null
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}