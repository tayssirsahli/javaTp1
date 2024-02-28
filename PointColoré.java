package tp1_Généricité;

public class PointColoré <T1,T2> extends Point <T1> {
	private T2 coleur;

	
	public PointColoré(T1 abs, T1 ord, T2 coleur) {
		super(abs, ord);
		this.setColeur(coleur);
	}


	public T2 getColeur() {
		return coleur;
	}


	public void setColeur(T2 coleur) {
		this.coleur = coleur;
	}


	@Override
	public String toString() {
		return super.toString()+" coleur=" + coleur ;
	}
	
	

}
