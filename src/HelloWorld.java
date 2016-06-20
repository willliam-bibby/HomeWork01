
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class HelloWorld {

  public static void main(String[] args) throws IOException {
	  
	  flowerBedTask ();
	  nameTask ();
  }

  public static void flowerBedTask () {
	  System.out.println("What is the radius of your Flower Bed?");
	  Scanner sc = new Scanner (System.in);
	  int radius = sc.nextInt();
	  FlowerBed myFlowerBed = new FlowerBed (radius);
	  System.out.println("Your Flower Bed has circumference " + round(myFlowerBed.getCircumference(),2 ) + " units") ;
	  System.out.println("and an area of " + round(myFlowerBed.getArea(),2) + " square units") ;
	  System.out.println("");
	  
  }

  
  private static double round (double number, int sigFigs) {
	  double result = Math.round(number * Math.pow(10 , sigFigs)) /Math.pow(10 , sigFigs);
	  return result;
	  
  }

  
  public static void nameTask () throws IOException {
	  BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	  System.out.println("Hello. What is your name?");
	  String name = br.readLine();
	  System.out.println("How old are you?");
	  int age = Integer.parseInt(br.readLine());
	  System.out.println("Hello " + name);
	  System.out.println("You are " + age);
	  System.out.println("");	  
  }

    
  
  
}