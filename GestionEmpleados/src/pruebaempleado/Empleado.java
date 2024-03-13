package pruebaempleado;


public abstract class Empleado implements Trabajador {
	private String nombre;
	private double salario;
	private String domicilio;
	private String provincia;
	private String pais;
	
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}
	
	@Override
	public abstract double calcularPago();
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public double getSalario() {
		return salario;
	}
	
	@Override
	public String getDatosEmpleado() {
		return ("Nombre: " + getNombre() + " - Salario: " + getSalario());
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getProvincia() {
		return provincia;
	}

	public String getPais() {
		return pais;
	}
}
