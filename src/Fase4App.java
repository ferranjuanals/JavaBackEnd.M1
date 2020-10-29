
public class Fase4App {

	public static void main(String[] args) {
		
		String nom="Ferran", cognom1="Juanals", cognom2="Figueras";
		int dia=26, mes=03, any=1989;
		
		String nom_complert=String.join(" ", nom, cognom1, cognom2);
		System.out.println("El meu nom és " + nom_complert);
		
		String naixament=String.join("/", String.valueOf(dia), String.valueOf(mes), String.valueOf(any));
		System.out.println("Vaig néixer el " + naixament);
		
		int traspas=4;		
		boolean bool=any%traspas == 0;
		String sol;
		
		if(bool) {
			sol="és de traspàs";
		} else {
			sol="no és de traspàs";
		}
		
		System.out.println("El meu any de naixament " + sol);

	}

}
