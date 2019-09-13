public class UserProxy implements UserInformation {
	private UserInformation _user;

	public UserProxy(UserInformation user) {
		_user = user;
	}

	public String getUserName() {
		return _user.getUserName();
	}
}