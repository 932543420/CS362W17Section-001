package dominion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;




//struct gameState {
//	  int numPlayers; //number of players
//	  int supplyCount[treasure_map+1];  //this is the amount of a specific type of card given a specific number.
//	  int embargoTokens[treasure_map+1];
//	  int outpostPlayed;
//	  int outpostTurn;
//	  int whoseTurn;
//	  int phase;
//	  int numActions; /* Starts at 1 each turn */
//	  int coins; /* Use as you see fit! */
//	  int numBuys; /* Starts at 1 each turn */
//	  int hand[MAX_PLAYERS][MAX_HAND];
//	  int handCount[MAX_PLAYERS];
//	  int deck[MAX_PLAYERS][MAX_DECK];
//	  int deckCount[MAX_PLAYERS];
//	  int discard[MAX_PLAYERS][MAX_DECK];
//	  int discardCount[MAX_PLAYERS];
//	  int playedCards[MAX_DECK];
//	  int playedCardCount;
//	};

public class GameState implements Cloneable{
    public List < Player > players = new ArrayList < Player > ();
    public List < Card > cards;
    public HashMap < Card, Integer > gameBoard = new HashMap < Card, Integer > ();
    public HashMap < Card, Integer > embargoTokens = new HashMap < Card, Integer > ();


    public GameState(List < Card > cards) {
        this.cards = cards;
        for(Card temp : cards){
        	this.embargoTokens.put(temp, 0);
        }
    }
    public void addPlayer(Player player) {
        players.add(player);
    }

    /*	   initializing all supplies, and shuffling deck and
    drawing starting hands for all players.  Check that 10 cards selected
    are in fact (different) kingdom cards, and that numPlayers is valid.*/

    public void initializeGame() {


        //initialize supply 

        //check number of players
        if (players.size() > 4 || players.size() < 2) {
            //System.err.println("the number of players must be between 2 and 4 ");
            return;
        }
        //initialize supply for only two players
        int selectedKingdom = 0;
        int Kingdom_Cards_Selected = 14; // We only defined Adventurer, smithy, and Village. We need to define more kingdom cards the Card class
        // we should change 3 to the  exact of the number of 
        //kingdom cards. look at the requirements of the assignment-1
        while (selectedKingdom < Kingdom_Cards_Selected) {
            int random = (int) Randomness.random.nextInt(cards.size()); //
            Card tmp = cards.get(random);
            if (tmp.getType() != Card.Type.ACTION) continue;
            if (gameBoard.containsKey(tmp)) continue;
            gameBoard.put(tmp, 10);
            selectedKingdom++;
        }
        //set number of Curse cards the default number of players is 2			   
        gameBoard.put(Card.getCard(cards, Card.CardName.Curse), 10);

        //set number of Victory cards
        gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
        gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
        gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 8);
        gameBoard.put(Card.getCard(cards, Card.CardName.Gardens), 8);
        //set number of Treasure cards
        gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
        gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
        gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 46);


        for (Player player: players) {
            for (int i = 0; i < 7; i++)
                player.gain(Card.getCard(cards, Card.CardName.Copper));
            for (int i = 0; i < 3; i++)
                player.gain(Card.getCard(cards, Card.CardName.Estate));

            player.numActions = 1;
            player.coins = 0;
            player.numBuys = 1;
            //Shuffle your starting 10 cards (7 Coppers & 3 Estates) and place them face-down as your Deck. Draw the top
            //5 cards as your starting hand
            for (int i = 0; i < 5; i++) {
                player.drawCard();
            }
        }



    }

    public HashMap < Player, Integer > play() {

        //int turn = 0;
        while (!isGameOver()) {
            //turn++;
            for (Player player: players) {
                //System.out.println("------ " + player.player_username + " is playing ------ Turn: " + turn);
                //player p plays action card
                player.playKingdomCard();
                //player plays treasure card
                player.playTreasureCard();
                //player buy cards
                player.buyCard();
                //player ends turn
                player.endTurn();
            }
        }
        //for (Player p: players) {
        	//System.out.println(p.toString());
        //}
        return this.getWinners();
    }
    public boolean isGameOver() {
        //if stack of Province cards is empty, the game ends
        if ((gameBoard.get(Card.getCard(cards, Card.CardName.Province)) == null) || (gameBoard.get(Card.getCard(cards, Card.CardName.Province)) == 0))
            return true;
        //if three supply pile are at 0, the game ends
        int emptySupplyPile = 0;
        for (int i: gameBoard.values()) {
            if (i == 0)
                emptySupplyPile++;
            if (emptySupplyPile >= 3) {
                return true;
            }
        }
        //System.out.println("EmptyPiles: " + emptySupplyPile);
        return false;
    }

    public void pollPile(Player player, Card polled) {
    	List < Card > gamePile = new ArrayList < Card > (this.gameBoard.keySet());
    	polled = Card.getCard(gamePile, polled.getCardName());
    	Integer freq = gameBoard.get(polled);
        //System.out.println("Card Polled: " + polled.toString() + " " + freq);
        if (freq == 0) {
            return;
        }
        else {
            gameBoard.put(polled, freq - 1);
            player.gain(polled);
            return;
        }
    }
	
	public List < Card > pileRetrieve() {
		List < Card > activePiles = new ArrayList < Card > ();
		for(Card temp : this.gameBoard.keySet()){
			Integer frequency = this.gameBoard.get(temp);
			if(!frequency.equals(0)){
				activePiles.add(temp);
			}
		}
		
		return activePiles;
	} 

    /* Set HashMap  of each player and the score (remember ties!) */
    public HashMap < Player, Integer > getWinners() {
        HashMap < Player, Integer > playerScore = new HashMap < Player, Integer > ();

        //get score for each player
        for (Player p: players) {
            int score = p.scoreFor();
            playerScore.put(p, score);
        }

        return playerScore;
    }
	
	private GameState(List<Card> cards, List<Player> players, HashMap<Card, Integer> gameBoard, HashMap<Card, Integer> embargoTokens) {
		this.cards=cards;
		this.players=players;
		this.gameBoard=gameBoard;
		this.embargoTokens=embargoTokens;
	}
	
	public GameState clone() throws CloneNotSupportedException {
		List<Card> cloneCards = new ArrayList<Card>();
		for (Card card : cards) 
			cloneCards.add((Card) card.clone());
		final GameState cloneState = new GameState(cloneCards);
		
		List<Player> clonePlayers = new ArrayList<Player>();
		HashMap<Card, Integer> cloneGmeBoard = new HashMap<Card, Integer>();
		HashMap<Card, Integer> cloneEmbBoard = new HashMap<Card, Integer>();
		for (Player player : players) 
			clonePlayers.add((Player) player.clone(cloneState));
		for (Card card : gameBoard.keySet())
			cloneGmeBoard.put((Card) card.clone(),gameBoard.get(card));
		for (Card card : embargoTokens.keySet())
			cloneEmbBoard.put((Card) card.clone(),embargoTokens.get(card));
		
		cloneState.players = clonePlayers;
		cloneState.gameBoard = cloneGmeBoard;
		cloneState.embargoTokens = cloneEmbBoard;
		
		return  cloneState;
	}
}