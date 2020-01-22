package gps;
/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
	
	/**
	 * Constructor de la clase que crea una bicicleta de la marca Orbea con 4 ruedas y sin luces.
	 */
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    /**
     * Se determina la ruta más corta de tres caminos y se devuelve en forma de String.
     * @param camino1 int[] Contiene los km de los tramos del camino1.
     * @param camino2 int[] Contiene los km de los tramos del camino2.
     * @param camino3 int[] Contiene los km de los tramos del camino3.
     * @return String con el camino cuya ruta es más corta.  
     */
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        sum1 = sumarLongitudRuta(camino1);
        sum2 = sumarLongitudRuta(camino2);
        sum3 = sumarLongitudRuta(camino3);      
        
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
        
    }
    
    /**
     * Se suman los valores enteros del array pasado por parámetro y se devuelve el valor de la suma.
     * @param camino int[] Contiene los km de los tramos del camino.
     * @return Se devuelve la suma de los km de los tramos del camino.  
     */
     public static int sumarLongitudRuta(int[] camino) {
     	int longitud = 0;
     	if(camino.length != 0) {
     		for(int i=0; i<camino.length; i++) {
     			longitud += camino[i];
        	 	}
     	}
     	return longitud;    	 
     }

     /**
 	 * Método en donde empieza el programa. Se crea un objeto Bicicleta y un int[] con tres caminos posibles, y 
 	 * posteriormente se llama a un método que calcula la ruta más corta para imprimirla por pantalla.
 	 * @param args Array de valores String que recibe el método al inicio. Son opcionales.
 	 */
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25};
        int[] camino2 = {24,1,5,64,10,15,21};
        int[] camino3 = {1,5,6,7,8,10,20,46,104};
        System.out.println("El camino más corto es:"+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}

