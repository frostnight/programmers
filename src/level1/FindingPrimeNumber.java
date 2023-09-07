package level1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindingPrimeNumber {

    static int solution(int n){
        int sqrt = (int) Math.sqrt((double) n);
        List<Integer> filters = new ArrayList<>(Arrays.asList(2, 3, 5, 7));

        for(int i=2; i <= sqrt; i++){
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                continue;
            }
            filters.add(i);
        }

        List<Integer> primeNumbers = IntStream.range(2, n + 1).boxed().collect(Collectors.toList());
        filters.forEach(num -> {

            List<Integer> primeNumbers_ = primeNumbers.stream().filter(num_ -> num_ % num == 0 && num != num_).collect(Collectors.toList());
            primeNumbers.clear();
            primeNumbers.addAll(primeNumbers_);
            primeNumbers_ = null;
        });

//        int sqrt = (int) Math.sqrt((double) n);
//
//        List<Integer> primeNumbers = new ArrayList<>();
//
//        IntStream.range(2, n + 1).forEach(num -> {
//            if(num == 2 || num == 3 || num == 5 || num == 7) {
//                primeNumbers.add(num);
//            } else if (num > 7) {
//                int findNum = IntStream.range(2, sqrt + 1).filter(sqrt_num -> num % sqrt_num == 0 && num != sqrt_num).findFirst().orElse(0);
//                if(findNum == 0) {
//                    primeNumbers.add(num);
//                }
//            }
//        });

        return primeNumbers.size();
    }



    public static void main(String[] args){
        int number = 1000000;
        long start_time = System.currentTimeMillis();
        int result = FindingPrimeNumber.solution(number);
        System.out.println("result = " + result);
        long end_time = System.currentTimeMillis();
        System.out.println("end_time-start_time = " + ((end_time-start_time)));
        // 376ms
    }
}
