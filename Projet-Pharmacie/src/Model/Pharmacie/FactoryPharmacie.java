package Model.Pharmacie;

public abstract class FactoryPharmacie {
	 
protected static FactoryPharmacie phar = null;
	
public abstract Pharmacie createPharmacie(String nom, int nbEmp, int surface, String numSiret);
	public static FactoryPharmacie getFactoryPharmacie() {
		return phar;
		}
		protected FactoryPharmacie() {
		super();
		
		}

	
}