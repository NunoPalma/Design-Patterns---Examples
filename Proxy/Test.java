public class Test {

	public static void main(String args[]) {
		UserInformation user = new User("Generic User");
		UserInformation userProxy = new UserProxy(user);

		System.out.println("Username: " + userProxy.getUserName());

		
		/* user and userProxy have no access to the getId() method
		System.out.println("Id: " + user.getId());
		System.out.println("Id: " + userProxy.getId());
		*/
	}
}