/**
* Program berikut untuk mencoba seleksi if-else if
*/
public class IfElseIfExample {
	public static void main(String[] args) {
		int marks=65;

		if(marks<50){
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60){ //kondisi 1
			System.out.println("D grade");
		}
		else if(marks>=60 && marks<70){ //kondisi 2
			System.out.println("C grade");
		}
		else if(marks>=70 && marks<80){ //kondisi 3
			System.out.println("B grade");
		}
		else if(marks>=80 && marks<90){ //kondisi 4
			System.out.println("A grade");
		}
		else if(marks>=90 && marks<100){ //kondiisi 5
			System.out.println("A+ grade");
		}
		else{
			System.out.println("Invalid!");
		}
	}
}
/*
Pernyataan if akan dilakukan jika keadaan1 mengembalikan nilai boolean true. Jika tidak maka
else if berikutnya akan dicek, jika true akan dilakukan pernyataan. Namun jika masih salah, akan
dilanjutkan ke else if berikutnya. Hingga jika semua pilihan else if tidak ada yang true, maka
pernyataan yang ada dalam else akan dilakukan.

Program diatas untuk mengecek nilai dan grade yang sesuai
Terdapat variabel marks =65
Jika nilai variabel marks <50 maka Output yang dihasilkan adalah "Fail"
Apabila kondisi 1 masih False, dimana nilai marks >=50 dan <60 maka dihasilkan output yaitu "D grade"
Apabila kondisi 2 masih False , dimana nilai marks >=60 dan <70 maka dihasilkan output yaitu "C grade"
Apabila kondisi 3 masih False , dimana nilai marks >=70 dan <80 maka dihasilkan output yaitu "B grade"
Apabila kondisi 4 masih False , dimana nilai marks >=80 dan <90 maka dihasilkan Output yaitu "A grade"
Apabila kondisi 5 masih False , dimana nilai marks >=90 dan <100 maka dihasilkan output yaitu "A+ grade"	
Jika Semua keadaan masih False maka output yang dihasilkan adalah "Invalid!" 
pada Program ini nilai marks = 65 yang berarti nilai marks terletak di >=60 dan <70 sehingga output yang 
dihasilkan adalah "C grade"
*/
