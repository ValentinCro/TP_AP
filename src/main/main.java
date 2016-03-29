package main;

import model.LabelledData;
import model.Utils;

import java.io.IOException;
import java.util.ArrayList;

public class main {

    public static void main (String args []) {
        ArrayList<ArrayList<byte[]>> list = null;
        try {
            list = Utils.loadImages("/home/valentin/dev/TP_AP/src/classe");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Utils.viewGlyph(list.get(3).get(10));
        System.out.println(Utils.calculEuclideanDistance(list.get(0).get(0), list.get(0).get(0)));


        ArrayList<LabelledData> randomGlyph = Utils.getRandomGlyhpByClass(list, 100);
        ArrayList<LabelledData> closeNeighbor = Utils.getCloseNeighbor(list.get(8).get(0), randomGlyph, 10);

        System.out.println(Utils.getClassByCloseNeighbor(closeNeighbor));
    }


}
