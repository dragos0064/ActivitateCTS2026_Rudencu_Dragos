package simple.factory.stb.fabrica;

public class FabricaSingleton {
    public static FabricaSingleton instance;

    public static FabricaSingleton getInstance(){
        if(instance == null)
            instance = new FabricaSingleton();
        return instance;
    }
}
