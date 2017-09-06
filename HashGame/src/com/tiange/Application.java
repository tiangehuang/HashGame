package com.tiange;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application
{
	public static void main(String[] args)
	{
		// 扫描器
		Scanner scanner = new Scanner(System.in);
		// 5 gamers
		List<Gamer> gamers = new ArrayList<Gamer>(5);
		gamers.add(new Gamer("gamer0", true));
		gamers.add(new Gamer("gamer1", true));
		gamers.add(new Gamer("gamer2", true));
		gamers.add(new Gamer("gamer3", true));
		gamers.add(new Gamer("gamer4", true));
		// a poker
		Poker poker = new Poker();
		
		// commom cards 
		List<Map<String, String>> commCards = new ArrayList<Map<String, String>>();
		commCards.add(PokerUtil.getCard(poker));
		commCards.add(PokerUtil.getCard(poker));
		
		System.out.println("common cards:" + commCards);
		
		// 获取一张牌
		Map<String, String> card;
		for (int j = 0; j < gamers.size(); j++)
		{
			card = PokerUtil.getCard(poker);
			gamers.get(j).getCard(card);
		}
		String input = null;
		List<Gamer> loses = new ArrayList<Gamer>();
		List<Integer> indexs = new ArrayList<Integer>();
		for (int j = 0; j < 2; j++)
		{
			indexs.clear();
			for (int i = 0; i < gamers.size(); i++)
			{
				System.out.println(gamers.get(i).getName() + ", do you want to continue this game(yes/no)?");
				input = scanner.nextLine();
				while (!"yes".equalsIgnoreCase(input) && !"no".equalsIgnoreCase(input))
				{
					System.out.println(gamers.get(i).getName() + ", your input is wrong, try again! do you want to continue game(yes/no)?");
					input = scanner.nextLine();
				}
				if ("yes".equalsIgnoreCase(input))
				{
					card = PokerUtil.getCard(poker);
					gamers.get(i).getCard(card);
					System.out.println(gamers.get(i));
				}
				else
				{
					loses.add(gamers.get(i));
					indexs.add(i);
				}
			}
			// 一轮过后移除放弃的人
			for (int i = indexs.size() - 1; i >= 0; i--)
			{
				gamers.remove((int) indexs.get(i));
			}
		}
		
		
		System.out.println("common cards:" + commCards);
		for (int i = 0; i < gamers.size(); i++)
		{
			System.out.println(gamers.get(i));
		}
		
		System.out.println("loses:" + loses);
		
	}
}
