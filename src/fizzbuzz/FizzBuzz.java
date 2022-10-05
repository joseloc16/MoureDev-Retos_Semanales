/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author joseloc12
 */
public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String result = (i % 15 == 0)
                    ? "fizzbuzz" : (i % 5 == 0)
                            ? "buzz" : (i % 3 == 0) ? "fizz" : String.valueOf(i);

            System.out.println(result);
        }
    }

}
