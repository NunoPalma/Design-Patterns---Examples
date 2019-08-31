public class Test {

	public static void main(String args[]) {
		Notification notification = new Notification();
		Student student1 = new Student("Student1");
		Student student2 = new Student("Student2");

		//student1 and student2 are registered to recieve notifications
		notification.register(student1);
		notification.register(student2);

		notification.addNotification("Message 1");

		//Both observers will get notified
		student1.displayMessages();
		student2.displayMessages();

		notification.unregister(student2);

		notification.addNotification("Message 2");

		//student2 won't get this last notification
		student1.displayMessages();
		student2.displayMessages();
	}
}