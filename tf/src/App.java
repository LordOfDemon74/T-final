import java.util.Scanner;

public class App {
    private static final int[] Array = null;

    public static void main(String[] args) throws Exception {
        int edades=0;
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
        
        //Ingresando las edades 

        for (int i = 1; i <= Pniños ; i++) {
            System.out.println("Ingrese la edad del niño N°" + (i));
            edades = sc.nextInt();
            while (edades < 0 || edades > 12) {
                System.out.println("La edad ingresada es incorrecta");
                System.out.println("Ingrese la edad del niño N°" + (i));
                edades = sc.nextInt();
            }

        }
        for (int i = 1; i <= Padultos ; i++) {
            System.out.println("Ingrese la edad del adulto N°" + (i));
            edades = sc.nextInt();
            while (edades < 13 || edades > 64) {
                System.out.println("La edad ingresada es incorrecta");
                System.out.println("Ingrese la edad del adulto N°" + (i));
                edades = sc.nextInt();
            }

        }
        for (int i = 1; i <= Padultosmayores ; i++) {
            System.out.println("Ingrese la edad del adulto mayor N°" + (i));
            edades = sc.nextInt();
            while (edades < 65 || edades > 120) {
                System.out.println("La edad ingresada es incorrecta");
                System.out.println("Ingrese la edad del adulto mayor N°" + (i));
                edades = sc.nextInt();
            }

        }
        
              
        if (edades>0 && edades<18){
            System.out.println("El precio de las entradas es de $10");
        }else if (edades>=18 && edades<65){
            System.out.println("El precio de las entradas es de $20");
        }else if (edades>=65){
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




