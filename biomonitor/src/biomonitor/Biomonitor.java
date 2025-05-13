package biomonitor;
import java.util.Scanner;
public class Biomonitor {
 
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter iron level");
        System.out.print("Enter: ");    double iron = input.nextDouble();
        
        System.out.println("enter vitamin level");
        System.out.print("Enter: ");    double vitaminD = input.nextDouble();
        
        System.out.println("enter sugar");
        System.out.print("Enter: ");    double sugar = input.nextDouble();
        
        System.out.println("enter your systolic and diastolic bloodpressure ");
        System.out.print("Enter: ");    double bloodsys = input.nextDouble();
        System.out.print("Enter: ");    double blooddia = input.nextDouble();
        
        System.out.println("enter Zinc");
        System.out.print("Enter: ");    double zinc = input.nextDouble();
        
        int r = 1;
        do{
            System.out.println("__________________________________________________________________");
        System.out.println("choose which you want to see\n 1 for iron    2 for Vitamin D    3 for sugar    4 for blood pressure    5 for zinc   0 to end the program");
        int x = input.nextInt();
         switch(x)
        {
             case 0 : r = input.nextInt();
             case 1 : iron(iron); break; 
             case 2 : VitaminD(vitaminD); break;  
             case 3 : sugar(sugar); break; 
             case 4 : bloodp(bloodsys, blooddia); break; 
             case 5 : zinc(zinc); break; 
             default: System.out.println("choose a correct num");
       
                 System.out.println("if you wish to end this program type 0, and if you don't then enter any number");
                 r = input.nextInt();
        } 
        }while (r != 0);
    }
    
   public static void iron(double iron)
     {
         if(iron<60){
         System.out.println("your iron level is too low\n\n");
         System.out.println("how to solve if iron is under normal levelseating foods high in iron \n" +
        "eating foods high in vitamin C to help iron absorption\n" +
        "taking iron supplements");
             
         System.out.println("symptoms if iron levels are below average: \n" +
        "Being pale or having yellow \"sallow\" skin.\n" +
        "Unexplained fatigue or lack of energy.\n" +
        "Shortness of breath or chest pain, especially with activity.\n" +
        "Unexplained generalized weakness.\n" +
        "Rapid heartbeat.\n" +
        "Pounding or \"whooshing\" in the ears.\n" +
        "Headache, especially with activity.");
             }
         
         else if (iron>170){
         System.out.println("how to solve if iron is over normal levels: have a generally healthy, balanced diet.\n" +
        "avoid breakfast cereals that have been \"fortified\" with extra iron.\n" +
        "avoid taking iron and vitamin C supplements – these may be harmful for people with high iron levels.");
         System.out.println("symptoms if iron levels are above average:\n" +
        "feeling very tired all the time (fatigue)\n" +
        "weight loss.\n" +
        "weakness.\n" +
        "joint pain.\n" +
        "an inability to get or maintain an erection (erectile dysfunction)\n" +
        "irregular periods or stopped or missed periods.\n" +
        "Brain fog, mood swings, depression and anxiety.");
         }
         
         
         else
         System.out.println("your iron level is healthy");
     }
   
   public static void VitaminD(double vitaminD){
    if (vitaminD>50){
         System.out.println("how to solve if over normal levels: avoiding vitamin D and calcium, ramping up your vitamin K intake, and staying super hydrated"
        + "symptoms if vitamin d levels are above average: \n" +
        "Confusion, apathy, recurrent vomiting, abdominal pain, polyuria, polydipsia, and dehydration");   
    }
    else if( vitaminD<20){
         System.out.println("how to solve if under normal levels: flesh of fatty fish and fish liver oils."
        + "symptoms if vitamin d levels are below average: \n" +
        "Frequent infections or illnesses.\n" +
        "Fatigue and muscle weakness. Because vitamin D is key to bone health, an insufficient amount can cause bone and muscle weakness, which can lead to fatigue.\n" +
        "Bone and joint pain.\n" +
        "Fractures.\n" +
        "Depression.\n" +
        "Slow wound healing.symptoms if vitamin d levels are below average: \n" +
        "Frequent infections or illnesses.\n" +
        "Fatigue and muscle weakness. Because vitamin D is key to bone health, an insufficient amount can cause bone and muscle weakness, which can lead to fatigue.\n" +
        "Bone and joint pain.\n" +
        "Fractures.\n" +
        "Depression.\n" +
        "Slow wound healing.");
    }
    else{
        System.out.println("your vitamin D level is healthy");   
    }
   } 
   
    public static void sugar(double sugar)
     {
     if (sugar>100)
     {
         System.out.println("the level of sugar is too high\n\n");
         
         System.out.println("how to treat if sugar levels are above average: \n" +
        "Be more active. ...\n" +
        "Take medicine as instructed. ...\n" +
        "Follow your diabetes meal plan. ...\n" +
        "Check your blood sugar as directed by your doctor. ...\n" +
        "Talk to your doctor about adjusting how much insulin you take and what types of insulin (such as short-acting) to use.\n");
         System.out.println("symptoms of high sugar levels: \n" +
        "Urinating large amounts.\n" +
        "Excessive thirst.\n" +
        "Feeling tired.\n" +
        "Frequent hunger.\n" +
        "Dry mouth.\n" +
        "Weight loss.\n" +
        "Blurred vision.\n" +
        "Recurrent infections (e.g., urinary infections, skin infections)\n" );
     }
     
     
     else if (sugar<70)
     {
         System.out.println("the level of sugar in the blood is too high\n\n");
         
         System.out.println("symptoms of high sugar levels: \n" +
        "Urinating large amounts.\n" +
        "Excessive thirst.\n" +
        "Feeling tired.\n" +
        "Frequent hunger.\n" +
        "Dry mouth.\n" +
        "Weight loss.\n" +
        "Blurred vision.\n" +
        "Recurrent infections (e.g., urinary infections, skin infections)\n"); 
         
         System.out.println("how to treat if sugar levels are above average: \n" +
        "Be more active.\n" +
        "Take medicine as instructed.\n" +
        "Follow your diabetes meal plan.\n" +
        "Check your blood sugar as directed by your doctor.\n" +
        "Talk to your doctor about adjusting how much insulin you take and what types of insulin (such as short-acting) to use.");
     }
     
     
     else
     {
         System.out.println("your sugar level is healthy");  
     }
     
     }
    
    public static void bloodp(double bloodsys, double blooddia)
    {
     if (bloodsys >120 || blooddia > 80)
     {
         System.out.println("your blood pressure is too high\n\n");
         System.out.println("symptoms of high blood pressure levels: \n" +
        "severe headaches.\n" +
        "chest pain.\n" +
        "dizziness.\n" +
        "difficulty breathing.\n" +
        "nausea.\n" +
        "vomiting.\n" +
        "blurred vision or other vision changes.\n" +
        "anxiety.\n");
         System.out.println("how to treat if blood pressure levels are above average: \n" +
        "manage stress \n" +
        "quit smoking \n" +
        "eat healthier \n" +
        "reduce sodium \n" +
        "exercise ");
     }
     else if (bloodsys<90)
     {
         System.out.println("your blood pressure is too low\n\n");
         System.out.println("symptoms of low blood pressure levels: \n" +
        "Blurry vision.\n" +
        "Confusion.\n" +
        "Dizziness.\n" +
        "Fainting (syncope)\n" +
        "Lightheadedness.\n" +
        "Nausea or vomiting.\n" +
        "Sleepiness.\n" +
        "Weakness.\n");
         System.out.println("how to treat if blood pressure levels are below average: \n" +
        "stay hydrated \n" +
        "eat more salt \n" +
        "healthy diet \n" +
        "eat smaller meals \n" +
        "medication ");
     }
     else
            System.out.println("your bloodpressure level is healthy");
    }
    
    public static void zinc(double zinc)
    {
        if (zinc >1.10)
        {
         System.out.println("the level of zinc in the blood is too high\n\n");
         System.out.println("symptoms if zinc levels are above average: \n" +
        "nausea\n" +
        "vomiting\n" +
        "epigastric pain\n" +
        "lethargy\n" +
        "fatigue\n");
         System.out.println("how to treat if zinc is over normal levels: \n" +
        "Intravenous (IV) fluids to avoid dehydration.\n" +
        "Medications to relieve nausea or stomach upset.\n" +
        "Chelation medications, which bind extra zinc so it can leave the body.\n");
        }
        else if (zinc < .60)
        {
         System.out.println("the level of zinc in the blood is too low\n\n");
         System.out.println("symptoms if zinc levels are above average: \n" +
        "nausea\n" +
        "vomiting\n" +
        "epigastric pain\n" +
        "lethargy\n" +
        "fatigue");
        }
        else 
            System.out.println("your zinc levels are healthy");
    }
}
