/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchTree;

/**
 *
 * @author daotr
 */
public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    public boolean isEmpty(Node root){
        if(root ==null) return true;
        return false;
    }
    
    public static Node insert(Node node,int data){
        if(node ==null) return new Node(data);
        if(node.getData()==data) return node;
        else{
            if(data<node.getData()) node.setLeft(insert(node.left,data));
            else node.setRight(insert(node.right,data));
        }
        return node;
    }
    public static void print(Node node){
        if(node != null) {
            Node.print(node.getLeft());
            System.out.print(node.getData()+" ");
            
            Node.print(node.getRight());
        }
    }
    @Override
    public String toString() {
        return  "             " + this.data + "\n"
                +this.left +"                         "+ this.right ;
    }
    
    
}
