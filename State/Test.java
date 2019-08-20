import java.util.Scanner;  //Used for testing purposes

public class Test {
	public static void main(String args[]) {

		Scanner _scanner = new Scanner(System.in);
		Survey _survey = new Survey();
		String _input;

		while (true) {
			printMenu();
			_input = _scanner.nextLine();
			switch (_input) {
				case "1":
					_survey.openSurvey();
					break;
				case "2":
					_survey.closeSurvey();
					break;
				case "3":
					_survey.getCurrentStateInfo();
					break;
				case "4":
					System.exit(0);
				default:
					break;
			}
		}
	}
	public static void printMenu() {
		System.out.println("Choose an option." + "\n" + 
						"Press 1 to open the survey." + "\n" + 
						"Press 2 to close the survey." + "\n" +
						"Press 3 to check the survey state." + "\n" +
						"Press 4 to exit." + "\n");
	}
}