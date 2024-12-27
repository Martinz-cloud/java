import java.util.Scanner;
public class PizzaWahala{
public static void main(String[] marz){

	String[] pizzaType = {"sapaSize", "smallMoney", "bigBoys", "odogwu"};
	
	int[] numberOfSlices = {4, 6, 8, 12};

	int[] pricePerBox = {2500, 2900, 4000, 5200};


Scanner input = new Scanner(System.in);



System.out.println("ENTER THE NUMBER OF SLICES YOU NEED: ");
	int slices = input.nextInt();

System.out.println(
	

	"PIZZA TYPE:\n" +

	"0 = SAPA SIZE,\n"+

	"1 = SMALL MONEY,\n" +

  	"2 = BIG BOYS,\n"+

	"3 = ODOGWU\n" +

	"ENTER THE PIZZA TYPE:"
);



	int pizzaTypeIndex = input.nextInt();
if (pizzaTypeIndex < 0 || pizzaTypeIndex >= pizzaType.length){
	System.out.println("Invalid selection");
	return;
}	
	int slicesPerBoxChosen = numberOfSlices[pizzaTypeIndex];
	int pricePerBoxChosen = pricePerBox[pizzaTypeIndex];

	int boxesNeeded = slices / slicesPerBoxChosen;

if (slices % slicesPerBoxChosen != 0){
	boxesNeeded++;
}

	int totalSlices = boxesNeeded * slicesPerBoxChosen;
	int leftOverSlices = totalSlices - slices;

	int totalPrice =boxesNeeded * pricePerBoxChosen;

System.out.println("Number of Boxes of pizza to buy = " + boxesNeeded + "boxes");

System.out.println("Number left over slices after serving = " + leftOverSlices + "slices");

System.out.println("price = " + totalPrice);

  }



} 