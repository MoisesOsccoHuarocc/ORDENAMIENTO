/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ordenacion_Insercion_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // ORDENAMIENTO POR SELECCIÓN
            //El método de ordenación por inserción es similar al proceso típico de ordenar tarjetas de nombres
            //(cartas de una baraja) por orden alfabético consistente en insertar un nombre en su posición
            //correcta dentro de una lista que ya está ordenada.
            System.out.println("ORDENACION POR INSERCION"); 
		int[] lista = {1,26,35,652,487,968,1542,147,326,63,9,8,57,4,2,0,36,784,1542,369,1478,254,20};
		int i,j;
		int auxiliar;

		for (i = 1; i < lista.length; i++)
		{	
			auxiliar = lista[i];	
			j = i - 1;
			
			while ( (j >= 0) && lista[j] > auxiliar )	
			{				
				lista[j+1] = lista[j--];	
			}
			
			lista [j+1] = auxiliar;	
		}
            System.out.println("LOS NUMEROS ORDENADOS SON:"); 
		for(i=0;i<lista.length;i++)
		{
			System.out.print(lista[i]+", ");
		}
	}
    
}
    
    

