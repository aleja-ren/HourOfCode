public class HoC {
    public static void main(String[] args)  {
        /*
         * Codigo usado en el taller de introduccion a Java
         */

         //operaciones logicas
         //(A+B == 8) && (A-B == 2)
        int A = 5;
        int B = 3;
        System.out.println((A+B == 8) && (A-B == 2));
        
        //A > 3 && B > 3
        System.out.println(A > 3 && B > 3);

        //A > 3 || B > 3
        System.out.println(A > 3 || B > 3);

        //operaciones de incremento
        //incremento ++
        int var = 5;
        var++;
        System.out.println(var);

        //decremento --
        var = 5;
        var--;
        System.out.println(var);

        //incremento +=
        var = 5;
        var+=3;
        System.out.println(var);

        //decremento -=
        var = 5;
        var-=3;
        System.out.println(var);

        //producto *=
        var = 5;
        var*=2;
        System.out.println(var);


        /*
         * operadores numericos
         */
        //ejemplo precision
        double d1 = 0;
        double d2 = 0.1 * 8;

        for (int i = 1; i<=8; i++){
            d1+=0.1;
            //d1=d1+0.1
        }
        System.out.println(d1);
        System.out.println(d2);

        //solucion: asignamos un error epsilon
        double epsilon=0.000001;
        double resta = d1-d2;
        boolean valor;
        valor = resta < epsilon;
        System.out.println(valor);

        /*
         * ejemplos conversion de tipos
         */
        int i = 450;
        long l = i;
        double d = i;
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);

        //conversion explicita
        d = 9.64;
        i = (int) d;
        System.out.println(i);

        /*
         * Strings
         */
        String cadena = "Hora del codigo";
        System.out.println(cadena.length());
        System.out.println(cadena.charAt(2));
        System.out.println(cadena.indexOf("o"));

        /*
         * Arrays
         */
        int[]vector1= new int[5];
        int[]vector2= {0,1,2,3,4};

        /*
         * Matrices
         */
        int[][] matriz = new int[2][3];
        //numero de filas
        int filas=matriz.length;
        //numero de columnas
        int columnas=matriz[0].length;
        //acceso
        int primero = vector2[0];

        /*
         * estructuras de control
         */
        //IF
        int a = 16;
        int b = 2;
        if (b%a == 0){
            System.out.println("resto 0");
        }
        //IF ELSE
        int b1 = 2;
        int c = 15;
        if (c%b1 == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
        //IF ELSE 2
        int a1 = 0; //SUPONEMOS DESCONOCIDO EL VALOR
        if (a1==0){
            a1++;
        }else if(a1==1){
            a1--;
        }else{
            a1=a1*a1;
        }
        //BUCLE WHILE
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
        //BUCLE DO WHILE
        int i2 = 0;
        do{
            System.out.println(i2);
            i2++;
        }while (i2 < 5);
        //BUCLE FOR
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //RECORRIDO DE VECTORES
        int[]vector= {0,1,2,3,4};
        for (i = 0; i < vector.length; i++) {
            System.out.println(i);
            System.out.println(vector[i]);
        }
    }
}