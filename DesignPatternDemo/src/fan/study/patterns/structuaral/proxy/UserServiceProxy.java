package fan.study.patterns.structuaral.proxy;

public class UserServiceProxy implements IUserService {

	private IUserService userService;
	
	private String role;
	
	public UserServiceProxy(IUserService userService, String role) {
		this.userService = userService;
		this.role = role;
	}
	
	@Override
	public void load() {
		userService.load();
	}

	@Override
	public void update() {
		if ("admin".equals(role)) {
			userService.update();
		} else {
			System.out.println("You don't have permission!!!");
		}
	}

}
