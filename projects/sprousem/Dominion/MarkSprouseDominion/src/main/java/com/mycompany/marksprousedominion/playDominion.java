package com.mycompany.marksprousedominion;

import java.util.ArrayList;
import java.util.Random;
//import java.util.Scanner;

public class playDominion 
{

	private boardState board;
	private ArrayList<Player> players;
    private Player current;
	private int currentPlayer;
	private Random rand;
        
	public playDominion(int numPlayers, Random rand)
	{

		this.rand = rand;

		//Game Setup
		players = new ArrayList<>();
		board = new boardState(rand);
		
		//Create each player
		for(int i = 0; i < numPlayers;i++)
                {
                    players.add(new Player(rand));
                }
		
		//Create the starting decks for each player
		for(int i = 0; i < 7; i++)
		{
                    for(int j = 0; j < numPlayers;j++)
                    {
                        players.get(j).addCard(0, new treasureCard(0, 1, "Copper"));
                    }
		}
		
		for(int i = 0; i < 3; i++)
		{
                    for(int j = 0; j < numPlayers;j++)
                    {
                        players.get(j).addCard(0, new victoryCard(2, 1, "Estate"));
                    }
		}
		
                for(int j = 0; j < numPlayers;j++)
                {
                    players.get(j).shuffle();
                    players.get(j).turnConclusion();
                }
		
                current = players.remove(0);
                currentPlayer = 0;
		//End of Game Setup
			
	}

	public void executeMove(Player current, ArrayList<Player> opponents, boardState board, turnState state)
	{
		int handIndex;
		Card temp;

		state.printInfo();
		displayHand(current);
		//Get input for what card to play
		handIndex = chooseNum(0, current.getSize(2));


		temp = current.getCard(2,  handIndex);

		current.addCard(2, 3, handIndex);//Move card from hand to played

		state = playCard(temp, state, board);//bug here with feast
	}

	public void executeBuy(Player current, ArrayList<Player> opponents, boardState board, turnState state)
	{
		int cardIndex;

		System.out.println("Options: " + board.getOptions());
		cardIndex = chooseNum(0, board.getOptions());

		current.addCard(1, board.cardBought(cardIndex));
		state.setBuys(state.getBuys() - 1);

	}

	public void executeTurn(Player current, ArrayList<Player> opponents, boardState board)
	{
		turnState state = new turnState(current, opponents, board);

		//Action phase
		while(state.getActions() != 0 && current.getSize(2) != 0)
		{
			executeMove(current,opponents, board, state);
		}
		//Buy phase
		
		//Get input for what card to play
		while(state.getBuys() != 0)
		{
			executeBuy(current,opponents, board, state);
		}
		
		current.turnConclusion();
		
	}
	
	private int chooseNum(int lower, int upper)
	{
		//return input;
		
		return rand.nextInt(upper-lower) + lower;
	}
	
	private void displayHand(Player player)
	{
		for (int i = 0; i < player.getSize(2); i++) {
			System.out.println(i + ": ");
			player.getCard(2, i).printInfo();
		}
	}
	
	private turnState playCard(Card card, turnState state, boardState board)
	{
		int temp;
		temp = state.getTreasure();
		state.setTreasure(card.getTreasure() + temp);//This can be done for all cards
		
		if(card.getType() == 2)//More must be done when a kingdom card is played
		{
			cardEffect(((kingdomCard) (card)).getFunctionIndex(), state, board);
			state.setActions(state.getActions()-1);
		}
		
		return state;
	}
	
	
	public boolean gameDone(boardState board)
	{


		//if 3 supply are out
		if(board.getOptions() < 14)
		{
			System.out.println("Game done because of lack of options");
			return true;
		}
		//if provinces are gone
		if(!"Province".equals(board.getSupply().get(0).get(0).getName()))
		{
			System.out.println("Game done because no provinces");
			return true;
		}
		
		return false;
	}
	
	public turnState cardEffect(int index, turnState state, boardState board)
	{
		switch (index)
		{
			case 0:
				smithy(state);
				break;
			case 1:
				council_room(state);
				break;
			case 2:
				witch(state);
				break;
			case 3:
				gardens(state);
				break;
			case 4:
				remodel(state, board);
				break;
			case 5:
				village(state);
				break;
			case 6:
				mine(state);
				break;
			case 7:
				adventurer(state);
				break;
			case 8:
				feastCard(state, board);
				break;
			case 9:
				baron(state);
				break;
			case 10:
				great_hall(state);
				break;
			case 11:
				festival(state);
				break;
			case 12:
				laboratory(state);
				break;
			default:
				System.out.println("Card Function Does Not Exist.");
				break;
		}
		return state;

	}
	
	private turnState smithy(turnState state)
	{
		Player currentPlayer = state.getCurrent();
		
		for (int i = 0; i < 3; i++) {
			currentPlayer.draw();
		}
		return state;
	}
	
	private turnState council_room(turnState state)
	{
		Player currentPlayer = state.getCurrent();
		ArrayList<Player> otherPlayer = state.getOpponents();
		
		state.setBuys(state.getBuys() + 1);
		
		for (int i = 0; i < 4; i++) {
			currentPlayer.draw();
		}
		
                for (int i = 0;i<otherPlayer.size();i++)
                {
                    otherPlayer.get(i).draw();
                }
                
		
                return state;
	}
	
