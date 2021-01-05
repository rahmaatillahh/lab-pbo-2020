public class Array1 {
	public static void main(String args[]) { 

	int nilai[]=new int[3]; 
 	nilai[0]=70; 
	nilai[1]=80; 
	nilai[2]=65; 
	double ratarata=0.0; 

 	for(int i=0; i<nilai.length; i++)  
 		ratarata+=nilai[i]; 

 
 	ratarata/=nilai.length; 
 	System.out.println("Nilai rata-rata = " + ratarata); 
 
	} 
} 
/* Penjelasan program diatas
Kode diatas merupakan kode untuk menghitung ratarata
elemen array. Program ini menghasilkan output  nilai rata2 dari array 
nilai  yaitu 70, 80, 65
rata-ratanya adalah 71.66666666666667 ratarata tersebut bertipe double
*/
