package text.kadai_021;
import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
	private Map<String, String> map = new HashMap<String, String>();
	
	public Dictionary_Chapter21() {
	map.put("apple", "りんご");
	map.put("peach", "桃");
	map.put("banana", "バナナ");
	map.put("lemon", "レモン");
	map.put("pear", "梨");
	map.put("kiwi", "キウィ");
	map.put("strawberry", "いちご");
	map.put("grape", "ぶどう");
	map.put("muscat", "マスカット");
	map.put("cherry", "さくらんぼ");
	}
	
	public void searchFruit(String fruit) {
		if(map.containsKey(fruit)) {
			String jaFruit = map.get(fruit);
			System.out.println(fruit + "の意味は" + jaFruit);
		}
		else {
			System.out.println(fruit + "は辞書に存在しません");
		}
	}
}
