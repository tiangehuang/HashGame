package com.tiange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poker
{
	private List<Map<String, String>> cards = new ArrayList<Map<String, String>>(52);
	public Poker()
	{
		String[] color = {"♠", "♥", "♣", "◆"};
		String[] count = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		Map<String, String> card = null;
		for (int i = 0; i < color.length; i++)
		{
			for (int j = 0; j < count.length; j++)
			{
				card = new HashMap<String, String>();
				card.put("attr", color[i] + count[j]);
				cards.add(card);
			}
		}
	}
	
	public List<Map<String, String>> getCards()
	{
		return cards;
	}

	@Override
	public String toString()
	{
		return "Poker [cards=" + cards + "]";
	}
}
