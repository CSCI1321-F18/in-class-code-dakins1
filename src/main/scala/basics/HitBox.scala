package basics

class HitBox (
  private var _cx: Double = 0.0,
  private var _cy: Double = 0.0,
  val width:Double = 1.0,
  val height:Double = 1.0) {
  
  def intersects(that: HitBox):Boolean = {
    val overlapX = (_cx - that._cx).abs < 0.5*(width + that.width)
    val overlapY = (_cy - that._cy).abs < 0.5*(height + that.height)
    overlapX && overlapY
  }
}