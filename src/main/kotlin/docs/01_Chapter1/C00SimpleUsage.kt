@file:Suppress("UNUSED_EXPRESSION")

package docs.`01_Chapter1`

import org.openrndr.dokgen.annotations.*


fun main(args: Array<String>) {
    @Text
    """
    # Intro To Dokgen
    This is just a simple example demonstrating how DokGen processes annotated source code.
    """



    @Text
    """
    Linking images and videos is easy.
    """
    @Media.Image """media/circle-002.png"""
    @Media.Video "media/shapes-005.mp4"


    @Text
    """
        ## Example application
        Here's an example application
    """

    @Application
    @Code.Block
    run {
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
        @Exclude
        println("this will be excluded from the docs")
    }


    @Text
    """
    Here's a code snippet
    """
    @Code
    fun foo(): String {
        return "foo"
    }

}
