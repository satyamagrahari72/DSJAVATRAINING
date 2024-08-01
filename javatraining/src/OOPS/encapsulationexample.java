package OOPS;

public class encapsulationexample {
    public static void main(String[] args) {
        //add the student info
        StudentProfile a= new StudentProfile();
        a.setName("Vansh");
        a.setEmail("vanshagrahari95@gmail.com");
        a.setAddress("Lucknow");
        a.setMobile(933505131);

        System.out.println(a.getName() + a.getEmail() + a.getAddress() + a.getMobile());
    }
}

class StudentProfile{
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    String name;
    String email;
    String address;
    long mobile;

    }
