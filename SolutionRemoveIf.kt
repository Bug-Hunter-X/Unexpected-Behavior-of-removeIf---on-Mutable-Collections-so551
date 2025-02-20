fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <=2 }
    println(list) // Output: [1, 2, 3, 4, 5]
    println(newList) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }
    println(set) // Output: [1, 2, 3, 4, 5]
    println(newSet) // Output: [1, 2]
    
    //Alternative solution to modify in place using an iterator:
    val mutableList = mutableListOf(1,2,3,4,5)
    val iterator = mutableList.iterator()
    while (iterator.hasNext()){
        if (iterator.next() > 2) iterator.remove()
    }
    println(mutableList) // Output: [1,2]
}