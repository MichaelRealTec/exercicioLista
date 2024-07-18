package entities;

public class Employee {
	// Atributo
	private Integer id;
	private String name;
	private Double salary;
	
	// Métodos Getters e Setters
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	// Método construtor
	public Employee(){
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Método
	public void increaseSalary(double percentage) {
		salary = salary + salary * percentage / 100;
	}
	
	public String toString() {
		return id + " , " + name + ", "
				+ String.format("%.2f", salary);
	}
	
	
	
}
