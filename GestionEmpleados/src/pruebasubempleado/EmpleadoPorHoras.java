package pruebasubempleado;


public class EmpleadoPorHoras extends EmpleadoBase {
	private int horasTrabajadas;

	public EmpleadoPorHoras(String nombre, double salario, int horasTrabajadas) {
		super(nombre, salario);
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularPago() {
		return getSalario() * horasTrabajadas;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
}
