public class Andriod extends Mobile {
    final private int limit = 10;

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String makeCall(String msg) {
        System.out.println("<Andriod>Message : [" + msg + "]");
        return msg;
    }

    @Override
    public void mobilePrint(String msg) {
        if (msg.length() > 12) {
            System.out.println("<Andriod> Message cannot be sent");
        } else {
            System.out.println(msg);
        }
    }
}
