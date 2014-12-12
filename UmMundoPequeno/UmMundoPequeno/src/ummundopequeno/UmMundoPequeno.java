/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ummundopequeno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class UmMundoPequeno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Brother brother;
        List<Brother> list = new ArrayList<>();
        List<Brother> hither = new ArrayList<>();
        int op = 0;
        do {
            System.out.println("1 - Add Friend (Name CoordinateX CoordinateY). 2 - Calculate Distances. 0 - Exit.");
            op = scanner.nextInt();
            if (op == 1) {
                brother = new Brother();              
                brother.setName(scanner.next());               
                brother.setX(scanner.nextInt());                
                brother.setY(scanner.nextInt());
                
                list.add(brother);
            } else if (op == 2) {                
                double distance = 0;
                for (int i = 0; i < list.size(); i ++) {
                    System.out.println();
                    System.out.println("- " + list.get(i).getName());
                    hither.clear();
                    for (int j = 0; j < list.size(); j++) {
                        if (j == i)
                            j ++;
                        if (j >= list.size())
                            break;
                        distance = Math.sqrt(Math.pow((list.get(j).getX() - list.get(i).getX()),2) + Math.pow((list.get(j).getY() - list.get(i).getY()),2));
                        
                        brother = new Brother();
                        brother.setName(list.get(j).getName());
                        brother.setDistance(distance);
                        hither.add(brother);
                    }    
                    Collections.sort(hither);
                    System.out.println("Closer Friends: ");
                    System.out.printf(hither.get(0).getName() + " D: %.2f \n", hither.get(0).getDistance());
                    System.out.printf(hither.get(1).getName() + " D: %.2f \n", hither.get(1).getDistance());
                    System.out.printf(hither.get(2).getName() + " D: %.2f \n", hither.get(2).getDistance());                    
                }                  
            }            
        } while (op != 0);
    }
    
}
