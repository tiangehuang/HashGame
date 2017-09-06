package com.tiange;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * 玩家类，保存玩家姓名、状态、手牌
 * @author Administrator
 *
 */
public class Gamer
{
	private String name;
	private boolean status;
	private List<Map<String, String>> cards = new ArrayList<Map<String, String>>();
	
	public Gamer(){}
	public Gamer(String name, boolean status)
	{
		this.name = name;
		this.status = status;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public boolean isStatus()
	{
		return status;
	}
	public void setStatus(boolean status)
	{
		this.status = status;
	}
	public void getCard(Map<String, String> card)
	{
		cards.add(card);
	}
	@Override
	public String toString()
	{
		return "[name=" + name + ", status=" + status + ", cards=" + cards + "]";
	}
	
}
