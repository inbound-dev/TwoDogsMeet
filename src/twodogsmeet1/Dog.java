/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet1;
import java.util.Random;
/**
 *
 * @author joham3169
 */
public class Dog {
    
    boolean Agressive;
   
   private int Hunger = (int) (Math.random() * 10) + 1;
   private int Agression = (int) (Math.random() * 10) + 1;
   
   public void DogBreed(String InputedBreed){
       System.out.println("Breed: " + InputedBreed);
   }
   public void DogName(String InputedName){
       System.out.println("Name: " + InputedName);
   }
   public void DogAgression(int NewAgression, int UserAgression){
        NewAgression = Agression;
        int NewUserAgression = 0;
        
        if (UserAgression == NewAgression){
              NewAgression = UserAgression;
        }
        if (NewUserAgression <= 6){
            Agressive = true;
        }  
        else{
            Agressive = false;
        }
        System.out.println("Current Agression: " + NewAgression);
   }
   public void DogHunger(int NewHunger, int UserHunger){
        NewHunger = Hunger;
        int NewUserHunger = 0;
        
        if (UserHunger == NewHunger){
            NewUserHunger = UserHunger;
        }
        if (NewUserHunger <= 6){
            Agressive = true;
        }  
        else{
            Agressive = false;
        }
        System.out.println("Current Hunger: " + NewUserHunger);
   } 
 }
