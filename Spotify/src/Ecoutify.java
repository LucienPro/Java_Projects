import java.util.ArrayList;

public class Ecoutify {
	
	private ArrayList<Son> playlist = new ArrayList<Son>();
	private Son son;

	public Ecoutify() {
		// TODO Auto-generated constructor stub
	}
	
	public Son getSon() {
		return son;
	}
	
	public void setSon(Son son) {
		this.son = son;
	}

	public ArrayList<Son> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<Son> playlist) {
		this.playlist = playlist;
	}
	
	public void addPlaylist(Son s) {
		playlist.add(s);
	}
	
	public int nbElemtPlaylist() {
		return playlist.size();
	}
	
	//méthode qui liste les podcasts de la playlist :
		public ArrayList <Podcast> playlistPod(){
			ArrayList<Podcast>resultat = new ArrayList <Podcast>();
			for(Son element : playlist) {
				if(element instanceof Podcast) {
					resultat.add((Podcast)element);
				}
			}
			return resultat;
		}
}
