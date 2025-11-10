class Outer {
    void display() {
        class LocalInner {
            void print() {
                System.out.println("Inside Local Inner Class");
            }
        }

        LocalInner obj = new LocalInner();
        obj.print();
    }

    public static void LocalInnerClass(String[] args) {
        new Outer().display();
    }
}
