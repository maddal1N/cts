package ro.ase.cts.Facade.program;

import ro.ase.cts.Facade.clase.Facade;
import ro.ase.cts.Facade.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1,10);

//        if(OperatorMese.esteLibera(masa1.getNrMasa())){
//
//            Picolo picolo1=new Picolo("Georgescu");
//            if(picolo1.esteDebarasata(masa1.getNrMasa())){
//                if(picolo1.esteAranjata(masa1.getNrMasa())){
//                    System.out.println("Poftiti la masa!");
//                }
//                else{
//                    System.out.println("Mai asteptati.");
//                }
//            }
//            else{
//                System.out.println("Mai asteptati.");
//            }
//        }
//        else{
//            System.out.println("Mai asteptati.");
//        }

        if(Facade.esteMasaPregatita(new Masa(30,4))){
            System.out.println("Poftiti la masa!");
        }
        else{
            System.out.println("Mai asteptati.");
        }

    }
}
