/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rmidemo;

import java.rmi.*;

public class MyClient {
    public static void main(String[] args) {
        try{
            Adder stub=(Adder)Naming.lookup("rmi://localhost:5001/demo");
            System.out.println("The output is: "+stub.add(4, 7));
            
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
