public class GameAdapter implements ISystem {
	private Game _game;

	public GameAdapter(Game game) {
		_game = game;
	}

	public void runSpecificSystem() {
		_game.run();
	}

}