/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_6;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ordenación_Rapida {
    
    public static void main(String[] args)
	{
        //ORDENACIÓN RÁPIDA (QuickSort)
        //se basa en dividir los n elementos de la lista a ordenar en dos partes o particiones
        //separadas por un elemento: una partición izquierda, un elemento central denominado pivote
        //o elemento de partición y una partición derecha.
            System.out.println("ORDENACION RAPIDA (QUICKSORT)");
		Ordenación_Rapida qs = new Ordenación_Rapida();
		
		int numerosAOrdenar[] = {3,5,14,34,22,1,67,32,78,5,451,200,100,999,1120,6,7,8,18,3265,478251};
		
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
    

