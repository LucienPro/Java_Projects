package frAbastract;

public class Start {
	
	public static void main (String[]args){

		DeuxChevaux dc = new DeuxChevaux();
		dc.replieLeToit();
		
		C3 c3 = new C3();
		c3.replieLeToit();
		
		System.out.println(dc.isEstToitReplie());
		System.out.println(c3.isEstToitReplie());
		
	}

}
