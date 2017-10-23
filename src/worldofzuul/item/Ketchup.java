/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofzuul.item;

import worldofzuul.character.Player;

/**
 *
 * @author mikkellarsen
 */
public class Ketchup extends Item {
    /**
     * Creating a constructor of the class Ketchup
     * Extending the class Item
     */
    public Ketchup() {
        super("Ketchup");
    }
    @Override
    public void use(Player player) {
        for(Item item : player.getItems()) {
            if(item.getName().equals("Steak")){
                item.use(player);
                return;
            } 
        }
        System.out.println("You need a steak to put ketchup on.");
    }
}
