package Model.CompteBancaire;

import Model.Pharmacie.FactoryPharmacie;
import Model.Pharmacie.FactoryPharmacieIndependante;


public class CompteClassiqueFactory extends CompteBancaireFactory{

	public final static CompteBancaireFactory getCompteBancaireFactory() {
		return new CompteClassiqueFactory();
	}
	public CompteBancaire createCompteBancaire(String code,int solde,String dateOuverture) {
		return new CompteClassique(code,solde,dateOuverture);
	}
	@Override
	public CompteBancaire createCompteBancaire(String code, double solde, String dateOuverture) {
		// TODO Auto-generated method stub
		return new CompteClassique(code, solde, dateOuverture);
	}
	
}




