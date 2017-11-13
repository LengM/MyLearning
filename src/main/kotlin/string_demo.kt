/**
 * @author Bright
 * @date 2017/11/13 0013
 */

/********************************************* 字符串模板 ******************************************************/
/*
 * 在字符串中使用：
 * $ 表示一个变量名或变量值
 * $varName -> 变量值(单纯的变量/常量，不能带有任何运算)
 * ${varName.fun()} -> 返回值(逻辑或运算放在这里)
 */
fun main(args: Array<String>) {
    val s1: String = "a is $a"
    val s2: String = "sum 1+1=${sum(1, 1)}"
    val s3: String = "${s1.replace("is", "was")}, but now is ${++a}"
    println(s1)
    println(s2)
    println(s3)
}
