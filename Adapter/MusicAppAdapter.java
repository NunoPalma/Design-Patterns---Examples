public class MusicAppAdapter implements ISystem {
	private MusicApp _musicApp;

	public MusicAppAdapter(MusicApp musicApp) {
		_musicApp = musicApp;
	}

	public void runSpecificSystem() {
		_musicApp.run();
	}

}