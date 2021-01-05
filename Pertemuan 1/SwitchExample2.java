/**
* Program berikut untuk mencoba jika break tertinggal pada pernyataan
* case
*/ 
public class SwitchExample2 {
	public static void main(String[] args) {
		int number=20;
		switch(number){
		case 10: System.out.println("10");
		case 20: System.out.println("20");
		case 30: System.out.println("30");
		default:System.out.println("Not in 10, 20 or 30");
		}
	}
}
/* Penjelasan program diatas
Program ini juga menggunakan switch case, sama seperti
pada program SwitchExample, hanya saja disini tidak
ada break, sehingga program akan dijalankan adalah case 20
dan akan dijalankan juga case 30 serta defaultnya
*/