package Model.Pharmacie;

import java.util.ArrayList;

class PharmacieFranchisee extends Pharmacie {
	String Montant,ChiffreAffaire;
	double PrixAchat;
	ArrayList<PharmacieFranchisee> franchises = new ArrayList();
	PharmacieFranchisee pharmacie_Mere;
	public PharmacieFranchisee(String nom, int nbEmp, int surface, String numSiret) {
		super(nom, nbEmp, surface, numSiret);
	}
	
	
	public void setFranchises(ArrayList<PharmacieFranchisee> franchises) {
		this.franchises = franchises;
	}

	public String toString() {
		return " 1- une Pharmacie Franchisee";
	}
	
	public ArrayList<PharmacieFranchisee> getFranchises() {
		return franchises;
	}
	public boolean addPharmaFranchise(PharmacieFranchisee pharmacieFranchisee) {
		if(pharmacieFranchisee==null) return false;
		return franchises.add(pharmacieFranchisee);
	}
	
}