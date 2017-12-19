package forMinich;

public class Autobuz extends Autovehicol {

	private TipAutovehicol tip = TipAutovehicol.autoVehicolCamion;

	public Autobuz(String marca, String model, TipAutovehicol tip) {
		super(marca, model);
		this.tip = tip;
	}

	@Override
	public void setPutere() {
		// TODO Auto-generated method stub

	}

	public TipAutovehicol getTip() {
		return tip;
	}

	public void setTip(TipAutovehicol tip) {
		this.tip = tip;
	}

}
