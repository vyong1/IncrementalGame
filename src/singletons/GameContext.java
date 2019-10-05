package singletons;

import entities.Player;

public class GameContext
{
	
	// -- Singleton Implementation
	//
	private GameContext() { }
	
	private static GameContext mInstance;
	
	public static GameContext getInstance()
	{
		if (mInstance == null)
		{
			mInstance = new GameContext();
		}
		
		return mInstance;
	}
	
	
	// -- Variables
	//
	private Player mPlayer;
	public Player getPlayer()
	{
		return mPlayer;
	}
	public void setPlayer(Player player)
	{
		mPlayer = player;
	}
}
