import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int sayi,a=0,b=1,c;
	System.out.print("Sayıyı giriniz: ");
	sayi = intscanner.nextInt();


	for(int i=0;i<sayi;i++){

		c=a+b;
		a=b;
		b=c;
	    System.out.print(c+" ");




    }
    }
}
