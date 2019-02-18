
# Intro To Dokgen
This is just a simple example demonstrating how DokGen processes annotated source code.

Linking images and videos is easy.

<img src="media/circle-002.png"/>

<video controls>
    <source src="media/shapes-005.mp4" type="video/mp4"></source>
</video>


## Example application
Here's an example application

```kotlin
List(100) { i ->
    if (i % 3 == 0 && i % 5 == 0) {
        println("FizzBuzz")
    } else if (i % 3 == 0) {
        println("Fizz")
    } else if (i % 5 == 0) {
        println("Buzz")
    } else {
        println(i)
    }
}
```

[Link to the full example](https://github.com/openrndr/openrndr-examples/blob/master/src/main/kotlin/examples/01_Chapter1/C00SimpleUsage000.kt)

Here's a code snippet

```kotlin
fun foo(): String {
    return "foo"
}
```
