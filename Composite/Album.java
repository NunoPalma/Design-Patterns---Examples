import java.util.ArrayList;

public class Album implements AbstractFile {
	private String _name;
	private ArrayList<Song> _albumSongs;

	public Album(String name) {
		_name = name;
		_albumSongs = new ArrayList<Song>();
	}

	public void addSong(Song song) {
		_albumSongs.add(song);
	}

	public void displayInfo() {
		System.out.println("The album's name is: " + _name);

		for (Song song : _albumSongs)
			song.displayInfo();

		System.out.println("");
	}
}