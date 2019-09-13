public class Test {

	public static void main(String args[]) {
		UserInformation userProxy = new UserProxy("Generic User");

		System.out.println("Username: " + userProxy.getUserName());
		
		/* UserProxy has no access to the User's method getId()
		System.out.println("Id: " + userProxy.getId());
		*/
	}
}