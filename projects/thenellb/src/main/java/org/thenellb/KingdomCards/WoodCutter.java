package org.thenellb;


// template made for all cards
// All cards will now have same format


public class WoodCutter extends Card{

    //constructor
    public WoodCutter() {
        cardName ="WoodCutter";
        text =    "";    // official description from dominion website
        victoryValue = 0;         // number of Victory points the card gives
        plusBuyValue = 0;         // number of +Buys the card gives
        plusTreasuryValue = 0;    // number of +Coins the card gives
        plusActionValue = 2;      // number of +Actions the card gives
        plusCardValue = 1;        // number of +Cards drawn
        cost = 3;                 // how many coins it costs to buy
        cardType = "ACTION";
        plusDiscardValue = 0;
    }
    public int activate() {
        System.out.println("Playing the card:  " + cardName);
        return 13;
        //add things that will allow me to look through deck once deck is made
    }




}