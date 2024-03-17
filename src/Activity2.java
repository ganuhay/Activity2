public class Activity2 {

    //Array Sum
    
  public static void main(String[] args) {
    int[] gg = {10, 5, 7, 3, 12};
    {
    System.out.println("Elements of the array:");
    for (int number : gg) {
        System.out.println(number);  
    }
    
    int gg_sum = gg[0] + gg[1] + gg[2] + gg[3] + gg[4];
    
    System.out.println("Sum of all elements in the array: " + gg_sum);
    
  
    int max = Math.max(gg[0], Math.max(gg[1], Math.max(gg[2], Math.max(gg[3], gg[4]))));
    System.out.println("Maximum Value: " + max);
}
  }
    

}