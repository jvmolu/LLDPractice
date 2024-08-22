package problems.snakeAndLadder;

import java.util.ArrayList;
import java.util.Arrays;

public class Dice {
    int numberOfFaces;

    ArrayList<Faces> faces;

    public Dice(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
        faces = new ArrayList<Faces>();
        faces.addAll(Arrays.asList(Faces.values()).subList(0, numberOfFaces));
    }

    public Faces Generate() {
        int faceValue = (int) (Math.random() * numberOfFaces) + 1;
        return faces.get(faceValue - 1);
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    public void setNumberOfFaces(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public ArrayList<Faces> getFaces() {
        return faces;
    }

    public void setFaces(ArrayList<Faces> faces) {
        this.faces = faces;
    }


}
