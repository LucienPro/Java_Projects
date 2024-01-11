import java.util.ArrayList;

public class Programme {

	public static void main(String[] args) {
		
		Podcast p1 = new Podcast("Popcorn ep1", 35, true, "domingo");
		Podcast p2 = new Podcast("Popcorn ep2", 40, false, "domingo");
		
		Musique m1 = new Musique("Life is good",3,true, "drake");
		Musique m2 = new Musique("Hotline Bling", 3, false, "drake");
		
		Ecoutify e1 = new Ecoutify();
		e1.addPlaylist(m1);
		e1.addPlaylist(m2);
		e1.addPlaylist(p1);
		e1.addPlaylist(p2);
		
		e1.nbElemtPlaylist();
		
		
		ArrayList<Podcast>pods = e1.playlistPod();
		for(Podcast p:pods) {
			System.out.println(p);
		}
		
	}

}
