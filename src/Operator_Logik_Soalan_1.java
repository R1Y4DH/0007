import java.util.Scanner;
public class Operator_Logik_Soalan_1 {
public static void main (String[]args){
            
    int Bil_A;
    char Math;
    char BI;
    String Ulasan;
    
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Bilangan A dalam PT3");
Bil_A = input.nextInt();

System.out.println("Masukkan gred Matematik");
Math = input.next().charAt(0);
       input.close();
     
if (Math!='A'){
    Ulasan =("Anda tidak layak memasuki Kelas Sains Komputer")
}
       
System.out.println("Masukkan gred Bahasa Inggeris");
BI = input.next().charAt(0);
     input.close();

if (Bil_A<4){     
Ulasan = ("Anda tidak layak memasuki Kelas Sains Komputer")}
}
