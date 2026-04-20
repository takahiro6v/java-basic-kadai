package text.kadai_028;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	Map<String, String> jyanken = new HashMap<>();
	public Jyanken_Chapter28() {
		jyanken.put("r", "rock");
		jyanken.put("s", "scissors");
		jyanken.put("p", "paper");
	}
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String myChoice = scanner.next(); 
		scanner.close();
		
		return myChoice;
	}
	
	public String getRandom() {
		String enemyChoice = "";
		int randomNum = (int)(Math.floor(Math.random() * 3));
		if(randomNum == 0)
			enemyChoice = "r";
		else if(randomNum == 1)
			enemyChoice = "s";
		else if(randomNum == 2)
			enemyChoice =  "p";
		return enemyChoice;
	}
	
	public void playGame(String i, String j) {
		if(i.equals(j)) {
			System.out.println("あいこです");
		}
		else if((i.equals("r") && j.equals("s")) || (i.equals("s") && j.equals("p")) || (i.equals("p") && j.equals("r"))){
			System.out.println("自分の勝ちです");
			
		}
		else if((i.equals("r") && j.equals("p")) || (i.equals("s") && j.equals("r")) || (i.equals("p") && j.equals("s"))) {
			System.out.println("自分の負けです");
			
		}
	}
}
