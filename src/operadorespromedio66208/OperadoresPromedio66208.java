
package operadorespromedio66208;

public class OperadoresPromedio66208 {

    public static void main(String[] args) {
       //utilice un array y sume cada uno de ello
       //entiendo el array pero no del todo el for que hice
       //de este vi un video tutorial en youtube de como sumar datos
       //de un array, por lo demas interprete 
       //aqui el video=https://www.youtube.com/watch?v=PTgVfuMx_SA
       int datoProm[];
       datoProm = new int[5];
       datoProm[0] = 7;
       datoProm[1] = 6;
       datoProm[2] = 8;
       datoProm[3] = 10;
       datoProm[4] = 5;
       int Total=0;
       int promedioFinal = 0;
       for(int contador = 0;contador<datoProm.length;contador++){
       
       Total+= datoProm[contador];
    }
    promedioFinal = Total/5;
        System.out.print("El Promedio es:"+promedioFinal+"\n");
        //Hice un segundo ejercicio pero con lo que yo se, mucho menos optimo
        //pero directo de mi conocimiento optenido en clase
        float v1=8;
        float v2=9;
        float v3=9;
        float v4=7;
        float v5=9;
        float Promedio=(v1+v2+v3+v4+v5)/5;
        System.out.print("El promedio es:"+Promedio+"\n");
        //nota: pude ver que es mejor usar un float por el residuo de la divicion
    
    }
    
}
