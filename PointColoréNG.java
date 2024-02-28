package tp1_Généricité;

public class PointColoréNG extends Point <Integer>{

	private String coleur;

	public PointColoréNG(Integer abs, Integer ord,String c) {
		super(abs, ord);
		this.coleur = c;
	}

	public String getColeur() {
		return coleur;
	}

	public void setColeur(String coleur) {
		this.coleur = coleur;
	}

	@Override
	public String toString() {
		return super.toString() + "coleur=" + coleur ;
	}
	

	
	
	

}
