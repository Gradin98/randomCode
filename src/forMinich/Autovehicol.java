package forMinich;

import java.util.Scanner;

public abstract class Autovehicol {

	private String marca;
	private String model;
	private int putere;

	public abstract void setPutere();

	public String afisareDate() {
		return "Marca: " + marca + " Model: " + model + " Putere:" + putere;
	}

	@SuppressWarnings("resource")
	public Autovehicol(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Putere: ");
		this.putere = scanner.nextInt();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPutere() {
		return putere;
	}

	public void setPutere(int putere) {
		this.putere = putere;
	}

}
