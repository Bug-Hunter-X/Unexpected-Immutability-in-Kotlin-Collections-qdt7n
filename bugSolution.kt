```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val mutableResult = list.map { it * 2 }.toMutableList() // Use toMutableList() for modification
    mutableResult.add(12)
    println(mutableResult) // Output: [2, 4, 6, 8, 10, 12]

    //Or use a mutable list from the start
    val mutableList = mutableListOf(1,2,3,4,5)
    val doubledMutableList = mutableList.map { it * 2 }
    doubledMutableList.add(12)
    println(doubledMutableList) // Output: [2, 4, 6, 8, 10, 12]
}
```