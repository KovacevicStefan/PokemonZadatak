package pokemonZadatak;

public class Test {

	public static void main(String[] args) {
		
		Pokemon prvi = new Pokemon("Charizard", "vatreni");
		System.out.println(prvi.toString());
		
		Pokemon drugi = new Pokemon("Squirtle", "vodeni");
		System.out.println(drugi.toString());
		
		Pokemon treci = new Pokemon("Pikachu", "elektricni");
		System.out.println(treci.toString());
	
		prvi.equals(treci);
		
		
	}

}
