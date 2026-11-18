package Decorator;

abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;

    NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }
}
