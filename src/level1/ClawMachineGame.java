package level1;

public class ClawMachineGame {

	public static void main(String[] args){

		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};

		int answer = new ClawMachineGame().solution(board, moves);

		System.out.println("answer = " + answer);
	}

	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		// 해당 바구니에서 꺼내는 메소드
		//

		return answer;
	}
}
