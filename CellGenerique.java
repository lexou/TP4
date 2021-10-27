package fr.dauphine.javavance.td4;

public class CellGenerique {
	private Object obj;
	private CellGenerique ref_next;
	
	//Constructeur
	public CellGenerique(Object o) {
		obj = o;
		ref_next = null;
	}
	
	//Accesseurs
	public Object getObj() {
		return obj;
	}
	
	public CellGenerique getRef_next() {
		return ref_next;
	}
	
	//Setters
	public void setObj(Object o) {
		this.obj = o;
	}
	
	public void setRef_next(CellGenerique cellule) {
		this.ref_next = cellule;
	}
	
	
	public String toString() {
		return getObj().toString();
	}
	
	
	
}
