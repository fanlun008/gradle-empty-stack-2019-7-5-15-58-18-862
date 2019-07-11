public class Andriod extends Mobile {

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String makeCall(String msg) {
        System.out.println("<Andriod>Message : [" + msg + "]");
        return msg;
    }
}
