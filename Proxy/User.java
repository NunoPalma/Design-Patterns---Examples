import java.util.Random;

public class User implements UserInformation {
	private String _userName;
	private int _id;

	public User(String userName) {
		_userName = userName;
		Random rand = new Random();
		_id = rand.nextInt(999);
	}

	public String getUserName() {
		return _userName;
	}

	public int getId() {
		return _id;
	}
}