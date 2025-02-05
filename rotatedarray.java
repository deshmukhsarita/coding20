class JavaExample {
  public static void main(String[] args) {
    //Initializing the array numbers
    int [] numbers = new int [] {2, 4, 6, 8, 10, 12};
    /* This number specifies how many times the array needs
     * to be rotated.
     */
    int n = 2;
    System.out.println("Given array is: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    //Left rotate the array by n times
    for(int i = 0; i < n; i++){
      int j, firstElement;
      //Storing the first element of the array to move to last
      firstElement = numbers[0];
      for(j = 0; j < numbers.length-1; j++){
        //Shifting the element to left by 1 on each iteration of loop
        numbers[j] = numbers[j+1];
      }
      //Adding the first element at the end of the array
      numbers[j] = firstElement;
    }
    System.out.println();
    //Printing output array
    System.out.println("Array after "+n+" left rotations: ");
    for(int i = 0; i< numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }
  }
}  