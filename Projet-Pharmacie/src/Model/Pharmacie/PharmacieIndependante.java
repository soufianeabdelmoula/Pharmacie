package Model.Pharmacie;

class PharmacieIndependante extends Pharmacie {
	
	public PharmacieIndependante(String nom, int nbEmp, int surface, String numSiret) {
		super(nom, nbEmp, surface, numSiret);
	}
	public String toString() {
		return " 2- une Pharmacie Indepedante";
	}

}