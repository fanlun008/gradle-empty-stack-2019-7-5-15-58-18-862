import lombok.Data;

@Data
public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String makeCall(String msg) {
        System.out.println("Message : " + msg);
        return msg;
    }

    @Override
    public String toString() {
        return String.format("name: [%1$s], color: [%2$s], brand: [%3$s]",
                this.name, this.color, this.brand);
    }
}
