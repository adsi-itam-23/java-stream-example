package StreamExample;

import java.util.*;
import java.util.stream.*;



public class TareaStream{



    public final static int MAX = 80;

    public final static int MIN = 80;

    





    public static void main(String args[]){

        

        Punto punto = new Punto();

        Random rand = new Random();



        List<Punto> listaPuntos = new   LinkedList<Punto>();



        for(int i = 0; i<10 ; i++){

            punto = new Punto(rand.nextInt(MAX+MIN) - MIN ,rand.nextInt(MAX+MIN) - MIN);

            listaPuntos.add(punto);

        }

            



        System.out.print("-------------Puntos Generados------------------");

        listaPuntos.forEach( (Punto p) -> System.out.println("("+ p.getX()+","+p.getY()+")"));

        

        Stream<Punto> primerCuadrante = listaPuntos.stream().

            filter( (Punto p) -> p.getCuadrante() == Punto.Cuadrante.UNO);

        

        

        System.out.println("-----------UBICADOS EN EL PRIMER CUADRANTE-----------");

        primerCuadrante.forEach( p -> System.out.println("("+p.getX()+","+p.getY()+")"));

        //System.out.print(primerCuadrante);

    }





    public static class Punto{

        

        enum Cuadrante{

            UNO,

            DOS,

            TRES,

            CUATRO

        }



        private int x;

        private int y;

    

        public Punto(){

            this.x = 0;

            this.y = 0;

        }

    

        public Punto(int x, int y){

            this.x = x;

            this.y = y;

        }

    

        public int getX(){

            return this.x;

        }

    

        public int getY(){

            return this.y;

        }

    

        public Cuadrante getCuadrante(){

            if(x>=0 && y>=0){

                return Cuadrante.UNO;

            }else if(x>=0){

                return Cuadrante.CUATRO;

            }else if(y>=0){

                return Cuadrante.DOS;

            }else {

                return Cuadrante.TRES;

            }

        }

    

        public void setX(int x){

            this.x = x;

        }

    

        public void setY(int y){

            this.y = y;

        }

        

        public String toString(){

            return "";

        }

    }

}