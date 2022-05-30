package singleton;

public class Test {

    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
    }
}
