package currying

/**
 * Created by IntelliJ IDEA.
 * User: Fujitsuer
 * Date: 12-11-3
 * Time: 下午9:55
 * To change this template use File | Settings | File Templates.
 */

object exercise extends Application {

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)


  println(product(x => x * x)(3, 4))


}