/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keong_katelin_lab05;

/**
 *
 * @author Katelin Keong A00699796 ACIT 2B
 */
public class KillerWolf extends Yorkshire {


public KillerWolf(String name){
        super(name, 45);
}
// -------------------------------------------------------------
// Growl -- overrides speak method in Dog
// -------------------------------------------------------------

    public String speak() {
        return "Grrrrr";
    }
}    

