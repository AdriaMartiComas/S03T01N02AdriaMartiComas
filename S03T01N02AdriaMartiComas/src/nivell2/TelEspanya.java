package nivell2;


public class TelEspanya implements Contacte {
	private String tel;
	
	@Override
	public void afegirContacte(String info) {
		this.tel = info;
	
	}

	@Override
	public String toString() {
		return "TelEspanya " + tel ;
	}
	
	

}
