package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long code;
	private double solde;
	private Date dateCreation;
	
	public Compte(Long code, double solde, Date dateCreation) {
		this.code = code; 
		this.solde = solde; 
		this.dateCreation = dateCreation;	
		}

public Compte() {
	
}

public String toString() {
	return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + dateCreation + "]";
}


public Long getCode() {
	return code;
}

public void setCode(Long code) {
	this.code = code;
}

public double getSolde() {
	return solde;
}

public void setSolde(double solde) {
	this.solde = solde;
}

public Date getDateCreation() {
	return dateCreation;
}

public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
}




