/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlinkedlist;

/**
 *
 * @author minter
 */
public class Test {

    public static void main(String[] args) {

        DLinkedList<Integer> liste = new DLinkedList<>();
        liste.addFirst(2);
        liste.addFirst(3);
        liste.addLast(66);
        liste.addFirst(7);
        liste.addLast(33);
        liste.addAfter(2, 77);
        liste.addAfter(7,-3);
        liste.addAfter(33, 0);
        liste.addBefore(2, -9);
        
        
        liste.print();
        
        liste.addBefore(7,0);
        
        
        liste.print();
        
        liste.remove(-9);
        liste.remove(2);
        liste.remove(0);
        
        liste.print();

    }
}
