package herenciainventada;

public class Informatico extends Empleado {
	String especialidad;
	int añosEnEmpresa;
	
	//constructor
	public Informatico (){}
	
	//setters
	public void setEspecialidad (String especialid){
		this.especialidad = especialid;
	}
	public void setAñosEnEmpresa (int añosEmpresa){
		this.añosEnEmpresa = añosEmpresa;
	}
	//getters
	public String getEspecialidad (){
		return this.especialidad;
	}
	public int getAñosEnEmpresa (){
		return this.añosEnEmpresa;
	}
	
	@Override
	public void  comentario(){
		super.comentario();
		System.out.println("este empleado mola"); 
	}
	//para que un metodo no sea modificado en otra subclase tendria que ser:
	//@Override
	//final String void  comentario(){
	//	super.comentario();
	//	System.out.println("este empleado mola"); 
	//}
	}
}
