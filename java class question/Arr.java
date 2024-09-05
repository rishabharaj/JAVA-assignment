class Arr {
    public static void main(String[] args)
    {
        int[] arr; // only reference is created
        arr = new int[5]; //memory for the array is allocated
        arr[0] = 10;  //both declaration and memory allocation in one line
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //declaring array
  //  int intArray[];
    // allocating memory to array
  //  intArray = new int[20];  
    // combining both statements in one
  //  int[] intArray = new int[20];

    // Declaring array literal 
    for (int i = 0; i < arr.length; i++){
    System.out.println("Element at index " + i  + " : " + arr[i]);
}
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
    for (int i = 0; i < intArray.length; i++){
            System.out.println("Element at index " + i + " : "+ intArray[i]); }
        for(int j:intArray){
          System.out.println(j);
        }
    }
}