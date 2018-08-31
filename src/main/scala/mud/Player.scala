package mud

class Player (
    private var:Room,
    private var items:List[Item]
  ){
  
  def processCommand(command:String):Unit = ???
  
  def removeFromInventory(itemName:String):Option[Item] = ???
  
  def addToInventory(item:Item):Unit = {
    
  }
  
  def inventoryListing():String = ???
  
  def move(dir:String):Unit = ???
  
}