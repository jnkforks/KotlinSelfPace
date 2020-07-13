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

/* Okay, All the contents (such as classes and functions) of the source file are contained by the package declared.
   There is an advantage of package that we will be discussing in future. */
package varAndVal

/*
 * Welcome back, So in this we will be talking about declaring variable as null, if you are thinking why we have to do
 * then I must tell you that you can have you Kotlin and Java code together in a file and thus in order to make both of
 * them exchangeable with each other. We already know that Java allow us to declare variable as null. And maybe when you
 * work with dependencies in your project that are designed for Java originally then you may get have to declare some
 * parameters as null.
 *
 * Okay, now you know the reason why we have given an option of declaring a variable as null, whereas Kotlin is designed
 * to eliminate the nullability that had costed billion dollars loss. So how to declare it? Let's start...
 *
 */

fun main() {

    // We will be declaring a var String type of null variable
    // In order to declare any variable as null we have to give the explicit type-casing with '?' at end like below.
    var variable:String? = null

    // Let's print the variable
    println(variable) // prints-> null

    // Let's try to print the length of string variable by using .length. Uncomment the below line and run and see.
    //println(variable.length)

    /* We get, Error:(45, 21) Kotlin: Only safe (?.) or non-null asserted (!!.) calls
     * are allowed on a nullable receiver of type String?
     *
     * So what should we do then?
     * Always append ?  before . with the variable name like below.
     * Remember, since the variable is null thus on doing .length we will get null
     *
     */
    println(variable?.length) // prints-> null

    // What if i don't want to print anything if the variable is null then?
    // for case of String we have .isNullOrEmpty() that gives true or false + it also checks for if string is empty.
    if (!variable.isNullOrEmpty()) {
        println(variable.length) // Hey?? Wait a minute, why are we not using ? before . like above?
        /* Explanation: Since we already checked for variable to be null and since we will enter inside if condition
         * only when the variable is non null thus we can here safely use the .length here without putting ? */
    }

    // Fine! let's give variable a value
    variable = "HELLO I GOT VALUE!"

    // Print the variable to see the value
    println(variable) // prints-> HELLO I GOT VALUE!

    // What about .length? Kotlin is smart enough to know when the variable as a value or is null.
    // If you see error when you put . after variable then only add ? else not needed! Like below
    println(variable.length) // prints-> 18

    // Let's call .isNullOrEmpty() and see what Boolean value get's printed now
    println(variable.isNullOrEmpty()) // prints-> false

    // What if I define the variable again as null
    variable = null // see it works

    // .isNullOrBlank() will be used here since we changed the value back to null instead of .isNullOrEmpty()
    println(variable.isNullOrBlank()) // prints-> true

    /*
     * Here, we completed our var & val world and I hope you now know how to declare null and non null type.
     * Remember, you cannot give null value to non null type of variable.
     * You get to know when to use var and when to use val too.
     * Let's see what's next! in next Package :)
     */
}