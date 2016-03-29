package main;

import model.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

        Utils.getCloseNeighbour(list.get(0).get(0), Utils.getRandomGlyhpByClass(list, 5), 5);
    }


}
