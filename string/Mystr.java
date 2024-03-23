class Mystr{
    public static void main(String[] args) {
        // int x=65;
        // String str=new String("hello");
        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        // System.out.println(arr.length);
        // int key=0;
        // for(int i:arr){
        //     arr[key]=i++;
        //     key++;
        // }
        // 2d array
        int arr[][]={{1,2,3},{1,2,3},{1,2,3}};
        for (int row[]:arr){
            for(int i:row){
                System.out.println(i);
            }
        }
    }
}