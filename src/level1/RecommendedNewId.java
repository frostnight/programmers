package level1;

import java.util.regex.Pattern;

public class RecommendedNewId {

	public static void main(String[] args){
		String newId = "...!@BaT#*..y.abcdefghijklm";
		String result = solution(newId);
		System.out.println("result[" + result+"]");
	}

	public static String solution(String new_id) {
		String answer = "";

		answer = change(1, new_id);
		System.out.println("level1, answer = " + answer);
		answer = change(2, answer);
		System.out.println("level2, answer = " + answer);

		return answer;
	}

	public static String change(int level, String id){

		String level2Match = "[a-z0-9-_.]";

		switch (level) {
			case 1:
				return id.toLowerCase();
			case 2:
				Pattern pat = Pattern.compile(regEx);
				return id.replaceAll(level2Match, "");
		}
		return id;
	}

}
