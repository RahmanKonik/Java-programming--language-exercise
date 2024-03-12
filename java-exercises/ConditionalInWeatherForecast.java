
// Write a program that adding two binary number.
// Name: Konik Rahman.
// Date: 12-03-2024

public class ConditionalInWeatherForecast {

    /*
     *  Prints the information depends on variable by using the if condition.
     */

    public static void myWeather(String day) {

        if ( day == "Sunny" ){
            System.out.println("Go to the outside and chill!.");
        } else if (day == "Rainning"){
            System.out.println("Stay in Home and sleep.");
        } else if (day == "Cloudy"){
            System.out.println("Go to garden and drink a cup of tea.");
        } else{
            System.out.println("Do what you wants.");
        }

    }
    /*
     * Makes a variable and store the text and pass it another method.
     */

    public static void main(String[] args) {

        String string = "Sunny";
        myWeather(string);
    }

}

// End of file
