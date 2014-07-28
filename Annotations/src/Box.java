
public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.set(3);
        System.out.println(box.get()); // =>3

        Box<String> boxS = new Box<>();
        boxS.set("this example belongs to Oracle");
        System.out.println(boxS.get()); // "this example belongs to  Oracle"

    }

}
