package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Garage<Jaguar>jaguarGarage = new Garage<>();
        jaguarGarage.setW(new Jaguar());
        jaguarGarage.print(jaguarGarage.getW());


        Garage<lexus>lexusGarage = new Garage<>();
        lexusGarage.setW(new lexus());
        lexusGarage.print(lexusGarage.getW());

        Garage<Mercedes_Benz>mercedes_benzGarage = new Garage<>();
        mercedes_benzGarage.setW(new Mercedes_Benz());
        mercedes_benzGarage.print(mercedes_benzGarage.getW());

        Garage<BMW>bmwGarage = new Garage<>();
        bmwGarage.setW(new BMW());
        bmwGarage.print(bmwGarage.getW());
    }

}
