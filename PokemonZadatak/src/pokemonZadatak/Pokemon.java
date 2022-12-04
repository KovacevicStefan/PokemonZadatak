package pokemonZadatak;

public class Pokemon {

	private static int brojPokemona;
	private String imePokemona;
	private String tipPokemona;
	private int redniBroj;
	private static int generacija = 1;
	
	
	public Pokemon(String ime, String tip) {
		
		this.imePokemona = ime;
		
		if(tip == "elektricni" || tip == "vatreni" || tip == "vodeni" || tip == "zemljani") {
			this.tipPokemona = tip;
		}else {
			this.tipPokemona = " / ";
		}
		
		this.brojPokemona++;
		
		this.redniBroj = this.brojPokemona;
	}
	
	@Override
	public String toString() {
		
		return imePokemona +" je pokemon " +generacija +". generacije, on je " +tipPokemona
				+" tip i u ovom programu kreiran je kao " +redniBroj +". od trenutno postojecih "
				+brojPokemona +" Pokemona.";
	}
	

	
	public static int getBrojPokemona() {
		return brojPokemona;
	}


	public static void setBrojPokemona(int brojPokemona) {
		Pokemon.brojPokemona = brojPokemona;
	}


	public String getImePokemona() {
		return imePokemona;
	}


	public void setImePokemona(String imePokemona) {
		this.imePokemona = imePokemona;
	}


	public String getTipPokemona() {
		return tipPokemona;
	}


	public void setTipPokemona(String tipPokemona) {
		this.tipPokemona = tipPokemona;
	}


	public int getRedniBroj() {
		return redniBroj;
	}


	public void setRedniBroj(int redniBroj) {
		this.redniBroj = redniBroj;
	}
	
	
	
}
