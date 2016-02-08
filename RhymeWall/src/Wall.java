import java.util.HashMap;
import java.util.Map.Entry;

public class Wall {
	public static int num_lyrics;
	public static HashMap<String, Lyric> uploaded_Lyrics; //keep track of songs uploaded by song title
	
	public Wall() {
		num_lyrics = 0;
		uploaded_Lyrics = new HashMap();

	}
	
	public void printWall() {
		for (Entry<String, Lyric> wallLyrics : uploaded_Lyrics.entrySet()) {
			String title = wallLyrics.getKey();
			Lyric theLyric = wallLyrics.getValue();
			System.out.println(title + " by " + theLyric.getArtist() + " : " + "'" + theLyric.getVerse() + "'"); 
			}
	}
	
	public static void main(String[] args) {
		Wall myWall = new Wall();
		Lyric AbSoul1 = new Lyric("Verse 1", "My verse is really good", "AbSoul");
		Lyric Nas1 = new Lyric("Verse 2", "The world is yours", "Nas");
		Lyric Cole1 = new Lyric("Cole Verse", "Lights Please, Lights Please", "J. Cole");
		myWall.printWall();
			
		System.out.println("\nNumber of lyrics on the RhymeWall: " + myWall.num_lyrics);
		AbSoul1.deleteSong();
		System.out.println("\nNumber of lyrics on the RhymeWall: " + myWall.num_lyrics);

		myWall.printWall();
		
	}
	
}
