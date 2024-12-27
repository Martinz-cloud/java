import java.util.Scanner;
public class RiderSalary{
public static void main(String[] marz){
Scanner input = new Scanner(System.in);

System.out.println("Enter the percentage of successful delivery: ");
	 int percentage = input.nextInt();

	int collectionRate1 = 160;

	int collectionRate2 = 200;

	int collectionRate3 = 250;

	int collectionRate4 = 500;

	int baseSalary = 5000;

	int totalPayment = 0;
if ( percentage < 50){
totalPayment = percentage * collectionRate1 + baseSalary; 
}else if ( percentage >= 50 &&  percentage <= 59 ){
 totalPayment = percentage * collectionRate2 + baseSalary;
}else if ( percentage >= 60 &&  percentage <= 69 ){
totalPayment = percentage * collectionRate3 + baseSalary;
}else if ( percentage >= 70){
totalPayment = percentage * collectionRate4 + baseSalary;
}

System.out.println("RIDER'S PAYMENT: " + totalPayment);




   }








}