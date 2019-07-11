public class Iphone extends Mobile{
    final private int limit = 10;

    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String makeCall(String msg) {
        System.out.println("<iphone>Message : [" + msg + "]");
        return msg;
    }

    @Override
    public void mobilePrint(String msg) {
        if (msg.length() > 10) {
            System.out.println("<iPhone> Message cannot be sent");
        } else {
            System.out.println(msg);
        }
    }
}
