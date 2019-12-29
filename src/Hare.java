
public class Hare extends Dyr {
	
	private String typeHare;
	private String fargePels;

	public Hare() {
	}
	
	public Hare(String id, String typeDyr, String kjønn, int lengde, double vekt, String dato, String sted, String typeHare, String fargePels) {
		super(id, typeDyr, kjønn, lengde, vekt, dato, sted);
		this.typeHare = typeHare;
		this.fargePels = fargePels;
	}
	
	//Get og set fra attributter i egen klasse
	public String getTypeHare() {
		return typeHare;
	}


	public void setTypeHare(String typeHare) {
		this.typeHare = typeHare;
	}

	public String getFargePels() {
		return fargePels;
	}


	public void setFargePels(String fargePels) {
		this.fargePels = fargePels;
	}
	

	@Override
	public String toString() {
		return super.toString() + ", typeHare: " + typeHare + ", fargePels: " + fargePels;
	}

} //Slutt klasse
