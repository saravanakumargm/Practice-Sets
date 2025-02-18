import java.io.Serializable;

public class LazySingleton implements Serializable {
    private LazySingleton(){

    }
    static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    protected  Object readResolve(){
        return lazySingleton;
    }
}
