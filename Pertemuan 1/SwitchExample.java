/**
* Program berikut untuk mencoba seleksi switch-case
*/
public class SwitchExample {
	public static void main(String[] args) {
		int number=20;
		switch(number){
		case 10: System.out.println("10");break;
		case 20: System.out.println("20");break;
		case 30: System.out.println("30");break;
		default:System.out.println("Not in 10, 20 or 30");
		}
	}
} 

/* Penjelasan program diatas
Statemen switch mirip seperti if-else if- else, 
bermakna hanya akan ada satu pernyataan saja 
yang akan dipilih, 
diketahui number 20. Jadi hanya satu case saja yang 
dijalankan yang terpenuhi sehingga dicetak 20 karena 
number = 20
*/