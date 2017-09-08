import java.util.HashMap;

public class singleton_nodo {
    int key;
    private static singleton_nodo singleInstance;

    public static singleton_nodo getInstance() {
        if(singleInstance == null){
            singleInstance = new singleton_nodo();
        }

        return singleInstance;
    }

    //Constructor del singleton
    private singleton_nodo() {

    }
}
