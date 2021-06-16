package level1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class LottoHighRankLowRank {

	public static void main(String[] args){
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};

		solution(lottos, win_nums);
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};

		List<Integer> lottosList = Arrays.stream(lottos)
									.boxed()
									.collect(Collectors.toList());
		List<Integer> winNumList = Arrays.stream(win_nums)
									.boxed()
									.collect(Collectors.toList());
		// 0이 있는 index 확인
		Map<Integer, Integer> unknownNumMap = getUnknownNumMap(lottosList);

		System.out.println("unknownNumMap = " + unknownNumMap);

		int correctCount = correctNumberCount(lottosList, winNumList);

		System.out.println("high: "+(correctCount+unknownNumMap.size()));
		System.out.println("low: "+correctCount);

		return answer;
	}

	// 0이 있는 index 확인
	public static Map<Integer, Integer> getUnknownNumMap(List<Integer> list){
		AtomicInteger index = new AtomicInteger();
		return list.stream().filter(num -> num == 0).collect(
			Collectors.toMap( s -> index.getAndIncrement(), s -> s));
	}

	// 0을 제외하고 몇 개 까지 숫자가 맞는지 확인
	static int correctNumberCount(List<Integer> lottoList, List<Integer> winNumList){
		AtomicInteger correctCount = new AtomicInteger();
		lottoList.stream().filter(num -> num > 0).forEach( num -> {
			if(winNumList.contains(num)){
				correctCount.getAndIncrement();
			}
		});
		return correctCount.intValue();
	}

	// 순위 산정 메소드
	public int getRank(int correctCount){

	}

}
