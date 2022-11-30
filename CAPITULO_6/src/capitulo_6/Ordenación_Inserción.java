/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_6;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ordenación_Inserción {
    
    public static void main(String[] args)
	{
            // ORDENAMIENTO POR SELECCIÓN
            //El método de ordenación por inserción es similar al proceso típico de ordenar tarjetas de nombres
            //(cartas de una baraja) por orden alfabético consistente en insertar un nombre en su posición
            //correcta dentro de una lista que ya está ordenada.
            System.out.println("ORDENACION POR INSERCION"); 
		int[] lista = {2,4,5,1,6,34,12,67,123,54,264,639,998,1204,5632,784,9652,10,57,78,96,30,154};
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
