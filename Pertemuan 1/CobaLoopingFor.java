/**
* Program berikut untuk mencoba looping for
*/
public class CobaLoopingFor
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
} 

/* Penjelasan tentang kode diatas
	program diatas merupakan perulangan for, 
	Perulangan for dipakai pada saat kita melakukan 
	perulangan dengan jumlah yang sudah diketahui pasti,
	int i akan melakukan perulangan sebanyak 10 kali(0-9) kebawah
	dan akan mencetak * pada setiap barisnya, sedangkan int j
	akan mencetak * kesamping , kemudian kembali ke looping i
	kemudian ke j begitu seterusnya hingga semua kondinya terpenuhi
	dan menghasilkan output * yang membentuk segitiga sikusiku 
*/