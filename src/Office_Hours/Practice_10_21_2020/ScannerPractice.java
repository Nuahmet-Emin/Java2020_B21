package Office_Hours.Practice_10_21_2020;
import java.util.Scanner;
// import statement: used for importing the sources from outside packages
// import PackageName.*; // import all class from the package
// import PackageName.ClassName; // a single class from the package
public class ScannerPractice {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
         int score = scan.nextInt();
         scan.close();

         String grade ="";

         if(score >= 0 && score <=100){
/*
             if(score >= 90){ // becomes false when score < 90
                 grade = "A";
             }else if(score >= 80){
                 grade = "B";
             }else if(score >= 70){
                 grade = "C";
             }else if(score >= 60){
                 grade = "D";
             }else{
                 grade = "F";
             }

*/
             grade = (score >= 90)? "A" : (score >= 80)? "B" : (score >= 70)? "C" : (score >= 60)? "D" : "F";

        }else {
             grade = "Invalid";
         }
        System.out.println(grade);


    }
}
