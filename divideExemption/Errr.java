class DivideByZero extends Exception {
    public String toString() {
        return "Divide by zero Exception";
    }
}

class Err {
    static void divide(float x, float y) throws DivideByZero {
        if (y == 0) {
            throw new DivideByZero();
        }
        System.out.println(x / y);
    }

    public static void main(String[] args) {
        try{
            divide(10, 0);
        }
        catch(DivideByZero e){
            System.out.println(e);
        }
    }
}
