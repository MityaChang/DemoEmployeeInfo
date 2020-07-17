package sg.edu.rp.c346.id19034275.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeList;
    ArrayList<Employee> alEmployeeList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployeeList = findViewById(R.id.lvEmployee);
        alEmployeeList = new ArrayList();

        alEmployeeList.add(new Employee("John", "Software Technical Leader", 3400.00));
        alEmployeeList.add(new Employee("May", "Programmer", 2200.00));

        adapter = new CustomAdapter(this, R.layout.row, alEmployeeList);
        lvEmployeeList.setAdapter(adapter);
    }
}