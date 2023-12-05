public class Java 
{
    public static int binarySearch(int[] arr, int target) 
    {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
            {
                return mid;
            } 
            else if (arr[mid] < target)
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        int[] section1 = {22110001, 22110003, 22120005, 23110007, 23110045};
        int[] section2 = {21110004, 21110009, 23110005, 23120002, 23130045};
        int target = 23120002;
       
        int result1 = binarySearch(section1, target);
        int result2 = binarySearch(section2, target);
        
        if (result1 != -1) 
        {
            System.out.println("Student ID was found in Section 2 and he sits in the following seat: " + result1);
        } 
        else 
        {
            System.out.println("Student ID wasn't found in the Section 1");
        }
        if (result2 != -1) 
        {
            System.out.println("Student ID was found in Section 2 and he sits in the following seat: " + result2);
        } 
        else 
        {
            System.out.println("Student ID wasn't found in the Section 2");
        }
    }
}
