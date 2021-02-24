# Variables

> _Note: All these variables are declared and initialised in `main()` itself. The variables used in other parts of the program are for local calculations only._
>

- `int cube, square, one, none` : Integers which input and store the coefficients of the equation.
- `int count` : Counts the number of factors that the program is currently at, hence is initialized to `0`. This is important, since we know that there will be 3 factors at maximum (i.e. for a cubic equation, there are only 3 factors.)
- `double equation` : Used to check if the current value of `i`, if substituted in the given equation with the coefficients, satisfies the equation. Initialised to `-1`, to get rid of any unwanted consequences.
- `double i` : Used as an index variable. Non-conventionally, it is a double value since the factors of the polynomial might have decimals too.

# Methods

```
public static void main()
```
Most of the program code is in the `main()` function. It does not return any value. It calls the other functions when and where necessary. Essentially it checks if the current value of `i` satisfies the equation. If factorisable, a cubic equation should have 3 such values of `i` (i.e. 3 factors). All the important variables and arrays are declared in this method, and passed to other methods at the time of calling, if required. This is also the only method which is `public` in the entire program, so that abstraction is implemented and the user does not get confused as to which program he has to run.


```
private void Factor1(double i)
```
It is used to output the first factor of the polynomial. It does not return any value.


```
private void Factor2(double i)
```
It is used to output the second factor of the polynomial. It does not return any value.


```
private void Factor3(double i)
```
It is used to output the third factor of the polynomial. In case of a quadratic equation, it will not display anything, and directly exit.
