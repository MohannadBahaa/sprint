import java.util.*;

public class Person {

    public  static  int counter=0;
    public  String firstName="Sonia";
    public  String lastName ="Kaboor";
    public  String adress="Bollywood";
    public  int dateOfBirth= 1980;
    public  String nationality= "indian";
    public  String city= "indian";
    public  double weight= 50;
    public  double height= 165;
    public  boolean isMale= false;


        public  Person ( ){
            System.out.println("i'am here ");
        }
        public Person (int counter,String firstName,String lastName,String adress,int dateOfBirth,String nationality, String city,double weight,double height, boolean isMale ){
            System.out.print("");
        }

        public  static void  getCounter(){
            counter++;
            System.out.println(counter);
        }

        public void getFullName(String firstName, String lastName){

                this.firstName = firstName;
                this.lastName = lastName;
                System.out.println(firstName + " " + lastName);
        }
        public  void getHeightInFeet(double height){
            double res = (this.height/10)/3;
            System.out.println(res);
        }

    public  void getAge(double dateOfBirth ){

         double age = Calendar.getInstance().get(Calendar.YEAR) - this.dateOfBirth ;
        System.out.println(age);
    }

    public  void eating(double weight ){
        this.weight += 1;
        System.out.println("iam eating");
        System.out.println(this.weight);

    }

    public  void getInfo(){
        String info = this.firstName + " " + this.lastName + " " + this.dateOfBirth + " " + this.city + " " ;
        System.out.println(info);

    }

    public void people(){
        double[] people = {1.9, 2.9, 3.4, 3.5}
    }

}


