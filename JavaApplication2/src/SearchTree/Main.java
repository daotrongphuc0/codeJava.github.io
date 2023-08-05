/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchTree;

import java.util.Scanner;

/**
 *
 * @author daotr
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node a = new Node(5);
        //a = Node.insert(a, 5);
        a = Node.insert(a, 4);
        a = Node.insert(a, 6);
        a = Node.insert(a, 2);
        a = Node.insert(a, 3);
        Node.print(a);
    }
}
