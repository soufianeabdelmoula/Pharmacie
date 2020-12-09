package Model.Pharmacie;

public  class FactoryPharmacieFranchisee  extends FactoryPharmacie{

	public final static FactoryPharmacie getFactoryPharmacie() {
		return new FactoryPharmacieFranchisee();
	}
	public Pharmacie createPharmacie(String nom, int nbEmp, int surface, String numSiret) {
		return new PharmacieFranchisee(nom, nbEmp, surface, numSiret);
	}
	
}