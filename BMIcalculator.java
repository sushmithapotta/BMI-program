import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args){
        Scanner scanner =new Scanner (System.in);
        System.out.println("enter weight in kgs");
        float weight = scanner.nextFloat();
        System.out.println("enter  height in meters");
        float height = scanner.nextFloat();
        float bmi=weight/(height*height);
        System.out.println(" body mass index is:"+bmi);
        if(bmi<18.5){
            System.out.println("under weighted");
        }else if((bmi>=25)&&(bmi<=29.5)){
            System.out.println("over weighted");
        }else if (bmi>=30){
            System.out.println("obesity");
        }else{
            System.out.println("moderate weight");
        }
        scanner.close();
}
}
