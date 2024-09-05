import java.util.Scanner;

public class Season{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month (e.g., January): ");
        String month = sc.nextLine();
        
        String season;
        switch (month) {
            case "December": 
            case "January": 
            case "February":
                season = "Winter";
                break;
            case "March": 
            case "April": 
            case "May":
                season = "Spring";
                break;
            case "June": 
            case "July": 
            case "August":
                season = "Summer";
                break;
            case "September": 
            case "October": 
            case "November":
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }
        
        System.out.println("The season is: " + season);
        
    }
}
