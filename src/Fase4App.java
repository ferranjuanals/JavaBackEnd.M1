
public class Fase4App {

	public static void main(String[] args) {
		
		String nom="Ferran", cognom1="Juanals", cognom2="Figueras";
		int dia=26, mes=03, any=1989;
		
		String nom_complert=String.join(" ", nom, cognom1, cognom2);
		System.out.println("El meu nom �s " + nom_complert);
		
		String naixament=String.join("/", String.valueOf(dia), String.valueOf(mes), String.valueOf(any));
		System.out.println("Vaig n�ixer el " + naixament);
		
		int traspas=4;		
		boolean bool=any%traspas == 0;
		String sol;
		
		if(bool) {
			sol="�s de trasp�s";
		} else {
			sol="no �s de trasp�s";
		}
		
		System.out.println("El meu any de naixament " + sol);

	}

}
