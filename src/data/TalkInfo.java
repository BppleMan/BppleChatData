/**
 * 
 */
package data;

import java.io.Serializable;

/**
 * @author BppleMan
 *
 */
public class TalkInfo implements Serializable
{
	private String sendUser = null;
	private String receiveUser = null;
	private String message = null;

	/**
	 * 
	 */
	public TalkInfo(String sendUser, String receiveUser, String message)
	{
		this.sendUser = sendUser;
		this.receiveUser = receiveUser;
		this.message = message;
	}

	public String getSendUser()
	{
		return sendUser;
	}

	public String getReceiveUser()
	{
		return receiveUser;
	}

	public String getMessage()
	{
		return message;
	}

	@Override
	public String toString()
	{
		String string = "TalkInfo:{" + "\n\tSendUser:" + sendUser + "\n\tReceiveUser:" + receiveUser + "\n\tMessage:"
				+ message + "\n}";
		return string;
	}
}
