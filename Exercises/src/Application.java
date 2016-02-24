import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class CardList {
	
	private Map<String, Integer> cards = new LinkedHashMap<String, Integer>();
	List<String> indexes;
	
	public CardList() {
		
		cards.put("A", 1);
		cards.put("2", 2);
		cards.put("3", 3);
		cards.put("4", 4);
		cards.put("5", 5);
		cards.put("6", 6);
		cards.put("7", 7);
		cards.put("8", 8);
		cards.put("9", 9);
		cards.put("10", 10);
		cards.put("J", 10);
		cards.put("Q", 10);
		cards.put("K", 10);
		
		indexes = new ArrayList<String>(cards.keySet());
		System.out.println(indexes.get(10));
		
	}
	
	public int getValue(String card, int value) {
		return cards.get(card);
	}
	
	public String getCard(int i) {

		return indexes.get(i);
		
	}
}

class Card {
	
	private String card;
	private Random random = new Random();
	private CardList cardlist = new CardList();
	
	public Card() {
		card = getCard();
	}
	
	private String getCard() {
		return cardlist.getCard(random.nextInt((12 - 0) + 1) + 0);
	}
	
}

public class Application {

	public static void main(String[] args) {

		List<Card> player = new ArrayList<Card>();

		player.add(new Card());
		player.add(new Card());
		player.add(new Card());		

		System.out.println(player.get(0));
		
	}

}
