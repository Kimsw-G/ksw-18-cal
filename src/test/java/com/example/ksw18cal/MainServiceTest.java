package com.example.ksw18cal;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class MainServiceTest {

    @Test
    void setCalendar(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,6);
        calendar.set(Calendar.DAY_OF_MONTH,1); // 1일로 지정
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}