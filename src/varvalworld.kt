/*
 * Copyright (c) 2020 Sagar Gupta
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * Hey, let's start with the understanding of how to declare variables in Kotlin.
 * If you're beginner with language then maybe it will be little difficult but if you came from languages like
 * Java, C, C++, Python etc. then it will be easy to understand this language as well.
 *
 * We can declare the variables in 2 types: val & var.
 * val -> variables declared with this will have a fixed value or you can say that once we assign a value it can't
 * be changed.
 * var -> variables declared with this can have different values or you can say that we can assign multiple values
 * anytime.
 *
 */

fun main() { // This is main function. Like Java but we don't have to put it inside the class.

    /* About val */

    // Kotlin is smart to understand the type of variable i.e, Int, String..
    val variable = 5 // The use of ; is optional in Kotlin.
    val variable1: String = "This is a string." // Declaring variable with type explicitly.

    println(variable1) // prints-> This is a string.

    println("The value of variable is : $variable") // prints-> The value of variable is : 5
    // The above $variable is known as string template in Kotlin. We use $ sign for this.

    println("The length of variable1 is : ${variable1.length}") // prints-> The length of variable1 is : 17
    /* To get the length of string variable we wrote variable1.length but in order to get the result
     * using string template we use ${} where the value inside {} is calculated.
     */

    // Let's try to change the value of variable, uncomment the below line and click on run.
    //variable = 6 // We get, Error:(52, 5) Kotlin: Val cannot be reassigned

    /* About var */
    var variable3 = 4 // Kotlin will take it as Int
    var variable4: String = "This is editable string."

    // Let print the value of variable3
    println(variable3) // prints-> 4

    // Now, let's change the value of variable3 to 6 from 4.
    variable3 = 6

    println(variable3) // prints-> 6
    println(variable4) // prints-> This is editable string.

    // This way you can change value of variable4
    variable4 += " And now, we added new data."

    // Let's now print the variable4
    println(variable4) // prints-> This is editable string. And now, we added new data.

    /*
     * Now, you see the difference between val and var!
     * We will play later with variable and it's types too.
     *
     * Secondly, we will be looking how to declare null type variable because sometimes we need null to
     * be stored in variable. In the next part!
     *
     */
}