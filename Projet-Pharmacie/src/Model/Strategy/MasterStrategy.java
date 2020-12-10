package Model.Strategy;

public class MasterStrategy  implements ReseauStrategy{

	@Override
	public void payer(int prix) {
		// TODO Auto-generated method stub
		System.out.println(prix + "€ payés par carte Master.");
	}

}
