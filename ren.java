public interface Animal {

    

    // Abstract method (no implementation)
    abstract void sound();
    
    // Concrete method
    void breathe() {
        System.out.println("Breathing...");
    }

    abstract void nolegs();
}

class Dog extends Animal {
    // Implementation of abstract method
    void sound() {
        System.out.println("Barks");
    }

    void nolegs() {
        System.out.println("it has 4 legs");
    }
}


public class ren {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.breathe();
        obj.nolegs();

        

    }
}
