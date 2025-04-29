package entities;

public class Employee {

	//Atributos
	private String name;
	protected Integer hours;
	protected Double valuePerHour;

	//Construtores
	public Employee() {
	
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	//Get e set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	//Métados - Calcular salario com base nas horas trabalhadas
	public Double payment() {
		return valuePerHour * hours;
	}
	
}
