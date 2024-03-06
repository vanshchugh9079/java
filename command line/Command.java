class Command {
    public static void main(String args[]) {
        int commandarr[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                commandarr[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                // Handle the case where the argument cannot be parsed as an integer
                System.err.println("Invalid input: " + args[i] + " is not an integer.");
                // You may choose to skip this argument or handle it differently
            }
        }
        // Print out the parsed integers along with their indices
        for (int i = 0; i < commandarr.length; i++) {
            commandarr[i]=commandarr[i]+1;
        }
        for (int y :commandarr){
            System.out.println(y);
            System.out.println("hello");
        }
    }
}
