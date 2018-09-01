package mud

class Player (
    private var _position:Room,
    private var _items:List[Item] = Nil
  ){
  
  def position = _position
  def items = _items
  
  def changePosition(newRoom:Room):Unit = { _position = newRoom }
  
  def processCommand(command:String):Unit = ???
  
  def removeFromInventory(itemName:String):Option[Item] = ???
  
  def addToInventory(item:Item):Unit = {
    
  }
  
  def inventoryListing():String = ???
 
  
  
}