/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.ino.dodawanie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class DodawanieTest {
    
    public DodawanieTest() {
    }

    @Test
    public void testDodaj() {
        System.out.println("dodaj");
        String a = "1";
        String b = "1";
        String expResult = "2";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodaj2() {
        System.out.println("dodaj2");
        String a = "0";
        String b = "0";
        String expResult = "0";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodaj3() {
        System.out.println("randomAdd");
        
        for(int i = 0 ; i<100;i++){
            for(int j=0 ;j<100;j++){
                String a = ""+i;
                String b = ""+j;
                String expResult = ""+(i+j);
                String result = Dodawanie.dodaj(a, b);
                assertEquals(expResult, result);
            }
        }

    }
    
    
    @Test
    public void testDodajNull() {
        System.out.println("dodajDefenicja");
        String a = null;
        String b = null;
        String expResult = "";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodajempty() {
        System.out.println("dodaj2");
        String a = "";
        String b = "";
        String expResult = "";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDodajFloat() {
        System.out.println("dodajFloat");
        String a = "5.5";
        String b = "10.5";
        String expResult = "16.0";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDodajNaN() {
        System.out.println("dodajNaN");
        String a = "NaN";
        String b = "NaN";
        String expResult = "NaN";
        String result = Dodawanie.dodaj(a, b);
        assertEquals(expResult, result);
    }

}
