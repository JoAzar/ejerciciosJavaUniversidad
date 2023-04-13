
public class Agenda {

	Persona[] contactos;
	String[] telefonos;
	
//==============SETTER Y GETTER INICIO=========================
	
	public Persona[] getContactos() {
		return contactos;
	}
	
	public void setContactos(Persona[] contacto) {
		if(contacto != null) {
			this.contactos = contacto;	
		}
	}
	
	public String[] getTelefono() {
		return telefonos;
	}
	
	public void setTelefonos(String[] telefonos) {
		this.telefonos = telefonos;
	}
	
//==============SETTER Y GETTER FIN============================
	
	
	Agenda(int tamano) {
		this.contactos = new Persona[tamano];
		this.telefonos = new String[tamano];
	}
	
	
	void guardar(Persona contacto, String telefono) {
		int cont = 0;
		for(int i = 0; i < telefonos.length; i++) {
			if(contactos[i] == null && telefonos[i] == null && cont == 0) {
				contactos[i] = contacto;
				telefonos[i] =	telefono;
				cont++;
			}
		}
	}
	
	
	public void imprimirAgenda() {
		String star = Character.toString(0x2b50);
		String n = Character.toString(0x1f338);	//flores
		String c = Character.toString(0x1f407);	//conejio
		String tel = Character.toString(0x1f4de);
		String linea = Character.toString(0x2501);
		String largo = "";
		String largoIcono = "";
	
		for(int i = 0; i < contactos.length; i++) {
			largo = "\n"+contactos[i]+"\n"+star+tel+" Teléfono:"+telefonos[i]+"  "+star+"\n";
			largoIcono = linea.repeat(largo.length()-25);
			System.out.println(largoIcono+"\n"+largo+"\n"+largoIcono);
		}
		
		
	}
	
}
