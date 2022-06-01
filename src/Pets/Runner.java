package Pets;

import java.util.Scanner;
public class Runner{

    public static void main(String[] args)	{
        Cat c = new Cat("Couch",0,0,1000,1000,"blue");
        Dog d = new Dog("Hiro",0,0,9999,9999,"brown");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an animal:\t");
        String animal = scanner.nextLine();

        if(animal.equals("dog")){
            System.out.println("The name of this animal is " + "" + d.getName());
            System.out.println("The cuteness level of this animal is " + "" + d.getCutenessLevel());
            System.out.println("The awesome level of this animal is " + "" + d.getAwesomeLevel());
            System.out.println("The eye color of this animal is " + "" + d.getEyeColor());
        }
        else if(animal.equals("cat")){
            System.out.println("The name of this animal is " + "" + c.getName());
            System.out.println("The cuteness level of this animal is " + "" + c.getCutenessLevel());
            System.out.println("The awesome level of this animal is " + "" + c.getAwesomeLevel());
            System.out.println("The eye color of this animal is " + "" + c.getEyeColor());
        }
        else{
            System.out.println("That animal is not in the database yet");
        }

    }
}