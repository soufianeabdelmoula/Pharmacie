package Model.Strategy;

public class VisaStrategy implements ReseauStrategy {
	PaysPayement pays;
	@Override
	public void payer(int prix) {
		// TODO Auto-generated method stub
		System.out.println(prix + "€ payés par votre carte Visa.");
	}
	
	public VisaStrategy(PaysPayement pays) {
		super();
		this.pays = pays;
	}
	public int getcout(int somme) {
		return (int) ((int)somme * pays.pourcentage);
		
	}
}
