/** 
* Program berikut untuk mencoba seleksi if-else
*/
public class IfElseExample {
	public static void main(String[] args) {
		int number=13;
		if(number%2==0){
			System.out.println("Angka genap");
		}else{
			System.out.println("Angka ganjil");
		}
	}
}

/*
Penjelasan program diatas
Pernyataan if hanya akan dilakukan jika keadaan
mengembalikan nilai boolean true. Jika if mengembalikan 
nilai false maka pernyataan yang ada dalam else akan dilakukan.
Program diatas untuk mengetahi apakah 13 merupakan
bilangan genap atau ganjil. Terdapat number dengan
nilai 13 dan bertipe imteger,  karna 13 modulo 2 
adalah 1, maka yang akan dicetak adalah pilihan 
else yaitu "Angka ganjil"
*/