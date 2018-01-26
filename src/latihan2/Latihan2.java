/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author user
 */
public class Latihan2 {
public static void main (String[]args){
    
    int Kimia = 87;
    int Biologi = 77;
    int Addmath = 80;
    int Fizik = 90;
    int jwb = 334;
    
     System.out.println("hasil tambah:"+Kimia+'+' +Biologi+ '+' +Addmath+ '+' +Fizik+ '='+jwb);
    
     int purata = (Kimia + Biologi + Addmath + Fizik)/4;
     System.out.println("purata untuk empat matapelajaran:"+purata);
       
     int peratus = (Kimia + Biologi + Addmath + Fizik)*100/4;
     System.out.println("peratus untuk empat matapelajaran:"+peratus);
    }
    
}
