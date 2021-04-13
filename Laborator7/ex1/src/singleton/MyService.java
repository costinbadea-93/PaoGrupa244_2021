package singleton;

public class MyService {

    private MyService(){}

    private static class SingletonHelper{
        private static final MyService INSTANCE = new MyService();
    }

    public static MyService getInstance() {
        return SingletonHelper.INSTANCE;
    }
    // REST OF CODE.......

}
