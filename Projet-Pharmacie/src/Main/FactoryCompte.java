package Main;

import Model.CompteBancaire.CompteBancaire;
import Model.CompteBancaire.CompteBancaireFactory;
import Model.CompteBancaire.CompteClassiqueFactory;
import Model.CompteBancaire.CompteFranchiseFactory;
import Model.Pharmacie.FactoryPharmacie;
import Model.Pharmacie.FactoryPharmacieFranchisee;
import Model.Pharmacie.FactoryPharmacieIndependante;
import Model.Pharmacie.Pharmacie;

public class FactoryCompte {

	public static void main(String[] args) {
		CompteBancaireFactory cmp = CompteFranchiseFactory.getCompteBancaireFactory();
		CompteBancaire p1 = cmp.createCompteBancaire(null, 0, null);
		 cmp = CompteClassiqueFactory.getCompteBancaireFactory();
		CompteBancaire p2 = cmp.createCompteBancaire(null, 0, null);
		
		
		System.out.println("on a deux type ddu compte bancaire : \n");
		System.out.println(p1);
		System.out.println(p2);
			}
	
}
