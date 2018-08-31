package mud

class Room (
    val exits:Array[String],
    private var items:List[Item],
    val name:String,
    val description:String){
  
  def roomInfo:String = { 
    var masterString = ""
    
    masterString += name + "\n" + description + "\n" + "Available item(s): " //assemble info
    
    //listing items
    if (items.size > 1) { //if more than 2 items
      for (i <- 0 until items.size) {
        if (i != items.size - 1) masterString += (items(i).name + ", ")
        else masterString += (" " + items(i).name) //listing out the items with proper oxford comma
      }
    } // else if (items.size == 2) masterString += items(0).name + " and " + items(1).name //uncomment this line maybe 
    else if (items.size == 1) { //if only item
      masterString += items(0).name
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

