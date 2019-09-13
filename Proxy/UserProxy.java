public class UserProxy implements UserInformation {
	private User _user;

	public UserProxy(String userName) {
		_user = new User(userName);
	}

	public String getUserName() {
		return _user.getUserName();
	}
}