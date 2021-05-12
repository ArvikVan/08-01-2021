package generics;

public class TwoGen<T, V> {
    T objT;
    V objV;

    public TwoGen(T objT, V objV) {
        this.objT = objT;
        this.objV = objV;
    }

    void showTypes() {
        System.out.println("Type T: " + objT.getClass().getName());
        System.out.println("Type V: " + objV.getClass().getName());
    }

    T getObjT() {
        return objT;
    }

    V getObjV() {
        return objV;
    }
}
