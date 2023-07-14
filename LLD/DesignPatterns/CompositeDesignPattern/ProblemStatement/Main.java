package LowLevelDesign.DesignPatterns.CompositeDesignPattern.ProblemStatement;

public class Main {

    public static void main(String args[]){

        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
