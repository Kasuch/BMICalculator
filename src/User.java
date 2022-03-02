/*
User creation
 */
public class User {
    private final float weight;
    private final float height;

    public User(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        double result;
        result = weight / (Math.pow((height / 100), 2));
        return result;
    }
}
