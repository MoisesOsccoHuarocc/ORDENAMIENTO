/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ordenacion_Rapida_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ORDENACIÓN RÁPIDA (QuickSort)
        //se basa en dividir los n elementos de la lista a ordenar en dos partes o particiones
        //separadas por un elemento: una partición izquierda, un elemento central denominado pivote
        //o elemento de partición y una partición derecha.
            System.out.println("ORDENACION RAPIDA (QUICKSORT)");
		Ordenacion_Rapida_2 qs = new Ordenacion_Rapida_2();
		
		int numerosAOrdenar[] = {65,58,96,45,2,3,9,7,4,5,7845,963,120,147,625,297,78,23,81};
		
		qs.quickSort(numerosAOrdenar, 0, numerosAOrdenar.length-1);
            System.out.println("LOS NUMEROS ORDENADOS SON: ");
		for(int i=0; i<numerosAOrdenar.length;i++)
		{
			System.out.print(numerosAOrdenar[i]+", ");
		}

	}
	

	private void quickSort(int numerosAOrdenar[], int izq, int der) 
	{
            
		  int pivote = numerosAOrdenar[izq]; 
		  int i=izq;        
		  int j=der;    
		  int auxiliar;
		 
		  while(i < j)
		  {                                                    
		     while(numerosAOrdenar[i] <= pivote && i < j) i++; 
		     while(numerosAOrdenar[j] > pivote) j--;          
		     if (i < j) 
		     {                                         
		    	 auxiliar = numerosAOrdenar[i];                   
		    	 numerosAOrdenar[i] = numerosAOrdenar[j];
		    	 numerosAOrdenar[j] = auxiliar;
		     }
		   }
		   
		  numerosAOrdenar[izq] = numerosAOrdenar[j];                                      
		  numerosAOrdenar[j] = pivote;     
		   
		   if(izq < j-1)
		   {
			   quickSort(numerosAOrdenar,izq,j-1);          
		   }
		   if(j+1 < der)
		   {
			   quickSort(numerosAOrdenar,j+1,der);          
		   } 
	}

}

