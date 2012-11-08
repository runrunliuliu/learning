package currying

/**
 * Created by IntelliJ IDEA.
 * User: Fujitsuer
 * Date: 12-11-3
 * Time: 下午9:55
 * To change this template use File | Settings | File Templates.
 */

object exercise{

  /**
   * exercise one
   */
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)

  /**
   * exercise two
   *
   */
  def modN(n: Int)(x: Int) = ((x % n) == 0)
  val mod5 = modN(5) _
  val l = (1 to 30).toList


  def main(args: Array[String]) {

    println(product(x => x * x)(3, 4))

    println(l filter mod5)

  }
}