package pruebasubempleado;

import pruebaempleado.Empleado;

public abstract class EmpleadoBase extends Empleado {

	protected double horasTrabajadas;

	public EmpleadoBase(String nombre, double salario) {
		super(nombre, salario);
	}

}