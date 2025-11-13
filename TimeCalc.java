public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int addMinuets = Integer.parseInt(args[1]);

        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        int totalMinutes = hours * 60 + minutes + addMinuets;
        int newHours = ((totalMinutes / 60) % 24 );
        int newMinutes = totalMinutes % 60;

        String sMin, shour;
        if (newMinutes < 10){
            sMin = "0" + newMinutes;
        }
        else {
            sMin = Integer.toString(newMinutes);
        }

        if (newHours < 10){
            shour = "0" + newHours;
        }
        else {
            shour = Integer.toString(newHours);
        }

        System.out.printf("%s:%s", shour, sMin);
    }
}
