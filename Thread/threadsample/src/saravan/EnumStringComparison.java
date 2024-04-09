package saravan;

public class EnumStringComparison {
    
    // Define the Enum for days of the week
    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        // Convert string to Enum
        DayOfWeek inputDay = null;
        try {
            inputDay = DayOfWeek.valueOf("MONDAY");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day of the week.");
            return;
        }

        // Compare Enum with string
        if (inputDay == DayOfWeek.MONDAY) {
            System.out.println("The Enum value represents Monday.");
        } else {
            System.out.println("The Enum value does not represent Monday.");
        }
    }
}


/*We define an Enum called DayOfWeek to represent the days of the week.
In the main method, we attempt to convert the string "MONDAY" to the corresponding Enum 
constant using the valueOf() method.We handle the case where the provided string is not a
valid Enum constant by catching the IllegalArgumentException.
Finally, we compare the obtained Enum constant with DayOfWeek.
MONDAY using the equality (==) operator and print the result accordingly.*/
