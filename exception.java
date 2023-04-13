
public class exception {

	 public static int maximo(int[] a) {
	        
	        // Completar tirando una excepcion si el arreglo a es vacío
	     	try {
	     		if(a.length == 0) {
	     			throw new RuntimeException("El arreglo a está vacío");
		     		}
	     			int max = a[0];
	     	        for (int i = 0; i < a.length; i++) {
	     	        	if (a[i] > max) {
	     	        		max = a[i];
	     	        	}
	     	        } 
	     	       return max;
	   
		 		}catch (RuntimeException ex){
					System.out.println("=======================================\nERROR -> "+ex.getMessage()+"\n=======================================");
	 			return -1;
			}     
	  }

//===============================================================================
	 
	public static String voltearPalabra(String pal) {
		try {
			if(pal.isEmpty()) {
				throw new RuntimeException("El string ingresado no tiene characteres ");
			}else{
				if(pal.length() == 0) {
					return pal;
				}
				return voltearPalabra(pal.substring(1)) + pal.charAt(0);	//substring recorre el string "casa" hasta el caracter 1
			}
			
		}catch(RuntimeException ex) {
			System.out.println("=======================================\nERROR -> "+ex.getMessage()+"\n=======================================");
			return "";
		}
		
	}



//===============================================================================

    public static int cantidadApariciones(String s, char c) {
        int cantidad = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                cantidad++;
        }
        return cantidad;
    }
    
    public static char caracterMasRepetido(String s) {
        // Completar tirando una excepcion si el String s es vacío
    	try {
    		if(s.length() == 0) {
    			throw new RuntimeException("El string ingresado está vacío");
    		}
    		char masRepetido = s.charAt(0);
	        int max = cantidadApariciones(s, s.charAt(0));
	        for (int i = 1; i < s.length(); i++) {
	            int cantidad = cantidadApariciones(s, s.charAt(i));
	            if (max < cantidad) {
	                masRepetido = s.charAt(i);
	                max = cantidad;
	            }
	        }
	        return masRepetido;
    	}catch(RuntimeException ex){
    		System.out.println("=======================================\nERROR - "+ex.getMessage());
    		return '@';
    	}
        
       
    }
    
//===============================================================================
	    
	    public static double dividir(double a, double b) {
	        //
	        // Completar tirando una excepcion si se usa con:
	        // 0/0 (Indeterminado!)
	        // b=0 (No se puede dividir por 0!)
	        //
	        double c = a / b;
	        return c;
	    }  

	    public static void main(String[] args) {
	        int[] arr = new int[0];
	        int[] arr2 = {};
	        int[] arr3 = {1,2,3,24};
	        //
	        // Usar try/catch para la siguiente línea
	        //

	        if(maximo(arr) == -1) {
	        	System.out.println("El largo de su array es: "+arr.length+"\n");
	        }else{
	        	 System.out.println("El numero más grande del array es: "+maximo(arr3));
	        }

	        if(maximo(arr2) == -1) {
	        	System.out.println("El largo de su array es: "+arr.length+"\n");
	        }else{
	        	 System.out.println("El numero más grande del array es: "+maximo(arr3));
	        }
	        
	        if(maximo(arr3) == -1) {
	        	System.out.println("El largo de su array es: "+arr.length+"\n");
	        }else {
	        System.out.println("El numero más grande del array es: < "+maximo(arr3)+" >");
	        }
	        
	        
	       // Usar try/catch para la siguiente línea        
	        String coso1 = "";
	        String coso2 = "casa";
	        if(caracterMasRepetido(coso1) == '@') {
	        	System.out.println("=======================================");
	        }else{
	        	System.out.println(caracterMasRepetido(""));
	        }
	        if(caracterMasRepetido(coso2) == '@') {
	        	System.out.println("hago otra cosa");
	        }else{
	        	System.out.println("Este es el caracter más repetido: < "+caracterMasRepetido(coso2)+" >");
	        }
	        
	        System.out.println(voltearPalabra(coso1));
	        
	        //Usar try/catch para las siguientes líneas
	        
	        double x = 1;
	        double y = 0;
	        double z = 0;
	        System.out.println(dividir(x, y));
	        System.out.println(dividir(z, y));


	}

}
