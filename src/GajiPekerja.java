


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Muizuddin
 */
public class GajiPekerja {
public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    
    String nama;
    double bil_jam;
    double bil_hari;
    double bil_ot;
    double jum_gaji;
    
System.out.println ("Masukkan nama: ");
    nama= input.nextLine();
//START-Bilangan jam kerja    
System.out.println ("Masukkan Bilangan Jam kerja: ");
    bil_jam= input.nextDouble();
    
        while(bil_jam>9){
            
    System.out.println ("Bilangan jam sehari tidak boleh melebihi 9 jam, Sila masukkan "
            + "bilangan jam yang betul: ");
    bil_jam= input.nextDouble();
        }
//END-Bilangan jam kerja

//START-Bilangan hari kerja
System.out.println ("Masukkan Bilangan Hari kerja: ");
    bil_hari= input.nextDouble();
    
        while (bil_hari>30){
       
    System.out.println ("Bilangan hari bekerja tidak boleh melebihi 30 hari, Sila masukkan"
            + "bilangan hari yang betul");
    bil_hari= input.nextDouble();
        }
//END-Bilangan hari kerja

//START-Bilangan jam OT
System.out.println ("Masukkan Bilangan Jam OT: ");
    bil_ot= input.nextDouble();
    
        while (bil_ot>50){
            
    System.out.println ("Bilangan jam ot tidak boleh melebihi 50 jam, Sila masukkan"
            + "bilangan jam ot yang betul: ");
    bil_ot= input.nextDouble();
        }
//END-Bilangan jam OT

        jum_gaji=(bil_jam*bil_hari*20)+(bil_ot*15);
        
System.out.println ("Rumusan gaji bulanan bagi: "+nama);
System.out.println ("Jumlah jam bekerja: "+bil_jam+"jam");
System.out.println ("Jumlah hari bekerja: "+bil_hari+"hari");
System.out.println ("Jumlah jam lebih masa: "+bil_ot+"jam");
System.out.println ("Jumlah Gaji: RM"+jum_gaji);
}
}
