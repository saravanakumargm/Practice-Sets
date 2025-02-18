import java.io.*;

public class SingletonBreak {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        exampleSerialization();
    }

    public static void exampleSerialization() throws IOException,ClassNotFoundException{
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton newLazy = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Obj 1 : " + lazySingleton.hashCode());
        System.out.println("Obj 2 : " + newLazy.hashCode());
    }
}
