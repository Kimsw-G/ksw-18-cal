package com.example.ksw18cal;

import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class MainService {


    public int getBlank(int month){
        Calendar setFirstDay = Calendar.getInstance();
        setFirstDay.set(Calendar.MONTH,month-1);
        setFirstDay.set(Calendar.DAY_OF_MONTH,1); // 1일로 지정
        return setFirstDay.get(Calendar.DAY_OF_WEEK);
    }
    public int getEndOfDay(int month){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
