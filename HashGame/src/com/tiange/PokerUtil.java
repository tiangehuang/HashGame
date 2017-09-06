package com.tiange;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class PokerUtil
{
	/**
	 * @desc 获取一张扑克方法
	 * @param poker
	 * @return
	 */
	public static Map<String, String> getCard(Poker poker)
	{
		List<Map<String, String>> cards = poker.getCards();
		Random random = new Random();
		int nextInt = random.nextInt(cards.size());
		Map<String, String> card = cards.get(nextInt);
		cards.remove(nextInt);
		return card;
	}
}
