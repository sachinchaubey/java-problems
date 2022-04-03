public class switchcase {
    
    public static void main (String[] args){

        String days = "Thursday";
        switch(days){
            case "sunday": System.out.println("It's sunday:");
            break;
            case "monday": System.out.println("It's monday:");
            break;
            case "tuesday": System.out.println("It's tuesday:");
            break;
            case "Wednesday": System.out.println("It's wednesday:");
            break;
            case "Thursday": System.out.println("It's Thursday:");
            break;
            case "Friday": System.out.println("It's Friday:");
            break;
            case "Saturday": System.out.println("It's Saturday");
            break;
            default: System.out.println("It's not a day:");
            break;
        }
    }
}