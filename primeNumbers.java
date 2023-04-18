public class primeNumbers {
    public static void main(String[] args) {
        // initialize num as 500
        int num = 500;
        // loop through all numbers between 500 and 599
        while (num < 600) {
            // initialize isPrime as true
            boolean isPrime = true;
            // loop through all numbers between 2 and half of the current number (inclusive)
            for (int i = 2; i <= num/2; i++) {
                // check if the current number is divisible by i
                if (num % i == 0) {
                    // if it is divisible, then the number is not prime
                    isPrime = false;
                    // exit the loop since we have already determined that the number is not prime
                    break;
                }
            }
            // check if the number is prime, between 500 and 599, and starts with the digit 5
            if (isPrime && num >= 500 && num <= 599 && String.valueOf(num).startsWith("5")) {
                // if all conditions are met, print out the number
                System.out.println(num);
            }
            // increment num by 1
            num++;
        }
    }
}