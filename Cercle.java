package tp1_Généricité;

public class Cercle  {

	
	private int rayon;
	private Point Centre ;
	public Cercle(int rayon, Point centre) {
		
		this.rayon = rayon;
		Centre = centre;
	}
	public int getRayon() {
		return rayon;
	}
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	public Point getCentre() {
		return Centre;
	}
	public void setCentre(Point centre) {
		Centre = centre;
	}
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", Centre=" + Centre + "]";
	}
	
	
	
}
