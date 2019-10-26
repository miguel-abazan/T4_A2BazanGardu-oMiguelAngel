
public class PruebaArbolBinario {

public static void main(String[] args) {
		
		ArbolBinario ab =  new ArbolBinario();
		
		ab.agergarElemnto(7);
		ab.agergarElemnto(14);
		ab.agergarElemnto(3);
		ab.agergarElemnto(9);
		ab.agergarElemnto(37);
		ab.agergarElemnto(1);
		
		ab.recorridoPreorden(ab.nodoRaiz);
		System.out.println();
		ab.recorridoEnorden(ab.nodoRaiz);
		System.out.println();
		ab.recorridoPostorden(ab.nodoRaiz); 
		
		
		
		
	}

}
