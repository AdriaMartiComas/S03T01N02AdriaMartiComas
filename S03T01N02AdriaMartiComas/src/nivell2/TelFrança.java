package nivell2;

public class TelFrança implements Contacte {
	private String tel;

	@Override
	public void afegirContacte(String info) {
		this.tel = info;
	}

	@Override
	public String toString() {
		return "TelFrança " + tel;
	}

}
