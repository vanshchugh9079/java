class stmethod {
    static int classid = 10;
    int b = 10;

    static void show() {
        System.out.println("class id is " + classid);
    }
}

class demo {
    public static void main(String[] args) {
        stmethod obj = new stmethod(); // Creating an object of stmethod class
        stmethod.show(); // Calling the static method show() of stmethod class
    }
}
