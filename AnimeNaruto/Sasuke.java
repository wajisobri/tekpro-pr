package AnimeNaruto;

public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
		super.printDojutsu(); // Tambahan
		System.out.println(this.Dojutsu);
	}
}