
public class Lyric {
	String title;
	String verse;
	String artist;
	
	public Lyric(String title, String verse, String artist) {
		this.title = title;
		this.verse = verse;
		this.artist = artist;
		this.addLyric(); //add the lyric to theWall
	}
	
	public Lyric() {
		title = verse = artist = null;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getVerse() {
		return this.verse;
	}
	
	public void setVerse(String verse) {
		this.verse = verse;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public boolean addLyric() {
		if (Wall.uploaded_Lyrics.containsKey(this.title)) {
			System.out.println("Song is already on the wall.");

			return false;
		}
		else {
			Wall.uploaded_Lyrics.put(this.title, this); //arrange lyrics in HashMap by song title
			Wall.num_lyrics += 1;
			return true;
		}
		
	}
	
	public boolean deleteSong() {
		if (Wall.uploaded_Lyrics.containsKey(this.title)) {
			Wall.uploaded_Lyrics.remove(this.title);
			System.out.println("\n"+this.title + " was removed.");
			Wall.num_lyrics -= 1;
			return true;
		}
		else {
			System.out.println("Song is not on the Wall and able to be deleted.");
			return false;
		}
		
		
	}
}
