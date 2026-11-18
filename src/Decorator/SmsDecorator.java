package Decorator;

public class SmsDecorator extends NotifierDecorator{

    SmsDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
        System.out.println("Enviando SMS: " + message);
    }
}
