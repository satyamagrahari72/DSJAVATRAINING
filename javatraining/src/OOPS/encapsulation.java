package OOPS;

public class encapsulation {
    public static void main(String[] args) {
        //to print thr trainer profile
        Trainers trainers = new Trainers();
        //data add using object and reference
        trainers.name = "Vansh";
        trainers.email = "vanshagrahari95@gmail.com";
        trainers.technology = "Java";

        System.out.println(trainers.name+" "+trainers.email+" "+trainers.technology);

        //2.data add using object and methods
        trainers.printProfile("Vansh","vanshagrahari95@gmail.com","Java");

        //3. data add using encapsulation
        //add the data using getter and setter
        trainers.setName("Priyanshu gadiyabaazzmuthal");
        trainers.setEmail("priyansmaurya89@gmail.com");
        trainers.setTechnology("Java");

        System.out.println(trainers.getName()+ trainers.getEmail()+ trainers.getTechnology());
    }
}

class Trainers{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    String name;
    String email;
    String technology;

    public void printProfile(String vansh, String mail, String java) {
        System.out.println(vansh + mail + java);
    }
}
