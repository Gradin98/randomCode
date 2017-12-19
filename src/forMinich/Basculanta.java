package forMinich;

import java.util.Scanner;

public class Basculanta extends Camion {

	private TipCamion tipCamion = TipCamion.basculanta;
	private double tonaj;

	@SuppressWarnings("resource")
	public Basculanta(String marca, String model, TipAutovehicol tip, TipCamion tipCamion) {
		super(marca, model, tip);
		this.tipCamion = tipCamion;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tonaj: ");
		this.tonaj = scanner.nextDouble();
	}

	public Basculanta(String marca, String model, TipAutovehicol tip) {
		super(marca, model, tip);
	}

	public TipCamion getTipCamion() {
		return tipCamion;
	}

	public void setTipCamion(TipCamion tipCamion) {
		this.tipCamion = tipCamion;
	}

	public double getTonaj() {
		return tonaj;
	}

	public void setTonaj(double tonaj) {
		this.tonaj = tonaj;
	}

	public String afisareDate() {
		return "Marca: " + this.getMarca() + " Model: " + this.getModel() + " Putere:" + this.getPutere() + " Tonaj:"
				+ tonaj + " TipCamion: " + tipCamion;
	}
}
