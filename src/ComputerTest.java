public class ComputerTest {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Dell", "Intel Core i7", 16, 3.5);
        Computer computer2 = new Computer("Apple", "Apple M1 Chip", 8, 3.2);
        Computer computer3 = new Computer("Apple", "Apple M1 Chip", 8, 3.2);

        compareComputers(computer1,computer2);
        System.out.println();
        compareComputers(computer2,computer3);
    }
    static void compareComputers(Computer c1, Computer c2){
        if(c1.equals(c2)){
            System.out.println("Both computers are equal");
        }else{
            System.out.println("Both computers are NOT equal");
        }
        if(c1.hashCode() == c2.hashCode()){
            System.out.println("Both computers have the same hashCode");
        }else{
            System.out.println("Both computers have different hashCodes");
        }
        System.out.println("First computer hashCode: " +c1.hashCode());
        System.out.println("Second computer hashCode: " +c2.hashCode());
    }
}
