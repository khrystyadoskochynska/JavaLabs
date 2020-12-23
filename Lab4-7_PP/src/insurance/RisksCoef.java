package insurance;

public enum RisksCoef {

	theft(3.8), iatp(1.1), roadAccident(1.23), naturalDisaster(1.15), withoutPolice(1.05);

	private double coef;

	private RisksCoef(double coef) { this.coef = coef; }

	public double getCoef() {
		return this.coef;
	}

}
