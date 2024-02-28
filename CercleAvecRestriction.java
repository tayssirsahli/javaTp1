package tp1_Généricité;

public class CercleAvecRestriction <T,T1 extends Point <T>>{

	private int rayon;
	private T1 centre;
	
	public CercleAvecRestriction(int rayon, T1  centre) {
		
		this.rayon = rayon;
		this.centre = centre;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public T1 getCentre() {
		return centre;
	}

	public void setCentre(T1 centre) {
		this.centre = centre;
	}

	@Override
	public String toString() {
		return "CercleAvecRestriction [rayon=" + rayon + ", centre=" + centre + "]";
	}
	
	
	
	
	
}
