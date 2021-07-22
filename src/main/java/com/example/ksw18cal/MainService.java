package com.example.ksw18cal;

import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class MainService {


    public int getBlank(int month){
        Calendar setFirstDay = Calendar.getInstance();
        setFirstDay.set(Calendar.MONTH,month-1);
        setFirstDay.set(Calendar.DAY_OF_MONTH,1); // 1일로 지정
        int result = setFirstDay.get(Calendar.DAY_OF_WEEK);
        System.out.println(result);
        return result-1;
    }
    public int getEndOfDay(int month){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        int result = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(result);
        return result;
    }
}
