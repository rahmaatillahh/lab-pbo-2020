public class materi15_3 {
	public static void main (String[] args) {
	
		Mulai :
		for (int i=1; i<=7; i++) {  //loop for ke-1 
			for (int j=0; j<i; j++) //loop for ke-2 
			{  
				if(j==3) 
					break Mulai; 
				System.out.print(j); 	 
			}  
			System.out.println(); 
		}
	}
}
/*
Penjelasan tentang kode diatas
program ini jga hampir sama dengan materi 15 dan materi 15_1,
namun disini break akan menghentikan operasi pada statemen Mulai, 
bermakna keluar dari loop for ke-1. 
sehingga output yang dihasilkan adalah
0
01
012
012

*/