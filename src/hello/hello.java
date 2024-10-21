
package hello;

import java.security.SecureRandom;

import java.util.Arrays;

/// @author cop30
public class hello {

    public static void main(String[] args) {

        SecureRandom rand = new SecureRandom();

        int[] myArray = new int[100];

        for (int i = 0; i <= 99; i++) {

            myArray[i] = rand.nextInt(100000);

            // System.out.println("Hello World!" + " " + i + " " + myArray[i]);

        }

        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);

        System.out.println(Arrays.toString (myArray));
    } }
