package dominion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Card implements Comparable<Card>{

	public enum Type {
		ACTION, TREASURE, VICTORY
	}

	public enum CardName {
		/** The Treasure cards */
		COPPER("Copper"), SILVER("Silver"), GOLD("Gold"),

		/** The Victory cards */
		PROVINCE("Province"), DUCHY("Duchy"), ESTATE("Estate"), CURSE("Curse"),

		/** The Kingdom cards  2C */
		CELLAR("Cellar"), CHAPEL("Chapel"), MOAT("Moat"),

		/** Kingdom Cards - 3C */
		HARBINGER("Harbinger"), MERCHANT("Merchant"), VASSAL("Vassal"), VILLAGE("Village"), WORKSHOP("Workshop"),

		/** Kingdom Cards - 4C */
		BUREAUCRAT("Bureaucrat"), GARDENS("Gardens"), MILITIA("Militia"), MONEYLENDER("Moneylender"),
        POACHER("Poacher"), REMODEL("Remodel"), SMITHY("Smithy"), THRONE_ROOM("Throne Room"),

		/** Kingdom Cards - 5C */
		BANDIT("Bandit"), COUNCIL_ROOM("Council Room"), FESTIVAL("Festival"), LABORATORY("LABORATORY"),
        LIBRARY("Library"), MARKET("Market"), MINE("Mine"), SENTRY("SENTRY"), WITCH("Witch"),

		/** Kingdom Cards - 6C */
		ARTISAN("Artisan");


		private String name;

		CardName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (copper, silver, and gold cards)
	 */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;

	Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.realType = type;
		this.cardName = cardName;
	}

	/**
	 * Returns the type
	 */
	public Type getType() {
		return realType;
	}

	/**
	 * Returns the cardName
	 */
	public CardName getCardName() {
		return cardName;
	}

	public int getTreasureValue() { return treasureValue; }
	public int score(Player player) { return score; }
	
	static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(CardName.GOLD, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.SILVER, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.COPPER, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(CardName.PROVINCE,Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(CardName.DUCHY,Type.VICTORY,		5, 1, 0);
		ret.add(o);		
		o = new Card(CardName.ESTATE,Type.VICTORY,		2, 3, 0);
		ret.add(o);		
		o = new Card(CardName.CURSE,Type.VICTORY,		0, -1, 0);
		ret.add(o);

		/** The Kingdom cards , it should more than 10 cards*/
		o = new Card(CardName.CELLAR, Type.ACTION, 2, 0, 0);
		ret.add(o);
        o = new Card(CardName.MARKET, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.MERCHANT, Type.ACTION, 3, 0, 0);
        ret.add(o);
        o = new Card(CardName.MILITIA, Type.ACTION, 4, 0, 0);
        ret.add(o);
        o = new Card(CardName.MINE, Type.ACTION, 5, 0, 0);
        ret.add(o);
        o = new Card(CardName.MOAT, Type.ACTION, 2, 0, 0);
        ret.add(o);
        o = new Card(CardName.REMODEL, Type.ACTION, 4, 0, 0);
        ret.add(o);
		o = new Card(CardName.SMITHY,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.VILLAGE,Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.WORKSHOP, Type.ACTION, 3, 0 , 0);
		ret.add(o);

		return ret;
	}
	
	public void play(Player player, GameState state) {
		
		switch(this.cardName) {
		    // TODO: Implement Cellar Card
            case CELLAR:
                return;

            // TODO: Implement Chapel Card
            case CHAPEL:
                return;

            // TODO: Implement Moat Card
            case MOAT:
                return;

            // TODO: Implement Harbinger Card
            case HARBINGER:
                return;

            // TODO: Implement Merchant Card
            case MERCHANT:
                return;

            // TODO: Implement Vassal Card
            case VASSAL:
                return;

            case VILLAGE:
                player.drawCard();
                player.numActions += 2;
                return;

            // TODO: Implement Workshop Card
            case WORKSHOP:
                return;

            // TODO: Implement Bureaucrat Card
            case BUREAUCRAT:
                return;

            // TODO: Implement Gardens Card
            case GARDENS:
                return;

            // TODO: Implement Militia Card
            case MILITIA:
                return;

            // TODO: Implement Moneylender Card
            case MONEYLENDER:
                return;

            // TODO: Implement Poacher Card
            case POACHER:
                return;

            // TODO: Implement Remodel Card
            case REMODEL:
                return;

            case SMITHY:
                player.drawCard();
                player.drawCard();
                player.drawCard();
                return;

            // TODO: Implement Throne Room Card
            case THRONE_ROOM:
                return;

            // TODO: Implement Bandit Card
            case BANDIT:
                return;

            // TODO: Implement Council Room Card
            case COUNCIL_ROOM:
                return;

            // TODO: Implement Festival Card
            case FESTIVAL:
                return;

            // TODO: Implement Laboratory Card
            case LABORATORY:
                return;

            // TODO: Implement Library Card
            case LIBRARY:
                return;

            case MARKET:
                player.drawCard();
                player.numActions++;
                player.numBuys++;
                player.coins++;
                return;

            // TODO: Implement Mine Card
            case MINE:
                return;

            // TODO: Implement Sentry Card
            case SENTRY:
                return;

            // TODO: Implement Witch Card
            case WITCH:
                return;

            // TODO: Implement Artisan Card
            case ARTISAN:
                return;

			default:
				return;
		}
	}

	public static Card getCard(List<Card> cards,CardName cardName) {
		for(int i=0; i<cards.size();i++){
			if(cards.get(i).cardName.equals(cardName)) {
				return 	cards.get(i);
			}
		}
		
		return null;
	}

	public static List<Card> filter(Iterable<Card> cards, Type target) {
			List<Card> out = new ArrayList<Card>();
			for (Card c : cards) {
				if (c.getType() == target) {
					out.add(c);
				}
			}
			return out;
		}

	// this method will print out all the constant cards ENUM
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" \t" + this.getCardName());
		sb.append("-" + this.getType() + " ");
		sb.append("\t\t Cost: " + this.cost + " ");
		sb.append("\t\t Score: " + this.score + " ");
		sb.append("\tTreasure Value: " + this.treasureValue);

		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(!(obj instanceof Card)) return false;

		return cardName.equals(((Card) obj).cardName);
	}

	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}

}
