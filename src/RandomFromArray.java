import java.util.Random;
public class RandomFromArray {

    private int[] values;
    private int[] weight;
    private int[] ranges;
    private int sum;
    private int lastSum;

    public RandomFromArray(int[] values, int[] weight) {
        this.values = values;
        this.weight = weight;
        ranges = new int[values.length];

        sum = 0;
        for (int i = 0; i < weight.length; i++) {
            sum += weight[i];
        }

        lastSum = 0;
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weight[i];
        }
    }


    public int Random(){
        Random rand = new Random();
        int random = rand.nextInt(sum);
        int target = 0;
        for (int i = 0; i < ranges.length; i++) {
            if(ranges[i] > random){
                break;
            }
            target = i;
        }
        return values[target];
    }
}
