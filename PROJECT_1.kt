var items = mutableListOf<String>()
fun main() {

  do {
      println("\n*=*=*=*=*=*=*=*=*CHOICE LIST*=*=*=*=*=*=*=*=*=*=*=")
      println("1) To Add Items")
      println("2) To Remove Items")
      println("3) To Update Items")
      println("4) To Show Items")
      println("5) To Exit")
      println("ENTER YOUR CHOICE")
      var choice: Int = readLine()!!.toInt()
//    println("ENTER YOUR CHOICE")
//    val choice = readLine()!!
      when (choice) {
          1 -> toadd()
          2 -> toremove()
          3 -> toupdate()
          4 -> toshow()
          5 -> break
          else -> "INVALID CHOICE"

      }
  }
      while (true);
  }

fun toadd() {

    print("Enter item name : ")
                    var item = readLine()!!

        if(item!=null && !items.contains(item)){
        items.add(item);
        print("item added successfully")
    }else {
        print("already exists : $item")
    }
}

fun toremove() {
print("Enter Item name to remove : ")
    val item= readLine()!!
    if (item!=null && !items.contains(item)) {
        items.remove(item);
        print("Item Removed successfully")
    }else{
        print("Item does not exist : $item")
    }
}
fun toupdate(){
    print("Enter item name which you want to update : ")
    val item= readLine()!!

            items.forEach {
                if(it=="item"){
                    items.set(item.indexOf(it), "")
                }
            }
}
fun toshow(){
print("*=*=Items*=*= : $items")


}

