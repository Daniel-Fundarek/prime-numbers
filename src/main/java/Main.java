import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {




    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(0,2);
        for (int i = 3; i<= 1000000; i++){
            if(i % 2 != 2 || i%5 != 0){
               findPrime(i, primes);
            }
        }
        System.out.println(primes.toString());


    }
    public static void findPrime(int currentNum, ArrayList<Integer> primes){
        boolean isPrime = false;
        for(Integer prime: primes){
            if(currentNum % prime == 0){
                isPrime = false;
                break;
            }
            else{
                isPrime = true;
            }
        }
        if(isPrime){
            primes.add(currentNum);
        }
    }


}
