public class Main {

    public static void main(String [] args){
        Person p1 = new Person();
        Person.getCounter();
        p1.getFullName(p1.firstName, p1.lastName );
        p1.getHeightInFeet(p1.height);
        p1.getAge(p1.dateOfBirth);
        p1.eating(p1.weight);
        p1.eating(p1.weight);
        p1.getInfo();
        Person p2 = new Person();
        Person.getCounter();
        Person p3 = new Person();
        Person.getCounter();


    }


}

