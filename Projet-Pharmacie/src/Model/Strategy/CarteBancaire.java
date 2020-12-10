package Model.Strategy;

public class CarteBancaire {
	String type;
	protected double solde;

	public CarteBancaire(String type,double solde) {
		this.type = type;
		this.solde = solde;
	}
	
	public String getType() {
		return this.type;
	}

	public double getSolde() {
		return this.solde;
	}
	public boolean payer(int somme) {
		if(solde<somme) return false;
		solde = solde - somme;
		return true;
	}
	public int getcout(int somme) {
		solde += somme;
		return somme;
	}
}
