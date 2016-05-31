package data;

import java.io.Serializable;

public class UserInfo implements Serializable
{
	private String userName = null;
	private String passWord = null;

	public UserInfo(String userName, String passWord)
	{
		this.userName = userName;
		this.passWord = passWord;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getPassWord()
	{
		return passWord;
	}

	@Override
	public String toString()
	{
		String string = "UserInfo:{" + "\n\tUserName:" + userName + "\n\tPassWord:" + passWord + "\n}";
		return string;
	}
}
