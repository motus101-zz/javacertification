import static java.lang.System.*;

class TestApp {
    public static void main(String[] arg) {
        TestApp t1 = new TestApp();
        TestApp t2 = new TestApp();

        if (!t1.equals(t2)) {
            out.println("The t1 is not the same as t2 \n");
        } else {

            out.println("The t1 is the same as t2 \n");
        }

        if (t1 instanceof Object) {
            out.println("t1 is instance of Object \n");
        }
    }
}