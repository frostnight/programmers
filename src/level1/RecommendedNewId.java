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
		answer = change(3, answer);
		System.out.println("level3, answer = " + answer);
		answer = change(4, answer);
		System.out.println("level4, answer = " + answer);
		answer = change(5, answer);
		System.out.println("level5, answer = " + answer);
		answer = change(6, answer);
		System.out.println("level6, answer = " + answer);
		answer = change(7, answer);
		System.out.println("level7, answer = " + answer);
		return answer;
	}

	public static String change(int level, String id){

		String level2Match = "[^a-z0-9-_.]";
		String level3Match = "[.]{2,}";

		switch (level) {
			case 1:
				return id.toLowerCase();
			case 2:
				return id.replaceAll(level2Match, "");
			case 3:
				return id.replaceAll(level3Match, ".");
			case 4:
				if(id.startsWith(".")){
					id = id.substring(1);
				}
				if(id.endsWith(".")){
					id = id.substring(0, id.length() - 1);
				}
				return id;
			case 5:
				if("".equals(id)){
					id = "a";
				}
				return id;
			case 6:
				if(id.length() >= 16){
					id = id.substring(0, 15);
					if(id.endsWith(".")){
						id = id.substring(0, id.length() - 1);
					}
				}
				return id;
			case 7:
				if(id.length() <= 2){
					String addId = id.substring(id.length() - 1);
					while(id.length() <= 3){
						id += addId;
					}
				}
				return id;
		}
		return id;
	}

}
