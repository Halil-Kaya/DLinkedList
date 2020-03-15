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
public class Node<T> {
    public T data;
    public Node<T> nextNode;
    public Node<T> prevNode;
    
    public Node(T data){
        this.data=data;
    }
    
    
}
