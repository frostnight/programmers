package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindingPrimeNumber {

    static int solution(int n){
        int sqrt = (int) Math.sqrt((double) n);

        List<Integer> primeNumbers = new ArrayList<>();

        IntStream.range(2, n + 1).forEach(num -> {
            if(num == 2 || num == 3 || num == 5 || num == 7) {
                primeNumbers.add(num);
            } else {
                boolean is_prime = true;
                for(int i=0; i < primeNumbers.size(); i++){
                    if(num % primeNumbers.get(i) == 0){
                        is_prime = false;
                        break;
                    }
                }

                if(is_prime){
                    primeNumbers.add(num);
                }

//                int findNum = IntStream.range(2, sqrt + 1).
//                    filter(_num -> num % _num == 0 && num != _num).findFirst().orElse(0);
//                if(findNum == 0) {
//                    primeNumbers.add(num);
//                }
            }
        });

        return primeNumbers.size();
    }



    public static void main(String[] args){
        int number = 1000000;
        System.out.println("solution() = " + solution(number));
    }
}
