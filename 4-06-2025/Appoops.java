public class Game {
	String title;
	float rating;
	String genre;
	int playcount;
	public Game(String title,float rating,String genere,int playcount) {
		this.title=title;
		this.rating=rating;
		this.genre= genre;
		this.playcount=playcount;
	}
	public void Displayinfo() {
		System.out.println("Information about the game");
		System.out.println("title of the game:"+title);
		System.out.println("rating of the game:"+rating);
		System.out.println("genre of the game:"+genre);
		System.out.println("playcount of the game:"+playcount);


	}
	public boolean isfamilyfriendly() {
		if(genre == "horror") {
			return false;

		}
		return true;
	}
	public void playcount() {
		System.out.println("game is running");
		playcount++;
	}
	public void summary() {
		System.out.println("Summary of the game");
		System.out.println(" game title "+ title);
		System.out.println("game genere:"+genre);
		System.out.println("game rating"+rating);
		System.out.println("game playcount"+playcount);
	}
	public static void main (String[] args) {
		Game Gameinfo=new Game("sudoku",8.90f,20,"thicking game");
		Gameinfo.Displayinfo();
		Gameinfo.playcount();
		Gameinfo.summary();

	}
}

