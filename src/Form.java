public abstract class Form {
    protected String color;

    public Form() {
        System.out.println("Je suis appelé par défaut");
    }

    public Form(String color) {
        this.color = color;
    }
}
