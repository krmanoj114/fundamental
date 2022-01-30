package Interview.hcl;

public class FindDuplicateValueInArray {
       public static void main(String[] args) {
            int arr[] = {1,1,2,3,3,4,5,6,7,5};  //find duplicate value in array
            int temp =0;
            for (int i = 0; i < arr.length; i++){
                if(arr[i]==temp){
                    System.out.println("duplicate:"+arr[i]);
                }
                temp=arr[i];
            }
        }
    }


