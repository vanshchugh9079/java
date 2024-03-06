class Index {
    // Custom static exception class
    static class NegativeException extends Exception {
        @Override
        public String toString() {
            return "Radius cannot be negative";
        }
    }

    // Method to calculate the area of a circle
    public static double area(int r) throws NegativeException {
        if (r < 0) {
            throw new NegativeException();
        }
        return Math.PI * r * r;
    }

    // Main method
    public static void main(String[] args) {
        try {
            int radius = -5; // Example radius
            double circleArea = area(radius);
            System.out.println("Area of the circle: " + circleArea);
        } catch (NegativeException e) {
            System.out.println(e.toString()); // Prints the error message defined in NegativeException
        }
    }
}
