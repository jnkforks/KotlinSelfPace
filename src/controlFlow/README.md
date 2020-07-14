# Control Flow

Types of control flow that we are covering are:

- When
    - Can be used to replace nested `if else if` conditions
    - Replacement of `switch` condition
- Loops
    - supports commonly used loops like `for`, `while`, `do-while`
    - can be an `iterator`
- Ranges
    - `0..3` - Iterates over a range starting from 0 up to 3 (inclusive)
    - `2..8 step 2` - Iterates over a range with a custom increment step for consecutive elements
    - `9 downTo 0` - Iterates over a range in reverse order
- Conditional Expressions and Equality Checks
    - `==` used for structural comparison
    - `===` used for referential comparison
    - There is no ternary operator `condition ? then : else` instead we use `if (condition) then (truepart) else (falsepart)`