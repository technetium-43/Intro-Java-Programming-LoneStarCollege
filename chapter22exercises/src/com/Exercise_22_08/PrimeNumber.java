package com.Exercise_22_08;

/**
 * 22.8
 * (All prime numbers up to 10,000,000,000) Write a program that finds all prime numbers up to 10,000,000,000.
 * There are approximately 455,052,511 such prime numbers. Your program should meet the following requirements:
 * a) Your program should store the prime numbers in a binary data file, named PrimeNumbers.dat.
 * When a new prime number is found, the number is appended to the file.
 * b) To find whether a new number is prime, your program should load the prime numbers from the file to
 * an array of the long type of size 10000. If no number in the array is a divisor for the new number,
 * continue to read the next 10000 prime numbers from the data file, until a divisor is found or all
 * numbers in the file are read. If no divisor is found, the new number is prime.
 * c) Since this program takes a long time to finish, you should run it as a batch job from a UNIX machine.
 * If the machine is shut down and rebooted, your program should resume by using the prime numbers stored
 * in the binary data file rather than start over from scratch.
 * Note: An integer greater than 1 is prime if its only positive divisor is 1 or itself.
 * For example, 2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.
 */
public class PrimeNumber {
    private int number;
    private int currNumber;
    private boolean isPrime;

    public PrimeNumber(int number){
        this.number = number;
        this.currNumber = number-1;
        this.isPrime = false;
    }
    // mutators
    public void setIsPrime(boolean isPrime){
        this.isPrime = isPrime;
    }

    // Accessors
    public int getNumber(){
        return this.number;
    }
    public boolean getIsPrime(){
        return this.isPrime;
    }


}
