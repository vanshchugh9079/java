class Instance{
    public static void main(String[] args) {
        int a=10;
        Integer b=Integer.valueOf(a);
        Class type=b.getClass();
        int c=b.intValue();
        // System.out.println(b instanceof Integer);
        System.out.println(b);
        System.out.println(type.getName());

    }
}