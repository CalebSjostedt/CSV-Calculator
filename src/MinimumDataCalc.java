import java.util.List;

public class MinimumDataCalc extends AbstractDataCalc{
    
    /**
     * Inherited constructor from abstract class
     * @param set
     */
    public MinimumDataCalc(DataSet set){
        super(set);
    }

    /**
     * @return "MIN"
     */
    @Override
    public String getType() {
        return "MIN";
    }

    /**
     * Finds the minimum value in the dataset
     * @return Minimum value of the dataset
     */
    @Override
    public double calcLine(List<Double> line) {
        
        double min = line.get(0);

        for(int i=0; i<line.size(); i++){
            
            if(min > line.get(i)){
                min = line.get(i);
            }
        }

        return min;
    }
}
