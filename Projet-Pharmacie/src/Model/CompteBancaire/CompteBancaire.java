package Model.CompteBancaire;

public abstract class CompteBancaire {

	protected double solde;
	protected String code,dateOuverture;
	
	
	public CompteBancaire(String code, double solde, String dateOuverture) {
		// TODO Auto-generated constructor stub
		super();
		this.solde = solde;
	}
	public boolean prelevement(int somme) {
		if(solde-somme<0) 
			return false;
		solde -= somme;
		return true;
		
	}
	
	
}
