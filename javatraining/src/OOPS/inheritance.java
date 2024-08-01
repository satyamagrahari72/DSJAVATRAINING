package OOPS;

public class inheritance {
    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.printParent();
        //using inheritance call grandparent method
        parents.printGrandParent();

    }
}
class Parents extends GrandParent{
    void printParent(){
        System.out.println("IM parent");
    }
}

class GrandParent{
    void printGrandParent(){
        System.out.println("Im GrandParent");
    }
}
