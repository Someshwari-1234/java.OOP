class Button {
    interface OnClickListener {
        void onClick();
    }

    void setOnClickListener(OnClickListener listener) {
        listener.onClick();
    }
}

public class RealTimeInnerClass {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked!");
            }
        });
    }
}
