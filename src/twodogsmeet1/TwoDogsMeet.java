/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet1;
import java.util.Scanner;
/**
 *
 * @author joham3169
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        Dog dog = new Dog();
        System.out.println("What is the name of the first Dog?");
        String NewName1 = Input.next();
        System.out.println("Next What is the breed?");
        String NewBreed1 = Input.next();
        System.out.println("Would you like to change it's agression? If so type a Number to set it to");
        int UserAgression = Input.nextInt();
        System.out.println("Would you like to change the Hunger property? If so type a Number to set it to");
        int UserHunger = Input.nextInt();
        
        Dog dog1 = new Dog();
        
        System.out.println("What is the name of the second Dog?");
        String NewName2 = Input.next();
        System.out.println("Next What is the breed?");
        String NewBreed2 = Input.next();
        System.out.println("Would you like to change it's agression? If so type a Number to set it to");
        int UserAgression1 = Input.nextInt();
        System.out.println("Would you like to change the Hunger property? If so type a Number to set it to");
        int UserHunger1 = Input.nextInt();
        
        System.out.println("Two Dogs Are Being Created");
        System.out.println("Here are the details of your Dogs");
        System.out.println("");
        
        System.out.println("Dog 1");
        
        dog.DogName(NewName1);
        dog.DogBreed(NewBreed1);
        dog.DogAgression(0, UserAgression);
        dog.DogHunger(0, UserHunger);
        
        System.out.println("");
        System.out.println("Dog 2");
        
        dog1.DogName(NewName2);
        dog1.DogBreed(NewBreed2);
        dog1.DogAgression(0, UserAgression1);
        dog1.DogHunger(0, UserHunger1);
        
        if (dog1.Agressive == true && dog.Agressive == true){
            System.out.println("GRRRRRRRR");
            System.out.println("The Dogs are fighting :( ");
        }
        if (dog1.Agressive == true || dog.Agressive == true){
            System.out.println("GRRRRRRRR");
            System.out.println("The Dogs are fighting :( ");
        }
        else{
            System.out.println("The Meeting is freindly");
        }
    }
}
    

