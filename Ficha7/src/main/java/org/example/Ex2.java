package org.example;

public class Ex2 {

    public boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isMultiple(int num, int div) {
        return num % div == 0;
    }
}