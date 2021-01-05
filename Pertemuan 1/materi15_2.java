public class materi15_2 {
	public static void main (String[] args) {
	
		for (int i=1; i<=7; i++) {   	//loop for ke-1 
			if(i == 3 )
				break;
			for (int j=0; j<i; j++)  	//loop for ke-2 
			{   
				System.out.print(j); 	 
			}  
			System.out.println(); 
		}
	}
}

/*
Penjelasan kode diatas
kode di atas adalah contoh program loop for. 
Hampir sama dengan materi 15 tapi disini break 
berada di dalam loop for ke-1 sehingga break 
akan menghentikan operasi dari loop for ke-1.

*/