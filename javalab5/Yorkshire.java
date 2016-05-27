package keong_katelin_lab05;

/**
 *
 * @author Katelin Keong A00699796 ACIT 2B
 */

// *****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// *****************************************************************
public class Yorkshire extends Dog {
    private int breedWeight = 6;
    
    public Yorkshire(String name) {
        super(name);
    }
    public Yorkshire(String name, int weight) {
        super(name);
        breedWeight = weight;
    }
// -------------------------------------------------------------
// Small bark -- overrides speak method in Dog
// -------------------------------------------------------------

    public String speak() {
        return "woof";
    }
// ------------------------------------------------------------
// Returns weight
// ------------------------------------------------------------

    public int avgBreedWeight() {
        return breedWeight;
    }
}

