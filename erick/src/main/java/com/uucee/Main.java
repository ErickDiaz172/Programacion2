package com.uucee;

import com.uucee.objetos.Persona;
public class Main {
    public static void main(String[] args) {  

    


   

        Persona juan = new Persona();
        juan.setNombre( "juan");
        juan.apellido="Perez";
        juan.edad=30;
        juan.dinero=40;
        //juan.hablar();

        juan.dinero=30;
        juan.setNombre( "Carlos");
        //juan.hablar();

        Persona pedro = new Persona();
        pedro.setNombre( "Pedro");
        pedro.apellido = "Gomez";
        pedro.edad= 25;
        pedro.dinero = 30;
        //pedro.hablar();

        pedro = juan;
        pedro.hablar();
        
        Persona mario = pedro;
        mario.hablar();
        mario.setNombre("mario");
        pedro.hablar();

 

           }
   
   


    }



