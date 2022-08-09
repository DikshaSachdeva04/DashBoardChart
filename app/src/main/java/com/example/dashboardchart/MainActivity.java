package com.example.dashboardchart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    PieChart Subject;
    PieChart Task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign

        Subject=findViewById(R.id.SubjectWiseData);
        Task=findViewById(R.id.Task);

        //ArrayList


        ArrayList<PieEntry> SubjectEntries = new ArrayList<>();
        SubjectEntries.add(new PieEntry(10 ,"Hindi"));
        SubjectEntries.add(new PieEntry(30 ,"English"));
        SubjectEntries.add(new PieEntry(20 ,"Science"));
        SubjectEntries.add(new PieEntry(5 ,"Maths"));
        SubjectEntries.add(new PieEntry(10 ,"SSC"));
        SubjectEntries.add(new PieEntry(50 ,"Comp."));

        ArrayList<PieEntry> TaskEntries = new ArrayList<>();
        TaskEntries.add(new PieEntry(10,"TimeTable"));
        TaskEntries.add(new PieEntry(50,"Task"));
        TaskEntries.add(new PieEntry(30,"Habit"));

//        for(int i=1;i<7;i++){
//            float value=(float) (i*10.0);
//            PieEntry SubjectEntry=new PieEntry(i,value);
//            SubjectEntries.add(SubjectEntry);
//        }
//        for(int i=1;i<4;i++){
//            float value=(float) (i*10.0);
//            PieEntry TaskEntry= new PieEntry(i,value);
//            TaskEntries.add(TaskEntry);
//
//        }



        PieDataSet pieDataSet = new PieDataSet(SubjectEntries,"");
        pieDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
        pieDataSet.setDrawValues(true);
        Subject.setData(new PieData(pieDataSet));
        Subject.animateXY(5000,5000);
       Subject.getDescription().setEnabled(false);
       Subject.setUsePercentValues(false);
       Subject.setCenterText("Subject");
       Subject.setCenterTextSize(20);

        PieDataSet pieDataSet1 = new PieDataSet(TaskEntries,"");
        pieDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet1.setDrawValues(false);
        Task.setData(new PieData(pieDataSet1));
       Task.animateXY(5000,5000);
        Task.getDescription().setEnabled(false);






    }
}