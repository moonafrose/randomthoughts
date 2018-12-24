/*
Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

*/
public class CountPrimes {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        //using sieve of eratosthenes
        boolean[] isPrime = new boolean[n+1];
        for(int i=0;i<n;i++){
            isPrime[i]=true;
        }
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(isPrime[i]){
                //mark all multiples of i as non-prime
                for(int j=2;i*j<=n;j++){
                    isPrime[i*j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]){
                count++;
            }
            if(i>n){
                break;
            }
        }
        return count;
    }

    // for(int i=2;i<n;i++){if(isNumberPrime(i)count++)}
    // This gives TLE for large number eg. 499979 
    private boolean isNumberPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // If any number divides it then it is not prime
                return false;
            }
        }
        return true;
    }
    // for(int i=2;i<n;i++){if(isNumberPrimeUsingSqrt(i)count++)}
    // This gives TLE for large number eg. 1500000
    private boolean isNumberPrimeUsingSqrt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // If any number divides it then it is not prime
                return false;
            }
        }
        return true;
    }
}