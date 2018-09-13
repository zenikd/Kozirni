package vk.task;

import java.util.Date;

public abstract class AbstaractTask
{
	private int priority;
	private Date lastPerform;

	public AbstaractTask(int priority, Date lastPerform)
	{
		this.priority = priority;
		this.lastPerform = lastPerform;
	}

	abstract void perform();

	public int getPriority()
	{
		return priority;
	}

	public Date getLastPerform()
	{
		return lastPerform;
	}
}
