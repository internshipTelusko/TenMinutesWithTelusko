package com.telusko.learning.tenminuteswithtelusko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Quiz extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adap;

    private List<Data> qlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        qlist = new ArrayList<>();
        createData();

        adap = new MyAdapter(qlist, this);


        recyclerView.setAdapter(adap);
    }
    public void createData()
    {
        Data q1 = new Data(

                1,

                "Which of the following would compile without error?",
                "int a = Math.abs(-5);",
                "int b = Math.abs(5.0);",
                "int c = Math.abs(5.5F);",
                "int d = Math.abs(-5.5F);"

        );

        qlist.add(q1);

        Data q2 = new Data(

                1,

                "Which of the following would compile without error?",
                "int a = Math.abs(-5);",
                "int b = Math.abs(5.0);",
                "int c = Math.abs(5.5F);",
                "int d = Math.abs(-5.5F);"

        );
        qlist.add(q2);
        Data q3 = new Data(

                1,

                "Which of the following would compile without error?",
                "int a = Math.abs(-5);",
                "int b = Math.abs(5.0);",
                "int c = Math.abs(5.5F);",
                "int d = Math.abs(-5.5F);"

        );
        qlist.add(q3);
        Data q4 = new Data(

                1,

                "Which of the following would compile without error?",
                "int a = Math.abs(-5);",
                "int b = Math.abs(5.0);",
                "int c = Math.abs(5.5F);",
                "int d = Math.abs(-5.5F);"

        );
        qlist.add(q4);
        Data q5 = new Data(

                1,

                "Which of the following would compile without error?",
                "int a = Math.abs(-5);",
                "int b = Math.abs(5.0);",
                "int c = Math.abs(5.5F);",
                "int d = Math.abs(-5.5F);"

        );
        qlist.add(q5);


    }
}
