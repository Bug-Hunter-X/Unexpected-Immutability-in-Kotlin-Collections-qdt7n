# Unexpected Immutability in Kotlin Collections

This example demonstrates a common issue in Kotlin related to the immutability of collections.  The `toList()` function creates an immutable list, meaning you cannot add or remove elements after its creation.  Attempting to modify an immutable list will result in a compile-time error.

The example shows how to correctly handle immutability using mutable lists when modifications are needed.