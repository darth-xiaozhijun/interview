package com.xiaozhijun;

/**
 * 计算素数
 */
public class P02_PrimeNumber {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(primeCount(100));
        System.out.println(primeCount2(100));
    }

    /**
     * 暴力算法
     * @param n
     * @return
     */
    public static int primeCount(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }

    /**
     * 暴力算法，只需要计算到√n
     * @param n
     * @return
     */
    public static int primeCount2(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
