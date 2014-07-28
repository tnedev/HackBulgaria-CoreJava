
public class Pair<T, E> {
    private T t;
    private E e;

    public Pair(T t, E e) {
        this.t = t;
        this.e = e;
    }
    public void setFirst(T t) {
        this.t = t;
    }

    public void setSecond(E e) {
        this.e = e;
    }

    public T first() {
        return t;
    }

    public E second() {
        return e;
    }

    @Override
    public String toString() {
        return t.toString() + ", " + e.toString();
    }
    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<Integer, String>(5, "Tisho");
        System.out.println(pair.toString());
        pair.setFirst(6);
        System.out.println(pair.first());

    }

}