	private turnState witch(turnState state)
	{
		Player currentPlayer = state.getCurrent();
		ArrayList<Player> otherPlayer = state.getOpponents();
		
		for (int i = 0; i < 2; i++) {
			currentPlayer.draw();
		}
                for (int i = 0;i<otherPlayer.size();i++)
                {
                    otherPlayer.get(i).addCard(1, new victoryCard(0, -1, "Curse"));
                }
		return state;
	}
	
	private turnState gardens(turnState state)
	{
		return state;
	}
	
	private turnState remodel(turnState state, boardState board)
	{
		//Trash a card from your hand, gain a card costing up to 2 more
		Player current = state.getCurrent();
		if(current.getSize(2) != 0)
		{
			Card card;
			int temp1, temp2;
			
			temp1 = chooseNum(0, current.getSize(2));
			card = current.getCard(2, temp1);
			temp1 = card.getCost();
			System.out.println("Cost 1: " + temp1);
			do//Get the card
			{
				if(board.getOptions() == 0)
					return state;
				temp2 = chooseNum(0, board.getOptions());
				card = board.cardBought(temp2);
				temp2 = card.getCost();

			}while(!(temp2 <= temp1 + 2));

			System.out.println("Broke with " + card.getName());
			System.out.println("Cost 2: " + temp2);
			current.addCard(1, card);
			
		}
		
		return state;	
	}
	
	private turnState village(turnState state)
	{
		state.setActions(2 + state.getActions());
		state.getCurrent().draw();
		
		return state;
	}
	
	private turnState mine(turnState state)
	{
		//Trash a treasure and get the next tier
		Card card = null;
		for(int i = 0; i < state.getCurrent().getSize(2);i++)
		{
			card = state.getCurrent().getCard(2, i);
			if(card.getType() == 1)
			{
				if(card.getCost() == 0)//If it is Copper, make it Silver
				{
					card.setCost(3);
					card.setName("Silver");
					card.setTreasure(2);
				}
				else//If it is Silver, make it Gold
				{
					card.setCost(6);
					card.setName("Gold");
					card.setTreasure(3);
				}
			}
		}
		
		return state;
	}
	
	private turnState adventurer(turnState state)
	{
		//Cycles cards until 2 treasure cards are added to the hand of the current player
		Player current = state.getCurrent();
		int count = 0;
		while(count != 2)
		{

			if(current.getSize(0) == 0)
				return state;

			if(current.getCard(0, 0).getType() == 1)//If it is a treasure card
			{
				count ++;
				current.addCard(0, 2, 0);
			}
			else
			{
				current.addCard(0, 1, 0);
			}
		}
		
		return state;
	}
	
	private turnState feastCard(turnState state, boardState board)
	{
		Player current = state.getCurrent();
		Card temp = null;
		int cardIndex;
		//Trash this card, add a card costing up to 5
		
		//Find this card
		for(int i = 0; i < current.getSize(2); i++)
		{
			temp = current.getCard(2, i);
			if(temp.getName() == "Feast")
			{
				current.trashCard(2, temp);
				break;
			}
		}
		
		do//Get the card
		{
			cardIndex = chooseNum(0, board.getOptions());
			temp = board.cardBought(cardIndex);
		}while(temp.getCost() > 5);//There is a bug here
		
		current.addCard(1, temp);
		
		return state;
	}
	
	private turnState baron(turnState state)
	{
		Player current = state.getCurrent();
		Card temp = new Card();
		//Gain a buy
		state.setBuys(state.getBuys()+1);
		//Discard an estate for +4 gold, otherwise gain an estate
		if(chooseNum(0, 2) == 0)//50/50 chance to choose to discard or not
		{//They want to discard
			//See if they have an estate to discard
			for (int i = 0; i < current.getSize(2); i++) {
				temp = current.getCard(2, i);
				if(temp.getName() == "Estate")
				{
					break;
				}
			}
			if(temp.getName() == "Estate")
			{
				current.trashCard(2, temp);
				state.setTreasure(state.getTreasure()+4);
				return state;
			}
		}
		//They want an estate	
		current.addCard(1, new victoryCard(2, 1, "Estate"));
		
		return state;
	}
	
	private turnState great_hall(turnState state)
	{
		//1 vp
		//1 card and 1 action
		state.getCurrent().draw();
		state.setActions(state.getActions() + 1);
		
		return state;
	}
	
	private turnState festival(turnState state)
	{
		state.setActions(state.getActions() + 2);
		state.setBuys(state.getBuys() + 1);
		state.setTreasure(state.getTreasure() + 2);
		
		return state;
	}
	
	private turnState laboratory(turnState state)
	{
		Player current = state.getCurrent();
		
		state.setActions(state.getActions() + 1);
		current.draw();
		current.draw();
		
		return state;
	}

	public boardState getBoard() {
		return board;
	}

	public Player getCurrent() {
		return current;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}
//-------------------------------------------------
        //Might want to change to the standard arrayqueue
        public void nextPlayer() //Moves current player to the next player
        {
            Player temp;

            players.add(currentPlayer, current);
            currentPlayer ++;

            if(currentPlayer == players.size())
            {
                currentPlayer = 0;
            }

            current = players.remove(currentPlayer);
        }

}
