package Model.CompteBancaire;

public class CompteClassique extends CompteBancaire {
	int solde = 100;
	public CompteClassique(String code, double solde,String dateOuverture) {
		super(code, solde, dateOuverture);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return " 2- Le Compte Classique et leur solde est :" + solde +" euro";
	}
}
