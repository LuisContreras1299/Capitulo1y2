/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1;
import java.util.Scanner;
/**
 *
 * @author luism
 */
public class E19_EchoJava 
{
    public static void main(String[] args)
 {
    for(int i=0; i<args.length; i++)
    {
    System.out.println(args[i]);
    }
    System.out.println("Total: "+args.length+" argumentos");
 }
}
