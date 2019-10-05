package core;

import delegates.Action;

public class PeriodicTimer
{
	private Action mAction;
	
	public PeriodicTimer(Action action)
	{
		mAction = action;
		mAction.call();
	}
}
