package Model.Pharmacie;

import java.util.ArrayList;

import Model.Produit.Produit;

public abstract class Pharmacie {

	protected String nom,type;
	private String numSiret;
	private int surface;
	private int nbEmp;
	private ArrayList<Produit> produits = new ArrayList();
	
	public Pharmacie(String nom, int nbEmp, int surface, String numSiret) {
		super();
		this.nom = nom;
		this.setNbEmp(nbEmp);
		this.setSurface(surface);
		this.setNumSiret(numSiret);

	}
	 public abstract String toString();
	
	 public Boolean addProduit(Produit produit) {
		 if(produit==null) {
			 System.out.println("Produit est épuisé"); 
			 return false;
		 }else {
		 return produits.add(produit);
		 } 
	 }
	
	 public void stockProduit() {
		 
		 System.out.println("votre stock est"); 
	 }
	 public String getNom() {
			return nom;
		}
	public String getNumSiret() {
		return numSiret;
	}
	public void setNumSiret(String numSiret) {
		numSiret = numSiret;
	}
	public int getSurface() {
		return surface;
	}
	public void setSurface(int surface) {
		surface = surface;
	}
	public int getNbEmp() {
		return nbEmp;
	}
	public void setNbEmp(int nbEmp) {
		nbEmp = nbEmp;
	}
	public ArrayList<Produit> getProduits() {
		return produits;
	}
}