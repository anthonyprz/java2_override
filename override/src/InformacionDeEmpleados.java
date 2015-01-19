package herenciainventada;
import java.util.Scanner;

public class InformacionDeEmpleados {
	public static void main (String [] args){
		String codigoInf, codigoLimp, nomb, ape, espe, dpst;
		int eda, añosEmp;
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
			System.out.println("¿cuantos años tiene trabajando en la empresa?");
			añosEmp = sc.nextInt();
			informatico.setAñosEnEmpresa(añosEmp);
			double sueldoAños;
			sueldoAños = sueld * añosEmp;
			
			//mostrar
			System.out.println("<><><><><><>informacion de los empleados<><><><><><>");
			System.out.println("codigo del empleado : "+informatico.getCodigoEmpleado());
			System.out.println("nombre : "+informatico.getNombre());
			System.out.println("apellido : "+informatico.getApellido());
			System.out.println("edad : "+informatico.getEdad());
			System.out.println("sueldo : "+informatico.getSueldo());
			System.out.println("especialidad : "+informatico.getEspecialidad());
			System.out.println("años en empresa : "+informatico.getAñosEnEmpresa());
			System.out.println("estas son las ganancias desde que ha empezado a trabajar: " + sueldoAños + "€");

			informatico.comentario();
			
			
			
	}
}
