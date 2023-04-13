
public class Arreglos {
	
	static boolean esSinRepetidos(int[] arr) {
		boolean flag = false;
		for(int i=0; i < arr.length -1; i++) {
			for(int j= i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					flag = true;
				}
			}
		}	
		return flag;
	}
	
	static int[] pegar(int[] arr1, int[] arr2) {
		int longitud = arr1.length + arr2.length;
		int[] nuevo = new int[longitud];
		int cont = 0;
		for(int i=0; i < arr1.length; i++) {
			nuevo[i] = arr1[i];
		}
		for(int i=arr1.length; i < longitud; i++) {
			nuevo[i] = arr2[cont];
			cont++;
		}
		
		return nuevo;
	}
	
	static void imprimirArray(int[] arr) {
		System.out.print("[ ");
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	
	static int[] agregarAlFinal(int[] arr, int elem) {
		int[] nuevo = new int[arr.length+1];
		for(int i=0; i < nuevo.length; i++) {
			if(i < arr.length) {
				nuevo[i] = arr[i];
			}else{
			nuevo[i] = elem;
			}
		}
		return nuevo;
	}
	
	
	static int[] sinRepetidos(int[] arr) {
		int[] nuevo = new int[arr.length];
		int cont = 0;
		for(int i=0; i < arr.length; i++) {
			boolean existe = false;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					existe = true;
					break;
				}
			}
			if(!existe) {
				nuevo[cont] = arr[i];
				cont++;
			}
		}
		int[] resu = new int[cont];
		for(int i = 0; i < cont; i++) {
		    resu[i] = nuevo[i];
		}
		return resu;
	}
	
	static void invertir(int[] arr) {
		int[] arrAux = new int[arr.length];		//	int[] arr2 = {2, 4, 5, 10, 20, 3, 2};
		int aux = arr[0];
		int cont = 0;
		for(int i=arr.length-1; i >= 0; i--) {
			if(i == 0) {
				arrAux[cont] = aux;
			}else {
				System.out.print(arrAux[cont]);
				arrAux[cont] = arr[i];
				cont++;
			}
		}
	}
	
}
