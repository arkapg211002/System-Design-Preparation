package LowLevelDesign.DesignPatterns.FlyWeightPattern.wordProcessor;

public class Main {

    public static void main(String args[]){

        /*
            this is the data we want to write into the word processor.

            Total = 58 characters
            t = 7 times
            h = 3 times
            a = 3 times and so on...

         */

        ILetter object1 = LetterFactor.crateLetter('t');
        object1.display(0,0);

        ILetter object2 = LetterFactor.crateLetter('t');
        object1.display(0,6);

    }
}
