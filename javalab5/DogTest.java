package keong_katelin_lab05;

/**
 *
 * @author Katelin Keong A00699796 ACIT 2B
 */

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest {

    public static void main(String[] args) {
        
        Labrador labrador = new Labrador("Rudy", "yellow");
        System.out.println(labrador.getName() + " says " + labrador.speak());
        
        Yorkshire yorkshire = new Yorkshire("Max");
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
        
        KillerWolf killerwolf = new KillerWolf ("Rex");
        System.out.println(killerwolf.getName() + " says " + killerwolf.speak());
        
        System.out.println("The average breed weight for a labrador dog is " 
        + labrador.avgBreedWeight());
        System.out.println("The average breed weight for a yorkshire dog is " 
        + yorkshire.avgBreedWeight());
        System.out.println("The average breed weight for a killer wolf is " 
        + killerwolf.avgBreedWeight());
        
    }
} 
