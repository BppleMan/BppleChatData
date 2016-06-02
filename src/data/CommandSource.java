/**
 * 
 */
package data;

/**
 * @author BppleMan
 *
 */
public final class CommandSource
{
	// 客户端指令
	public static final String loginCommand = "login";
	public static final String getFriendCommand = "getfriend";
	public static final String registCommand = "regist";
	public static final String byeCommand = "bye";
	public static final String getFriendInfoCommand = "getfriendinfo";

	// 小修改
	// 服务器返回指令
	public static final String canLoginCommand = "CanLogin";
	public static final String notCanLoginCommand = "NotCanLogin";
	public static final String canRegistCommand = "CanRegist";
	public static final String notCanRegistCommand = "NotCanRegist";
	public static final String notFoundUser = "NotFoundUser";
	public static final String passWordError = "PassWordError";
}
