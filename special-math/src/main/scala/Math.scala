import scala.collection.mutable

class Math {
  private val cache = new mutable.HashMap[Int, BigInt]()

  def specialMath(x: Int): BigInt = cache.getOrElseUpdate(x, x match {
    case 0 => 0
    case 1 => 1
    case _ => x + specialMath(x - 1) + specialMath(x - 2)
  })
}
