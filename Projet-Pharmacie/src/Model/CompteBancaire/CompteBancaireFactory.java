package Model.CompteBancaire;




public abstract class CompteBancaireFactory {

	protected static CompteBancaireFactory phar = null;
	
	public abstract CompteBancaire createCompteBancaire(String code, double solde, String dateOuverture);
		public static CompteBancaireFactory getFactoryCompteBancaire() {
			return phar;
			}
			protected CompteBancaireFactory() {
			super();
			
			}
			
}
