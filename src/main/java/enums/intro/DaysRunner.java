package enums.intro;

import java.util.Arrays;

public class DaysRunner {
    public static void main(String[] args) {

        // create an instance variable
        DaysOfWeek daysOfWeek= DaysOfWeek.FRIDAY;

        System.out.println(daysOfWeek);

        // print all enum constants on the console.
        // values() method returns an array of enum constants containing all the enum constants.
        // ordinal() method returns the index of enum value
        for(DaysOfWeek days:DaysOfWeek.values()){
            System.out.println(days.ordinal()+ " - " + days);
        }
        System.out.println("================================");

        // print all enum constants into array .
        DaysOfWeek [] dayArray= DaysOfWeek.values();
        System.out.println(dayArray);//[Lenums.intro.DaysOfWeek;@279f2327
        System.out.println(Arrays.toString(dayArray));

        // print the specific element of enum constant with index.
        System.out.println(daysOfWeek.values()[0]);

        // valueOf() method returns the value of the enum constant
        System.out.println("The Value of the enum : "+ daysOfWeek.valueOf("FRIDAY"));

        // switch

        System.out.println("-------");
        switch (daysOfWeek){
            case SUNDAY:
                System.out.println("This is SUNDAY");
                break;
            case SATURDAY:
                System.out.println("This is SATURDAY");
                break;
            case MONDAY:
                System.out.println("This is MONDAY");
                break;
            case TUESDAY:
                System.out.println("This is TUESDAY");
                break;

            case WEDNESDAY:
                System.out.println("This is WEDNESDAY");
                break;


            case THURSDAY:
                System.out.println("This is THURSDAY");
                break;
            case FRIDAY:
                System.out.println("This is FRIDAY");
                break;
            default:
                System.out.println("Not Valid Day Name ....");


        }


    }
}
