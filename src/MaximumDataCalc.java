import java.util.List;

public class MaximumDataCalc extends AbstractDataCalc{
    
    /**
     * Inherited constructor from abstract class
     * @param set
     */
    public MaximumDataCalc(DataSet set){
        super(set);
    }

    /**
     * @return "MAX"
     */
    @Override
    public String getType() {
        return "MAX";
    }

    /**
     * Finds the maximum value in the dataset
     * @return Maximum value of the dataset 
     */
    @Override
    public double calcLine(List<Double> line) {
        
        double max = 0;

        for(int i=0; i<line.size(); i++){
            if(max < line.get(i)){
                max = line.get(i);
            }
        }

        return max;
    }
}
