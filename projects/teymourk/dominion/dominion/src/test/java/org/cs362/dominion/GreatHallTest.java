package org.cs362.dominion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kia on 2/11/17.
 */
public class GreatHallTest {

    @Test
    public void greatHall() throws Exception {

        int newAction = 1;

        List<Card> cards;
        GameState state,testState;
        Randomness.reset(10);

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Player player = new Player(state, "player-1");
        player.hand.add(Card.getCard(cards,Card.CardName.Great_Hall));

        state.addPlayer(player);
        player = new Player(state, "player-2");
        state.addPlayer(player);

        state.initializeGame();

        System.out.println("\n --------Player 1 Status--------");
        System.out.println("|                               ");
        System.out.println("|Cards In Hand: " + (state.players.get(0).hand.size()));
        System.out.println("|" + state.players.get(0).hand);
        System.out.println("|Cards In Discard: " + state.players.get(0).discard.size());
        System.out.println("|Coins: " + state.players.get(0).coins);
        System.out.println(" ------------------------------");

        testState=(GameState) state.clone();

        HashMap<Player, Integer> winners=state.play();

        System.out.println("\n--------Player1 Updated Status--------");
        System.out.println("|                               ");
        System.out.println("|Cards In Hand: " + state.players.get(0).hand.size() + " Expected: " + (testState.players.get(0).hand.size() + 1));
        System.out.println("|" + state.players.get(0).hand);
        System.out.println("|Actions #: " + state.players.get(0).numActions + " Expected: " + (testState.players.get(0).numActions - 1 + newAction));
        System.out.println(" ------------------------------");

        System.out.println("\n--------Add One Card--------");

        testState.players.get(0).drawCard();

        assertEquals(state.players.get(0).hand.size(), (testState.players.get(0).hand.size()));
        assertEquals(state.players.get(0).numActions, (testState.players.get(0).numActions -1 + newAction));

        System.out.println("\nTEST SUCCESSFULLY COMPLETED\n");
    }
}
