import java.util.List;

public class AverageDataCalc extends AbstractDataCalc{
    
    /**
     * Inherited constructor from abstract class
     * @param set
     */
    public AverageDataCalc(DataSet set){
        super(set);
    }

    /**
     * @return "AVERAGE"
     */
    @Override
    public String getType() {
        
        return "AVERAGE";
    }


    /**
     * Calculates the average of the dataset
     * @return finalized output as a double
     */
    @Override
    public double calcLine(List<Double> line) {

        double sum = 0;

        for(int i=0; i<line.size(); i++){
            sum += line.get(i);
        }

        return sum / line.size();
    }


}
