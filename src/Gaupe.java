
public class Gaupe extends Dyr {
	
	private int lengde�retust;
	
	public Gaupe() {
	}

	public Gaupe(String id, String typeDyr, String kj�nn, int lengde, double vekt, String dato, String sted, int lengde�retust) {
		super(id, typeDyr, kj�nn, lengde, vekt, dato, sted);
		this.lengde�retust = lengde�retust;
		// TODO Auto-generated constructor stub
	}
	
	//Get og set for denne klassens variabler
	public int getLengde�retust() {
		return lengde�retust;
	}

	public void setLengde�retust(int lengde�retust) {
		this.lengde�retust = lengde�retust;
	}
	

	@Override
	public String toString() {
		return super.toString() + ", lengde �retust(cm): " + lengde�retust;
	}

}//Slutt klasse