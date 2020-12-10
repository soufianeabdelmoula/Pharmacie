package Model.CompteBancaire;

public class CompteFranchiseFactory extends CompteBancaireFactory{

	public final static CompteBancaireFactory getCompteBancaireFactory() {
		return new CompteFranchiseFactory();
	}

	@Override
	public CompteBancaire createCompteBancaire(String code, double solde, String dateOuverture) {
		// TODO Auto-generated method stub
		return new CompteFranchise(code, solde, dateOuverture);
	}
	
}
