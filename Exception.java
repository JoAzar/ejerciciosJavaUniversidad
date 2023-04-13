
public class Exception {

	public static void caracterDeString(String pal) {
		try {
			char c = pal.charAt(3);
			System.out.println(c);
		}catch(StringIndexOutOfBoundsException exc){
			System.out.println("Ingresar un numero entre 0 y "+(pal.length()-1) +", "+ exc.getMessage()+" caracteres");
		}
		try {
			if(pal.length()==0) {
				throw new RuntimeException("El String está vacío");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		String s1 = new String();
		s1 = "hol";
		caracterDeString(s1);
		
		

	}


}
