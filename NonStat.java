package study;

public class NonStat {
// i dont use static keyword because it for representation of non static method
    public void printInfo() {
        System.out.println("It is a function");
    }

    public static void main(String[] args) {
        NonStat n1 = new NonStat(); // Creating object of the class
        n1.printInfo();             // Calling the non-static method by object
    }
}
