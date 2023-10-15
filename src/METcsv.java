import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class METcsv {
    
    public static void main(String[] args){
        double met, roundedMetNumber;
        String level, formattedMet;
        int metListIndex = 0;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        ArrayList levelList = new ArrayList<>();
        ArrayList metList60 = new ArrayList<>();
        ArrayList metList15 = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        
        System.out.print("MET level in CSV or Comma Separated Values i.e: 1.5, 1.3, 1.5: ");
        level = input.nextLine();
        String[] valueArray = level.split(",");
        
        //for each value in the value array, add it into the values arraylist
        for (String value : valueArray) {
            values.add(value.trim()); // Trim to remove leading/trailing spaces
        }
        
        for (String value : values){
            // Initial Met without multiplying the weight 
            met = (Double.parseDouble(value) * 3.5 * 53)/200;
            roundedMetNumber = Math.round(met * 100.0) / 100.0;
            formattedMet = df.format(roundedMetNumber); 
            metList60.add(df.format(Double.parseDouble(formattedMet) * 60));
            metListIndex++;
            metList15.add(df.format(Double.parseDouble(formattedMet) * 15)); 
        }
        
        if (metListIndex > 0){
            //level*3.5*53/200 
            for (int i = 0; i < metListIndex; i++){
                System.out.println("MET value for 60 and 15 mins in level " + values.get(i) +  " are: " + metList60.get(i) + " and " + metList15.get(i) + " Kcal");
                System.out.println("\n");
            }
                    
        }else {
            System.out.println("Goodbye!");
            
        }
    input.close();
    }

} 

