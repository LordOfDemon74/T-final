import java.text.BreakIterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int edad=0;
        int entradas;
        int Pniños,Padultos, Padultosmayores;
        double Ptotal, Ptcdescuentos;
        String Pelicula;

        Scanner sc = new Scanner(System.in);
        //Cantidad de entradas    
        System.out.println("Ingrese la cantidad de entradas que desea ");
        entradas = sc.nextInt();
        System.out.println("Ingrese la cantidad de entradas para niños:");
        Pniños = sc.nextInt();
        System.out.println("Ingrese la cantidad de entradas para adultos:");
        Padultos = sc.nextInt();
        System.out.println("Ingrese la cantidad de entradas para adultos mayores:");
        Padultosmayores = sc.nextInt();
        
        //Se detiene el codigo hasta que el usuario ingrese las entradas correctamente
        while (entradas != Pniños + Padultos + Padultosmayores){
            System.out.println("La cantidad de entradas es incorrecta");
            System.out.println("Ingrese la cantidad de entradas que desea ");
            entradas = sc.nextInt();
            System.out.println("Ingrese la cantidad de entradas para niños:");
            Pniños = sc.nextInt();
            System.out.println("Ingrese la cantidad de entradas para adultos:");
            Padultos = sc.nextInt();
            System.out.println("Ingrese la cantidad de entradas para adultos mayores:");
            Padultosmayores = sc.nextInt();
        }
        


        //Edades de los clientes
        System.out.println("Introduce las edades de todos los usuarios");
        edad = sc.nextInt();      
   
        if (edad>0 && edad<18){
            System.out.println("El precio de las entradas es de $10");
        }else if (edad>=18 && edad<65){
            System.out.println("El precio de las entradas es de $20");
        }else if (edad>=65){
            System.out.println("El precio de las entradas es de $15");


        //Eleccion de peliculas
        System.out.println("Tenemos las siguietes peliculas disponibles:");
        System.out.println("op1. MINIONS");
        System.out.println("op2. TITANIC");
        System.out.println("op3. EL EXORCISMO ");

        System.out.println("La opcion1 es para todo el publico");
        System.out.println("La opcion2 es para adultos");
        System.out.println("La opcion3 es para adultos mayores");

        System.out.println("Ingrese la opcion que desea ver");
        Pelicula = sc.next();
        if (Pelicula.equals("op2")){
        System.out.println("Las entradas de los niños que son " + Pniños + "no pueden ver esta pelicula");
        System.out.println("Las entradas de los adultos que son " + Padultosmayores + "no pueden ver esta pelicula");
    }else if (Pelicula.equals("op3")){
        System.out.println("Los que compraron " +  Pniños + "No pueden ver esta pelicula" );
   

        //Precio total de las entradas
        Ptotal = (Pniños*10) + (Padultos*20) + (Padultosmayores*15);
        System.out.println("El precio total de las entradas es de: $" + Ptotal);

        //Descuentos

        if (Pniños >3){
            System.out.println("Usted tiene un descuento del 10%");
            Ptcdescuentos = entradas * 0.10;
        if (Padultos >3){
            System.out.println("Usted tiene un descuento del 15%");
            Ptcdescuentos = entradas * 0.15;
        }
        System.out.println("El precio total con descuento es de: $" + Ptcdescuentos);
        }
    }
}
}
}

        
    
    
    

