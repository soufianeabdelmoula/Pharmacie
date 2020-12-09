package Model.Pharmacie;

public class FactoryPharmacieIndependante extends FactoryPharmacie {

	public final static FactoryPharmacie getFactoryPharmacie() {
		return new FactoryPharmacieIndependante();
	}
	public Pharmacie createPharmacie(String nom, int nbEmp, int surface, String numSiret) {
		return new PharmacieIndependante(nom, nbEmp, surface, numSiret);
	}
	

}