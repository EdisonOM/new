/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onionproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
/*Iterator<String>itr=name.iterator()
itr.hasNext();
itr.getNext();
*/
/**
 *
 * @author Edison.Morrow
 */
public class ProjectOnion {
 private  String name;
    private  String effector;

    public ProjectOnion(String name, String effector) {
        this.name = name;
        this.effector = effector;
    }

    public String getName() {
        return name;
    }

    public String getEffector() {
        return effector;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

 

    public static void main(String[] args) {
        String p = null;
        String exiter = null;
        while (exiter == null) {
            Map<Inventoryitem, Integer> inventory = new HashMap();
            Inventoryitem itemName = new Inventoryitem("item", "Item:");
            Inventoryitem numberOItems = new Inventoryitem("itemNumber", "Number");
            Inventoryitem exit = new Inventoryitem("exit", "exit");
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter your string: ");
            String str = reader.next();
            if (str.equals("EXIT")) {
                p = "exit";
            }
            inventory.put(exit, p);
            inventory.put(itemName, 3);
            inventory.put(numberOItems, 3);
            Set<Inventoryitem> setInventory = inventory.keySet();
            for (Inventoryitem item : setInventory) {
                if (item = exit) {
                    exiter = exit;
                }

            }

        }

    }
}
