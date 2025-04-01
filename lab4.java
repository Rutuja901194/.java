public class lab4 {
    
    public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg)
    {
        String typeofDay;
        switch (dayOfWeekArg) {
            case "Monday":
                   typeofDay="Start of work week";
                break;
            case "Tuesday":
            case "Wedenesday":
            case "Thursday":
                   typeofDay="Midweek";
                break;
            case"Friday": 
            typeofDay="End of work week";
            break;
            case"Satarday":
            case"Sunday":
                typeofDay="Weekend";
                break;    
            default:
               throw new IllegalArgumentException("Invalid day of the week:"+dayOfWeekArg);
        }
        return typeofDay;
    }
}