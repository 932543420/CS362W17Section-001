package org.cs362.dominion;

import org.thenellb.*;
import org.junit.Test;
import org.thenellb.Adventurer;
import org.thenellb.Bazaar;
//import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class TestPlayer {
    @Test
    public void testPlayer(){
        CardShop myCardShop = new CardShop();
        Player myPlayer = new Player(myCardShop); //initializing since everything else needs user input
        Player myPlayer2 = new Player(myCardShop);

        myPlayer.playerTurn();
        for (int j=0;j<5; j++)
            myPlayer2.playerDeck.drawCard();

        myPlayer2.buy();
        myPlayer2.cleanUp();



    }
}
