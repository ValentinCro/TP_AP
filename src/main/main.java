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

        ArrayList<LabelledData> randomGlyph = Utils.getRandomGlyhpByClass(list, 100);
        ArrayList<LabelledData> closeNeighbor = Utils.getCloseNeighbor(list.get(7).get(23), randomGlyph, 10);

        System.out.println(Utils.getClassByCloseNeighbor(closeNeighbor));
    }


}
