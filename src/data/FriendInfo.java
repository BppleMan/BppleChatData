/**
 * 
 */
package data;

import java.io.Serializable;

/**
 * @author BppleMan
 *
 */
public final class FriendInfo implements Serializable
{
	private String friendName;
	private String friendState;

	public FriendInfo(String friendName, String friendState)
	{
		this.setFriendName(friendName);
		this.setFriendState(friendState);
	}

	public String getFriendName()
	{
		return friendName;
	}

	public void setFriendName(String friendName)
	{
		this.friendName = friendName;
	}

	public String getFriendState()
	{
		return friendState;
	}

	public void setFriendState(String friendState)
	{
		this.friendState = friendState;
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		String string = "FriendInfo:{" + "\n\tUserName:" + friendName + "\n\tUserState:" + friendState + "\n}";
		return string;
	}

	public static void main(String[] args)
	{
		System.out.println(new FriendInfo("hello", "hello"));
	}
}
