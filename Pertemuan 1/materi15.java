public class materi15 {
	public static void main (String[] args) {
	
		for (int i=1; i<=7; i++) {  //loop for ke-1 
			for (int j=0; j<i; j++) //loop for ke-2 
			{  
				if(j==3) 
					break; 
				System.out.print(j); 	 
			}  
			System.out.println(); 
		}
	}
}
/*
kode di atas adalah contoh program dengan kondisi break.
keyword break akan menghentikan operasi dari loop for ke-2. Bukan dari loop for
ke-1. Int i akan melakukan perulangan sebanyak 7 kali
dan loop for ke 1 akan break apabila j=3 , dan kemudian
akan dilanjutkan ke loop ke 2 dimana j<i.
sehingga output yang dihasilkan adalah
0
01
012
012
012
012
012

*/