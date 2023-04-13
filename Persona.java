
public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String signoZodiacal;
	private int DNI;
	
	Persona(String nombre, String apellido, int edad, String signo, int dNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.signoZodiacal = signo;
		this.DNI = dNI;
	}
	
//===========================GETERS Y SETTERS INICIO===================================

	public String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre) {
		if(nombre.length() < 2 && nombre != null) {
			this.nombre = nombre;
		}else {
			System.out.println("ERROR - Nombre invalido");
		}
	}
	
	public int getEdad() {  
		return edad;
	 }
	
	public void setEdad(int edad) {
	  if(edad < 0 || edad > 100 ) {   
		  System.out.println("ERROR - Edad invalida");
	  }else{
	   this.edad = edad;  
	  }
	}
	
	public String getApellido() {
		return apellido;
	}
	
	void setApellido(String apellido) {
		if(apellido.length() < 2 && apellido != null) {
			this.apellido = apellido;
		}else {
			System.out.println("ERROR - Apellido invalido");
		}
	}
	
	public String getSigno() {
		return signoZodiacal;
	}
	
	void setSigno(String signo) {
		this.signoZodiacal = signo;
	}
	
	
	public int getDNI() {
	  return DNI; 
	}
	
	public void setDNI(int dNI) {
		this.DNI = dNI;
	}
//===========================GETERS Y SETTERS FIN===================================
	
	void imprimir() {
		String c = Character.toString(0x2501);
		String largoIcono="";
		String largo = "|"+" Nombre: "+nombre+" | Apellido: "+apellido+" | Edad: "+edad+" | DNI: "+DNI+ " | Signo: "+signoZodiacal+" |";
		for(int i=0; i < largo.length(); i++) {
			largoIcono+= c;
		}
		System.out.println(largoIcono);
		System.out.println(largo);
		System.out.println(largoIcono);
		System.out.println(" ");
}

//===============METODOS DE CLASE==================================
	public String toString() {
		String c = Character.toString(0x2501);
		String largoIcono="";
		String largo = "[ Nombre: "+nombre+" | Apellido: "+apellido+" | Edad: "+edad+" | DNI: "+DNI+ " | Signo: "+signoZodiacal+" ]";
		for(int i=0; i < largo.length(); i++) {
			largoIcono+= c;
		}
		return "\n"+largo+"\n";

	}
	
	static Persona BuscarA(Persona[] grupo, String nombre) {
		Persona candidato = null;	
		for(Persona p:grupo) {
			if(p.nombre.equals(nombre)) {
				candidato = p;
			}
		}
		return candidato;
	}
	
	
	static Persona saberSiEsta(Persona[] grupo, String nombre) {
		for(Persona p:grupo) {
			if(p.nombre.equals(nombre)) {
				return p;
			}
		}
		return null;
	}
	
	boolean mismoSigno(Persona otro) {
		return this.signoZodiacal.equals(otro.signoZodiacal);
	}
	
	boolean masJovenQue(Persona otro) {
		return this.edad < otro.edad;
	}
	
	boolean mismaPersona(Persona otro) {
		return this.DNI == otro.DNI && this.nombre.equals(otro.nombre) && this.edad == otro.edad && this.apellido.equals(otro.apellido);
	}
	
	public boolean tocayo(Persona otro) {
		return this.nombre.equals(otro.nombre);
	}
//======================METODOS DE CLASE FIN=========================
}
