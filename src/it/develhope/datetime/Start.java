package it.develhope.datetime;
import java.time.LocalDate;
import java.time.Year;
public class Start {

        public static void main(String[] args) {

            LocalDate today = LocalDate.now();
            LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());
            LocalDate endOfYear = today.withDayOfYear(Year.of(today.getYear()).length());

            int daysTillEndOfMonth = endOfMonth.getDayOfMonth() - today.getDayOfMonth();
            int daysTillEndOfYear = endOfYear.getDayOfYear() - today.getDayOfYear();

            System.out.println("Days till the end of month: " + daysTillEndOfMonth);
            System.out.println("Days till the end of year: " + daysTillEndOfYear);
        }
    }



