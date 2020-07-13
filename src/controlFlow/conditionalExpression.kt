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

package controlFlow

/*
 * So, we will be discussing the control expression and equality checks.
 *
 * - There is no ternary operator condition ? then : else in Kotlin. Instead, if may be used as an expression.
 * - Kotlin uses == for structural comparison and === for referential comparison.
 *
 * Let is understand both with examples.
 *
 */

fun main() {

    // Declaring 2 variables a & b
    var a = 10
    var b = 20

    // Here, if(condition) then _ else _ and yes this if return value
    println(if(a > b) a else b) // prints -> 20

    // if as condition
    if (a <= 30) {
        println("Value of a is <= 30") // prints -> Value of a is <= 30
    } else {
        println("Value of a is $a")
        // prints -> Value of a is _ (if the else part is true and _ will be replaced by that no.)
    }

    // For seeing how equality checks work we will define 2 sets
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // prints -> true (1)
    println(authors === writers)  // prints -> false (2)

    /*
     * (1) Returns true because it calls authors.equals(writers) and sets ignore element order.
     * (2) Returns false because authors and writers are distinct references.
     *
     */

}