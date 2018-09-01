package mud

import scala.io.Source

object MUD_Game {
  def main(args: Array[String]):Unit = {
    
    
    
    
    
    
    val source = Source.fromFile("")
    val lines = source.getLines
    val numberOfRooms = lines.next.toInt
    
    def createMap(iterator:Iterator[String]):Unit = {
     
      var roomList:List[Room] = Nil
      for (i <- 1 to numberOfRooms) { //instantiates all the rooms -- leaves the Exit array empty as it will be filled later
        roomList ::= new Room(iterator.next, iterator.next, Array.fill(6)(None):Array[Option[Room]], parseItems(iterator.next)) 
      }
      val roomArray  = roomList.reverse.toArray
      
      //assigning exits
      for (i <- 0 until numberOfRooms) {
        val numberOfExits = lines.next.toInt
        for (j <- 1 to numberOfExits) {
          roomArray(i).swapExitArray(
        }
      }
      
    }
    
    
    
    //gah!!
    
    
    def parseExits(iterator1:Iterator[String]):Array[Option[Room]] = { //input is lines.next containing the Room's exit info
      val input = exitInfo.split(", ") 
      val exitArray:Array[Option[Room]] = Array.fill(6)(None) //initializes exitArray
      for (i <- 0 until infoArray.size) {
        infoArray(i) match {
          case _ if infoArray(i).contains("north") => 
          case _ if infoArray(i).contains("south")
          case _ if infoArray(i).contains("east")
          case _ if infoArray(i).contains("west")
          case _ if infoArray(i).contains("up")
          case _ if infoArray(i).contains("down")
          
        }
      }
      exitArray
    }
    def parseItems(inp:String):List[Item] = ???
  }
}