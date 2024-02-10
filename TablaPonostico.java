package Clase;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class TablaPonostico {

    public void calculos(){
        double[] demandda = { 133,292,383,302,400,505,608,667,783,785,799};
        double[] periodo = {1,2,3,4,5,6,7,8,9,10,11,12 };

        double pronostico= calcularPronostico(demandda,periodo,10);
        System.out.println("Pronostico mes 10 :"+pronostico);



        //creamos un Stream del arreglo
        DoubleStream StreamPeriodo = DoubleStream.of(periodo);
        //iterar en cada elemento
        StreamPeriodo.forEach((element)->{
            System.out.println("mes="+element+"Pronostico"+Math.round(calcularPronostico(demandda,periodo,element)));
        });


    }


    private double calcularPronostico (double[]y,double[]x,double valorx){
        double n = y.length;
        double sumXY = 0;
        double sumX= Arrays.stream(x).sum();
        double sumY = Arrays.stream(y).sum();
        double sumX2= Arrays.stream(x).map(xi-> xi *xi).sum();

        for (int i=0; i<n;i++){

            sumXY += x[i]*y[i];
        }


    }



}
