package contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import insurance.RisksCoef;

import java.time.LocalDate;

public class Contract  {

	private int ID;
	private List<RisksCoef> risks = new ArrayList<RisksCoef>();
	private String clientName;
	private double insuranceCoverage;
	private double insuranceCost;
	private double coef;
	private String carModel;
	private int productionYear;
	private int drivingExp;
	private int drivingExpCoef;
	private LocalDate dateStart;
	private LocalDate dateEnd;

	private static int ContractIDCounter = 0;

	public Contract() {
		this.ID = ContractIDCounter++;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getID() {
		return ID;
	}

	public List<RisksCoef> getRisks() {
		return risks;
	}

	public void addRisk(RisksCoef risk) {
		this.risks.add(risk);
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public double getInsuranceCoverage() {
		return insuranceCoverage;
	}

	public void setInsuranceCoverage(double insuranceCoverage) {
		this.insuranceCoverage = insuranceCoverage;
	}

	public double getInsuranceCost() {
		return insuranceCost;
	}

	public void setInsuranceCost(double insuranceCost) {
		this.insuranceCost = insuranceCost;
	}

	public double getCoef() {
		return coef;
	}

	public void setCoef(double coef) {
		this.coef = coef;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public int getDrivingExp() {
		return drivingExp;
	}

	public void setDrivingExp(int drivingExp) {
		this.drivingExp = drivingExp;
	}

	public int getDrivingExpCoef() {
		return drivingExpCoef;
	}

	public void setDrivingExpCoef(int drivingExpCoef) {
		this.drivingExpCoef = drivingExpCoef;
	}

	public LocalDate getDateStart() {
		return dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}

	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	public void calculateCoeficient() {
		ListIterator<RisksCoef> iterator = risks.listIterator();
		this.coef = 1;
 
		while (iterator.hasNext()) {
			// System.out.println("All risks : " + iterator.next());

			this.coef *= iterator.next().getCoef();
		}

	}

	public void calculateCost() {
		this.insuranceCost = this.insuranceCoverage * this.coef/100;
	}

	@Override
	public String toString() {
		ListIterator<RisksCoef> iterator = risks.listIterator();
		String allRisks = "";
		// Printing the iterated value
		// System.out.println("\nUsing ListIterator:\n");
		while (iterator.hasNext()) {
			// System.out.println("All risks : " + iterator.next());

			allRisks += iterator.next().name() + ",";
		}
		// return "Contract [ID=" + ID + "]";
		return "Contract ID=" + ID + "\n" + "  clientName=" + clientName + "\n" + "  carModel=" + carModel + "\n"
				+ "  productionYear=" + productionYear + " \n" + "  insuranceCoverage=" + insuranceCoverage + "\n"
				+ "  insuranceCost=" + insuranceCost + "\n" + "  coeficient =" + coef + "\n" + "  risks: " + allRisks
				+ "\n";
	}

}
