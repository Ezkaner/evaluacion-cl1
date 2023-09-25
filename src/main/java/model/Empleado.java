package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpleado;
	private String Apellidos;
	private String Nombres;
	private int Edad;
	private String Sexo;
	private double Salario;
	
	public Empleado() {
		
	}

	public Empleado(int IdEmpleado, String apellidos, String nombres, int edad, String sexo, double salario) {
		super();
		this.idEmpleado = IdEmpleado;
		this.Apellidos = apellidos;
		this.Nombres = nombres;
		this.Edad = edad;
		this.Sexo = sexo;
		this.Salario = salario;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int iddEmpleado) {
		idEmpleado = iddEmpleado;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
}
