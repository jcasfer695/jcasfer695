package pruebasubempleado;


public class EmpleadoTiempoCompleto extends EmpleadoBase {
	public EmpleadoTiempoCompleto(String nombre, double salario, double horasTrabajadas) {
		super(nombre, salario);
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularPago() {
		return getSalario();
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
}
