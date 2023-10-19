
// import java.util.Scanner;

// public class MonthDays {
//     public static void main(String args[]){
//         int i, j;

//         int[] month_days = new int[12];
//         month_days[0] = 31;
//         month_days[1] = 28;
//         month_days[2] = 31;
//         month_days[3] = 30;
//         month_days[4] = 31;
//         month_days[5] = 30;
//         month_days[6] = 31;
//         month_days[7] = 31;
//         month_days[8] = 30;
//         month_days[9] = 31;
//         month_days[10] = 30;
//         month_days[11] = 31;
        
//         // System.out.println("Enter the month number to know the number of days in it:");
//         // Scanner input = new Scanner(System.in);
//         // int i = input.nextInt();
//         // for(i=0; i<=11; i++){
//         //     System.out.println("The number of days in the month %d is %d", i, j);
//         // }
//         // Scanner sc = new Scanner(System.in);
//         // String str = sc.nextLine();

//         System.out.println("April has " + month_days[3] + "days");
//     }
// }


import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        int[] monthDays = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        System.out.print("Enter the month: ");
        String inputMonth = scanner.nextLine();

        // Find the index of the input month in the monthNames array
        int monthIndex = -1;
        for (int i = 0; i < monthNames.length; i++) {
            if (inputMonth.equalsIgnoreCase(monthNames[i])) {
                monthIndex = i;
                break;
            }
        }

        if (monthIndex != -1) {
            int days = monthDays[monthIndex];
            System.out.println(inputMonth + " has " + days + " days.");
        } else {
            System.out.println("Invalid input. Please enter a valid month.");
        }
    }
}



