public class Testtrycatch2
{  
    public static void main(String args[])
    {  
        try
        {  
            int data=10/0;  
        }catch(ArithmeticException e){
            System.out.println(e);
        }  
   
        System.out.println("rest of the code...");  
    }  
}  

/ **
	Outputnya berupa:
	java.lang.ArithmeticException: / dengan nol
	sisa kode ...
	maksudnya eror pada kode program sudah dihandle dengan menerapkan konsep penanganan pengecualian
	sehingga saat dijalankan seharusnya menghasilkan eror, namun karena sudah dihandle akan diprint
	erornya namun program tetap berjalan hingga selesai
* /