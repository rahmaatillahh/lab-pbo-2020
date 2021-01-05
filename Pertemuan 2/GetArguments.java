/** 
 * Program berikut untuk mendapatkan nilai argumen pada method main
*/ 
public class GetArguments {
	public static void main(String args[]) {
		System.out.println("Tanggal : " + args[0]);
		System.out.println("Bulan : " + args[1]);
		System.out.println("Tahun : " + args[2]);
	}
}

/* Penjelasan program diatas
Method main memiliki parameter berupa array bertipe String. 
Berapapun argumen yang diketik saat running, akan disimpan dalam 
array tersebut dan diakses dengan menggunakan indeks. 
untuk menjalankan program yaitu dengan memasukkan argumen tanggal, 
bulan dan tahun. 
contohnya : java GetArguments 11 desember 2000
sehingga outputnya 
Tanggal : 11           11 akan disimpan pada args[0]
Bulan : desember		desember akan disimpan pada args[1] yaitu bulan
Tahun : 2000

*/

