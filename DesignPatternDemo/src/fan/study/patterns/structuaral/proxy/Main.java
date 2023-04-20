package fan.study.patterns.structuaral.proxy;

/**
 * https://gpcoder.com/4644-huong-dan-java-design-pattern-proxy/
 *
 */
public class Main {

	public static void main(String[] args) {
		IUserService userService = new UserServiceProxy(new UserServiceImpl(), "admin");
		
		userService.load();
		
		userService.update();
		
		IUserService userService2 = new UserServiceProxy(new UserServiceImpl(), "member");
		
		userService2.load();
		
		userService2.update();
	}

}
