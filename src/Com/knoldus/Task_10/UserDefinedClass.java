package Com.knoldus.Task_10;

public class UserDefinedClass {

    private String name;

    public UserDefinedClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
