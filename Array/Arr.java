class Arr{
    public static void main(String[] args) {
        int myarray[] = new int[50];
        myarray=new int[]{1,2,3,4,5,6,7,8,9,10};
        myarray[9]=100;
        // System.out.println(myarray[0]);
        // System.out.println(myarray[1]);
        // System.out.println(myarray[2]);
        // a best way
        int index=0;
        for(int i :myarray){
            // System.out.println(i);
            System.out.println(index+":"+i);
            index++;
        }
    }
}