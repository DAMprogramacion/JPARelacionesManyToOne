package test;
import java.time.LocalDate;

import controller.DepartamentoController;
import controller.EmpleadoController;
import model.Departamento;
import model.Empleado;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Departamento departamento = new Departamento();
//		departamento.setFechaCreacion(LocalDate.now());
//		departamento.setNombreDepartamento("departamento1");
//		DepartamentoController.crearDepartamento(departamento);
//		DepartamentoController.obtenerTodosDepartamentos().
//			forEach(System.out::println);
//		System.out.println(
//				DepartamentoController.obtenerDepartamentoPorId(1));
//		DepartamentoController.borrarDepartamentoPorId(0);
		Empleado empleado = new Empleado();
		empleado.setNombreEmpleado("agustinin fernández");
		empleado.setSalario(10.01f);
		EmpleadoController.crearEmpleado(empleado, 5);
	}

}
