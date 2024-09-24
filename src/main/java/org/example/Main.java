package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bedroom bedroom = new Bedroom("Genç", new Wall("kuzey"), new Wall("güney"), new Wall("doğu"), new Wall("batı"), new Ceiling(2, PaintColor.WHITE), new Bed("King", 2, 2, 1, 1), new Lamp(LampType.NORMAL, true, 4), new Wardrobe(2,3, 4.5), new Carpet(2, 2, PaintColor.RED));

    }
}