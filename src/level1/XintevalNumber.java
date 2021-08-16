package level1;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * x만큼 간격이 있는 n개의 숫자
 */
public class XintevalNumber {
	public static void main(String[] args){
		int x = 4;
		int n = 3;

		solution(x, n);
	}

	static public long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;

		for(int i=1; i < answer.length; i++){
			answer[i] = answer[i-1] + x;
		}

		return answer;
	}
}
