package LowLevelDesign.DesignPatterns.FlyWeightPattern;

public class RoboticDog implements IRobot{

    private String type;
    private Sprites body; //small 2d bitmap (graphic element)

    RoboticDog(String type, Sprites body){
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {

        //use the Robotic Dog sprites object
        // and X and Y coordinate to render the image.

    }
}

