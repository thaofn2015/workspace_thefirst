package fan.study.patterns.structuaral.proxy;

public class UserServiceImpl implements IUserService {

	@Override
	public void load() {
		System.out.println("Load user information!!!");
	}

	@Override
	public void update() {
		System.out.println("Update user information!!!");
	}

}
