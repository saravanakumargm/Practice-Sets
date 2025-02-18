public class DaysBetweenDates {
    public void daysBetween(String date1, String date2){
        System.out.println(Math.abs(getDaysFrom2000(date1) - getDaysFrom2000(date2)));
    }
    int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public int getDaysFrom2000(String date){
        String[] data = split(date,'-');
        int year = Integer.parseInt(data[2]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[0]);
        for (int i = 2000; i < year; i++) {
            day+= isLeapYear(i)?366:365;
        }
        for (int i = 1; i < month; i++) {
            if(isLeapYear(year) && i==2){
                day++;
            }
            day+=months[i];
        }
        return day;
    }

    private String[] split(String data, char s) {
        String[] res = new String[3];
        int start = 0;
        int index = 0;
        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i)==s){
                res[index++] = data.substring(start,i);
                start = i+1;
            }
        }
        res[index] = data.substring(start,data.length());
        return res;
    }

    private boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }

    public static void main(String[] args) {
        new DaysBetweenDates().daysBetween("10-08-2023","15-08-2024");
    }
}
