import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDataCalc {
    private DataSet set;
    private List<Double> outputArray;


    /**
     * Parent constructor that calls setAndRun for the inputted dataset
     * @param set Inputted Dataset
     */
    public AbstractDataCalc(DataSet set){  
        setAndRun(set);
    }

    /**
     * Creates an instance of the Dataset and runs calculations if dataset contains values
     * @param set Inputted Dataset
     */
    public void setAndRun(DataSet set){

        this.set = set;

        if(set != null){
            runCalculations();
        }
    }

    /**
     * Driver of the calculations. Creates an output arraylist with the values from calcLine
     */
    private void runCalculations(){
    
        outputArray = new ArrayList<>();
        
        for(int i=0; i<set.rowCount(); i++){

            outputArray.add(calcLine(set.getRow(i)));

        }
    }

    /**
     * Creates a readable report of the specified dataset calculation
     */

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
            
            output.append(String.format("Dataset Results  (Method: %s)\n", getType()));

            for(int i=0; i<set.rowCount(); i++){
                output.append(String.format("Row %d: %.1f\n", i+1, outputArray.get(i)));
            }
        

        return output.toString();       
        
    }

    public abstract String getType();

    public abstract double calcLine(List<Double> line);
}
