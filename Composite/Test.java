public class Test {

	public static void main(String args[]) {
		Directory music = new Directory("Music");
		Directory moreMusic = new Directory("More Music");
		Song song1 = new Song("crybaby");
		Song song2 = new Song("AOV");
		Song song3 = new Song("Killpop");
		Song song4 = new Song("Custer");
		Song song5 = new Song("The Devil in I");
		Song song6 = new Song("Unsainted");
		Song song7 = new Song("Another Brick In the Wall");
		Album album1 = new Album(".5: The Gray Chapter");

		album1.addSong(song2);
		album1.addSong(song3);
		album1.addSong(song4);
		album1.addSong(song5);

		music.add(album1);
		music.add(song1);
		music.add(song6);
		music.add(moreMusic);
		moreMusic.add(song7);

		music.displayInfo();
	}
}