package mud

class Room (
    val name:String,
    val description:String,
    private var _exits:Array[Option[Room]],
    private var _items:List[Item]){
  
  
  def items = _items
  def exits = _exits
  
  def swapExitArray(newArray:Array[Option[Room]], index:Int) = _exits = newArray
  
  
  def roomInfo:String = { 
    var masterString = ""
    
    masterString += name + "\n" + description + "\n" + "Available item(s): " //assemble info
    
    //listing items
    if (_items.size > 1) { //if more than 2 items
      for (i <- 0 until _items.size) {
        if (i != _items.size - 1) masterString += (_items(i).name + ", ")
        else masterString += (" " + _items(i).name) //listing out the items with proper oxford comma
      }
    } // else if (items.size == 2) masterString += items(0).name + " and " + items(1).name //uncomment this line maybe 
    else if (_items.size == 1) { //if only item
      masterString += _items(0).name
    } else masterString += "None" //if no items
    
    /*
    //listing exits
    if (exits .size > 1) { //if more than 1 item
      for (i <- 0 until items.size) {
        if (i != items.size - 1) masterString += (items(i).name + ", ")
        else masterString += ("and " + items(i).name) //listing out the items with proper oxford comma
      }
    } else  if (items.size == 1) { //if only item
      masterString += items(0).name
    } else masterString += "None" //if no items
    */
    
    masterString
    }
  
  def getExit(direction: Int):Option[Room] = ???
  
  def getItem(itemName:String):Option[Item] = ???
  def dropItem(item:String):Unit = ???
}