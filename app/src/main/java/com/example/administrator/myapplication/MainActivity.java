package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andexert.calendarlistview.library.DatePickerController;
import com.andexert.calendarlistview.library.DayPickerView;
import com.andexert.calendarlistview.library.SimpleMonthAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements DatePickerController {

    private DayPickerView mCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalendar = (DayPickerView) findViewById(R.id.pickerView);
        mCalendar.setController(this);

        List<SimpleMonthAdapter.CalendarDay> date = DateUtils.get7date();

        System.out.println(date);
    }

    @Override
    public int getMaxYear() {
        return 2016;
    }

    @Override
    public void onDayOfMonthSelected(int year, int month, int day) {

    }

    @Override
    public void onDateRangeSelected(SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays) {

    }
}
