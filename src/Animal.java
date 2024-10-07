public class Animal implements Muritor {
    public String nume;

    public Animal(String nume) {
        this.nume = nume;
    }

    public void mananca() {
        System.out.println("Animal");
    }

    public void mort() {
        System.out.println(this.nume + " a murit");
    }
}
