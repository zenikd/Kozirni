package vk.task;

import java.util.Date;

import com.vk.api.sdk.client.actors.UserActor;

public class AddComment extends GroupTask
{
	public AddComment(int priority, Date lastPerform, String groupLink, UserActor userActor)
	{
		super(priority, lastPerform, groupLink, userActor);
	}

	@Override
	void perform()
	{

	}
}
