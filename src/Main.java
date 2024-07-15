import java.util.Scanner;
class RatCountHouse{
    public static int solve(int r, int unit,int n, int arr[]){
        if(arr==null){
            return -1;
        }
        int totalFoodRequired = r*unit;
        int sum = 0;
        int count = 0;
        for(int i = 0; i<n; i++) {
            sum = sum + arr[i];
            count++;
            if (sum >= totalFoodRequired) {
                break;
            }
        }
        if(sum<totalFoodRequired){
            return 0;
        }
        return count;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("No. of rates in the area: ");
        int r = sc.nextInt();
        System.out.println("Amount of food each rat consume:");
        int unit = sc.nextInt();
        System.out.println("No. of houses in the area:");
        int n = sc.nextInt();
        System.out.println("Enter the amount of food present in houses respectively to their order:");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = solve(r, unit, n, arr);
        if(res==-1){
            System.out.println("There is no house in the area.");
        }
        if(res==0){
            System.out.println("The food is i sufficient for the rats.");
        }
        else{
            System.out.println("Amount of food in 1st "+res+" is sufficient for all rats.");
        }
    }


}