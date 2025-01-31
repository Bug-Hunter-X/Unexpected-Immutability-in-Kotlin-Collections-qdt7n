```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val doubledList = list.map { it * 2 }.toMutableList()
    doubledList.add(12)
    println(doubledList) //Output: [2, 4, 6, 8, 10, 12]

    val immutableDoubledList = list.map { it * 2 }.toList()
    // immutableDoubledList.add(12) // This will cause a compile-time error
    println(immutableDoubledList) //Output: [2, 4, 6, 8, 10]
}
```