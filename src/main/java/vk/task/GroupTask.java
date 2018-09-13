package vk.task;

import java.util.Date;

import com.vk.api.sdk.client.actors.UserActor;

public abstract class GroupTask extends AbstaractTask
{
	private String groupLink;
	private UserActor userActor;

	public GroupTask(int priority, Date lastPerform, String groupLink, UserActor userActor)
	{
		super(priority, lastPerform);
		this.groupLink = groupLink;
		this.userActor = userActor;
	}
}
