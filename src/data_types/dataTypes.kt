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

package data_types

/*
 * The data types in Kotlin are of 5 types, namely:
 * 1. Numbers – Byte, Short, Int, Long, Float, Double
 * 2. Boolean – True, false
 * 3. Characters
 * 4. Arrays
 * 5. Strings
 */

fun main() {

    //  Declaring the Byte type of variable
    val bigByte: Byte = Byte.MAX_VALUE // Stores smallest Byte value
    val smallByte: Byte = Byte.MIN_VALUE // Stores biggest Byte value

    println("The range of Byte data type is $smallByte to $bigByte.")
    // prints -> The range of Byte data type is -128 to 127.

    //  Declaring the Short type of variable
    val bigShort: Short = Short.MAX_VALUE // Stores smallest Short value
    val smallShort: Short = Short.MIN_VALUE // Stores biggest Short value

    println("The range of Short data type is $smallShort to $bigShort.")
    // prints -> The range of Short data type is -32768 to 32767.

    //  Declaring the Int type of variable
    val bigInt: Int = Int.MAX_VALUE // Stores smallest Int value
    val smallInt: Int = Int.MIN_VALUE // Stores biggest Int value

    println("The range of Int data type is $smallInt to $bigInt.")
    // prints -> The range of Int data type is -2147483648 to 2147483647.

    //  Declaring the Long type of variable
    val bigLong: Long = Long.MAX_VALUE // Stores smallest Long value
    val smallLong: Long = Long.MIN_VALUE // Stores biggest Long value

    println("The range of Long data type is $smallLong to $bigLong.")
    // prints -> The range of Long data type is -9223372036854775808 to 9223372036854775807.

    //  Declaring the Float type of variable
    val bigFloat: Float = Float.MAX_VALUE // Stores smallest Float value
    val smallFloat: Float = Float.MIN_VALUE // Stores biggest Float value

    println("The range of Float data type is $smallFloat to $bigFloat.")
    // prints -> The range of Float data type is 1.4E-45 to 3.4028235E38.

    //  Declaring the Double type of variable
    val bigDouble: Double = Double.MAX_VALUE // Stores smallest Double value
    val smallDouble: Double = Double.MIN_VALUE // Stores biggest Double value

    println("The range of Double data type is $smallDouble to $bigDouble.")
    // prints -> The range of Double data type is 4.9E-324 to 1.7976931348623157E308.

    //  Declaring the Boolean type of variable
    val bool: Boolean = false
    val bool1 = true // Again, Kotlin will determine the type itself.

    println("bool = $bool & bool1 = $bool1")
    // prints -> bool = false & bool1 = true

    //  Declaring the Char type of variable
    val ch: Char = 'A'
    val ch1 = 'Z'

    println("$ch .. $ch1")
    // prints -> A .. Z

    //  Declaring the String type of variable
    val str: String = "This is String."

    println(str)
    // prints -> This is String.

    //  Declaring the Array type of variable
    val array = arrayListOf(1,2,3)

    println(array)
    // prints -> [1, 2, 3]

    // Note: Array can be of types like char, string, int, float etc.
}