package StrukturniObrasci.Decorator.Implementacija;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
// Povezivanje dekoratora
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }
}
