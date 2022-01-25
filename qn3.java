public class qn3 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis(); //1
        long totalSeconds = totalMilliseconds / 1000;        //2
        long currentSeconds = totalSeconds % 60;             //3
        long totalMinutes = (totalSeconds / 60);    //4
        long currentMinutes = totalMinutes % 60;             //5
        long totalHours = totalMinutes / 60;                 //6
        long currentHour = totalHours % 24;                 //7

        System.out.print("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds + " GMT");
    }
}