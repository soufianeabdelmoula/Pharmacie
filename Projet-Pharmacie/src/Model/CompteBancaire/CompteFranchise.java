package Model.CompteBancaire;

public class CompteFranchise extends CompteBancaire{
	int solde = 48600;
	public CompteFranchise(String code, int solde,String dateOuverture) {
		super(code, solde, dateOuverture);
		// TODO Auto-generated constructor stub
	}
	public CompteFranchise(String code, double solde, String dateOuverture) {
		// TODO Auto-generated constructor stub
		super(code,solde,dateOuverture);
	}
	
	public String toString() {
		return " 2- Le Compte Franchisé et leur solde est :" + solde+" euro";
	}
}
