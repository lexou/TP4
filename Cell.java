package fr.dauphine.javavance.td4;

public class Cell {
	private String str;
	private Cell ref_next;
	
	//Constructeur
	public Cell(String stri) {
		str = stri;
		ref_next = null;
	}
	
	//Accesseurs
	public String getStr() {
		return str;
	}
	
	public Cell getRef_next() {
		return ref_next;
	}
	
	//Setters
	public void setStr(String ch) {
		this.str = ch;
	}
	
	public void setRef_next(Cell cellule) {
		this.ref_next = cellule;
	}
	
	public String toString() {
		return getStr(); 
	}
	
	
}
