/**
* Program berikut untuk mencoba seleksi if
*/
import java.util.Scanner;

	public class IfExample {

		public static void main(String[] args) {
			int age=0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Masukkan umur anda:");
			age = sc.nextInt();
			
			if(age>=17)
				System.out.print("Anda sudah boleh buat KTP");
 	}
} 
/*
Penjelasan program diatas
kita diminta untuk memasukkan umur kita, 
nah apabila kita masukkan umur 17 tahun 
atau lebih dari 17 tahun, maka akan tercetak 
"Anda sudah boleh buat KTP"
Namun jika umur yang kita masukkan kurang 
dari 17 maka program akan berhenti dan tidak 
tercetak apa apa
*/