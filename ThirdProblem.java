package assignment1;

import java.util.Scanner;

public class ThirdProblem {
    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Time taken " + duration + " milliseconds");
        if(checkFunction(n)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Composite");
        }
    }
    /*
     *This method returns is the number prime or not.
     *Time complexity: 0(1), where n is number that we input.
     *Complexity class: constant
     *@param n The is number that we input.
     *@return false or true. if true: it is prime, if it is false: it is composite
     */
    public static boolean checkFunction(int n){
        if (n <= 1) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % 2 == 0) {
            return false;
        }
        else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
