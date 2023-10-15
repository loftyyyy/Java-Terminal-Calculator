import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MET {
   
    public static void main(String[] args){
        double level, met, roundedMetNumber;
        String yesno, formattedMet;
        int metListIndex = 0;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        ArrayList levelList = new ArrayList<>();
        ArrayList metList60 = new ArrayList<>();
        ArrayList metList15 = new ArrayList<>();
        

        while (true) {
            
            System.out.print("Do you want to start or add another value? Y/N: ");
            yesno = input.next();
            if (yesno.equals("Y")){

                System.out.print("MET level: ");
                level = input.nextDouble();
                levelList.add(level);
                
                // Initial Met without multiplying the weight 
                met = (level * 3.5 * 53)/200;
                roundedMetNumber = Math.round(met * 100.0) / 100.0;
                formattedMet = df.format(roundedMetNumber); 
                metList60.add(df.format(Double.parseDouble(formattedMet) * 60));
                metListIndex++;
                metList15.add(df.format(Double.parseDouble(formattedMet) * 15));
                System.out.println(df.format(1.855));

            }else {
                if (metListIndex > 0){
                    //level*3.5*53/200 
                    for (int i = 0; i < metListIndex; i++){
                        if (metList60.size() > i) {
                            System.out.println("MET value for 60 and 15 mins in level " + levelList.get(i) +  " are: " + metList60.get(i) + " and " + metList15.get(i));
                            System.out.println("\n");
                        }
                    }
                    
                }else {
                    System.out.println("Goodbye!");
                    break;
                }
                break;
            }

        }        
        


        input.close();
    }    

}
