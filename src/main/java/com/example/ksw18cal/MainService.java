package com.example.ksw18cal;

import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class MainService {

    public void setCalendar(int month){
        Calendar setFirstDay = Calendar.getInstance();
        setFirstDay.set(Calendar.MONTH,month+1);
        setFirstDay.set(Calendar.DAY_OF_MONTH,1); // 1일로 지정
        int blank = setFirstDay.get(Calendar.DAY_OF_WEEK);
    }
}
