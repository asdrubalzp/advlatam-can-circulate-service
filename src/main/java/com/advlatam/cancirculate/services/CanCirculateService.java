package com.advlatam.cancirculate.services;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Service
public class CanCirculateService {

    public boolean canCirculate(String plate, LocalDateTime dateTime) {
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return true;
        }

        int lastDigit = Integer.parseInt(plate.substring(plate.length() - 1));
        boolean canCirculateByPlate = switch (dayOfWeek) {
            case MONDAY -> lastDigit != 1 && lastDigit != 2;
            case TUESDAY -> lastDigit != 3 && lastDigit != 4;
            case WEDNESDAY -> lastDigit != 5 && lastDigit != 6;
            case THURSDAY -> lastDigit != 7 && lastDigit != 8;
            case FRIDAY -> lastDigit != 9 && lastDigit != 0;
            default -> false;
        };

        boolean canCirculateByHour = (hour >= 6 && hour < 9) || (hour == 9 && minute <= 30)
                || (hour >= 16 && hour < 21);

        return canCirculateByPlate && canCirculateByHour;
    }
}
