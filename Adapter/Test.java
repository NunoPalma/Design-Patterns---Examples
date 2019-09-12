public class Test {
	public static void main(String args[]) {

		ISystem game = new GameAdapter(new Game());
		ISystem musicApp = new MusicAppAdapter(new MusicApp());
		game.runSpecificSystem();
		musicApp.runSpecificSystem();
	}
}