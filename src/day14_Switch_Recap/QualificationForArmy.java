package day14_Switch_Recap;

public class QualificationForArmy {

    public static void main(String[] args) {

        String citizen = "USA";
        boolean isResident = true;
        boolean isAlien = false;
        boolean hasHighSchoolDiploma = false;
        int numberOfDependent = 2;

        int age = 31;

        if(citizen == "USA" || isResident || isAlien){
            if(age >= 17 && age <=34){
                if(hasHighSchoolDiploma){
                    if(numberOfDependent <=2){
                        System.out.println("You are qualified to join the army");
                    }else{
                        System.err.println("You must have less than 2 dependents");
                    }
                }else{
                    System.err.println("You must have high school diploma");
                }
            }else{
                System.err.println("Your age must be between 17 and 34");
            }

        }else{
            System.err.println("You must be a US citizen or resident");


        }



    }


}
/*
2. What are the qualifications to join the Army?
            You must be a U.S. citizen or a resident alien.
            Be between the ages of 17-34. ...
            Have a high school diploma.
            Have no more than two dependents.
 */
