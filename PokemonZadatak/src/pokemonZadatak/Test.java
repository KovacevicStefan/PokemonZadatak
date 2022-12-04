package pokemonZadatak;

public class Test {

	public static void main(String[] args) {
		
		Pokemon prvi = new Pokemon("Charizard", "vatreni");
		System.out.println(prvi.toString());
		
		Pokemon drugi = new Pokemon("Squirle", "vodeni");
		System.out.println(drugi.toString());
		
		prvi.equals(drugi);
		
	}

}
