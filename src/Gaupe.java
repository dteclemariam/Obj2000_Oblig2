
public class Gaupe extends Dyr {
	
	private int lengdeØretust;
	
	public Gaupe() {
	}

	public Gaupe(String id, String typeDyr, String kjønn, int lengde, double vekt, String dato, String sted, int lengdeØretust) {
		super(id, typeDyr, kjønn, lengde, vekt, dato, sted);
		this.lengdeØretust = lengdeØretust;
		// TODO Auto-generated constructor stub
	}
	
	//Get og set for denne klassens variabler
	public int getLengdeØretust() {
		return lengdeØretust;
	}

	public void setLengdeØretust(int lengdeØretust) {
		this.lengdeØretust = lengdeØretust;
	}
	

	@Override
	public String toString() {
		return super.toString() + ", lengde øretust(cm): " + lengdeØretust;
	}

}//Slutt klasse