package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindingPrimeNumber {

    static int solution(int n){
//        findNumbers = IntStream.range(2, n + 1)
//                .filter(num -> num == 2 || num == 3  || num == 5 || num == 7 || num == 11 ||
//                        (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num % 11 !=0))
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(187 % 2);
//        System.out.println("findNumbers = " + findNumbers);
        int sqrt = (int) Math.sqrt((double) n);
        System.out.println("sqrt = " + sqrt);
        List<Integer> primeNumbers = IntStream.range(2, sqrt + 1).filter(num -> num == 2 || num == 3 || num == 7)
                .boxed().collect(Collectors.toList());

        IntStream.range(sqrt, n + 1).forEach(num -> {
            int primeCount = (int) IntStream.range(2, sqrt).filter(_num -> num % _num == 0).count();
            if(primeCount == 0){
                primeNumbers.add(num);
            }
        });

        return primeNumbers.size();
    }



    public static void main(String[] args){
        int number = 200;
        System.out.println("solution() = " + solution(number));
    }
}
