class Outer {
    static String msg = "Static Message";

    static class Inner {
        void show() {
            System.out.println(msg);
        }
    }

    public static void NestedInner(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}
