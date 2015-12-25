/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_test;

/**
 *
 * @author NotePad
 */
public class NotSuchMarkException extends Exception{
    public NotSuchMarkException(String s){
        System.out.println(s);
    }
}
