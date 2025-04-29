package entities;

public class OutsouredEmployee extends Employee {

	//Atributos
	private Double additionalCharge;

	//Construtores
	public OutsouredEmployee() {

	}

	public OutsouredEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);  //Puxando os atributos da superclass
		this.additionalCharge = additionalCharge;
	}

	//Get e set
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment(){
		return super.payment() + additionalCharge * 1.1;
	}
	
	

}
