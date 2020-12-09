package Main;
import Model.Pharmacie.*;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FactoryPharmacie phar = FactoryPharmacieFranchisee.getFactoryPharmacie();
Pharmacie p1 = phar.createPharmacie(null, 0, 0, null);
phar = FactoryPharmacieIndependante.getFactoryPharmacie();
Pharmacie p2 = phar.createPharmacie(null, 0, 0, null);
System.out.println("on a deux type de pharmacies : \n");
System.out.println(p1);
System.out.println(p2);
	}

}