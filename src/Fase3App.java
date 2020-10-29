
public class Fase3App {

	public static void main(String[] args) {
		
		int any=1989;
		final int INICI=1948;
		int traspas=4;
		
		for(int i=INICI; i<=any; i=i+traspas) {
			System.out.println(i);
		}
		
		boolean bool=any%traspas == 0;
		String verd="L'any " + any + " és de traspàs";
		String fals="L'any " + any + " no és de traspàs";
		
		if(bool) {
			System.out.println(verd);
		} else {
			System.out.println(fals);
		}

	}

}
