/** 
 * Program berikut untuk menguji awalan atau akhir suatu string berntebet
*/ 
public class CopyArray3 {
 	public static void main(String args[]) { 
 
		String str1 = "Informatika Universitas Syiah Kuala";
		System.out.println(str1.startsWith("Inf"));
		System.out.println(str1.endsWith("kuala"));
		System.out.println(str1.startsWith("Inf",1));
		System.out.println(str1.startsWith("Inf",2));
		System.out.println(str1.startsWith("Inf",3));

	}
}

/*
penjelasan program diatas
kode diatas untuk mengecek string apakah awalan atau 
akhiran nya sama dengan string yg diketahui
misalnya pada line 8 mengecek apakah str1 dimulai 
dengan "Inf" , benar dimulai dengan inf maka outputnya true
begitu juga dengan line 12 mengecek apakah str1 dimulai
 dengan "Inf" pada indeks ke 3 => outputnya ifalse, karenayang benar adalah "orm"
*/
