public class Iphone extends Mobile{
    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String makeCall(String msg) {
        System.out.println("<iphone>Message : [" + msg + "]");
        return msg;
    }
}
