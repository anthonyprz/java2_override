package herenciainventada;
import java.util.Scanner;

public class InformacionDeEmpleados {
	public static void main (String [] args){
		String codigoInf, codigoLimp, nomb, ape, espe, dpst;
		int eda, a�osEmp;
		double sueld;
		Informatico informatico = new Informatico();

			Scanner sc = new Scanner (System.in);
			
			System.out.println("----------------para informatico--------------------");
			System.out.println("ingresa el codigo del empleado informatico");
			codigoInf = sc.next();
			informatico.setCodigoEmpleado(codigoInf);
			System.out.println("ingresa el nombre del empleado informatico");
			nomb = sc.next();
			informatico.setNombre(nomb);
			System.out.println("ingresa el apellido del empleado informatico");
			ape = sc.next();
			informatico.setApellido(ape);
			System.out.println("ingresa la edad del empleado informatico");
			eda = sc.nextInt();
			informatico.setEdad(eda);
			System.out.println("ingresa el sueldo del empleado informatico");
			sueld = sc.nextDouble();
			informatico.setSueldo(sueld);
			System.out.println("ingresa la especialidad del empleado informatico");
			espe = sc.next();
			informatico.setEspecialidad(espe);
			System.out.println("�cuantos a�os tiene trabajando en la empresa?");
			a�osEmp = sc.nextInt();
			informatico.setA�osEnEmpresa(a�osEmp);
			double sueldoA�os;
			sueldoA�os = sueld * a�osEmp;
			
			//mostrar
			System.out.println("<><><><><><>informacion de los empleados<><><><><><>");
			System.out.println("codigo del empleado : "+informatico.getCodigoEmpleado());
			System.out.println("nombre : "+informatico.getNombre());
			System.out.println("apellido : "+informatico.getApellido());
			System.out.println("edad : "+informatico.getEdad());
			System.out.println("sueldo : "+informatico.getSueldo());
			System.out.println("especialidad : "+informatico.getEspecialidad());
			System.out.println("a�os en empresa : "+informatico.getA�osEnEmpresa());
			System.out.println("estas son las ganancias desde que ha empezado a trabajar: " + sueldoA�os + "�");

			informatico.comentario();
			
			
			
	}
}
