package com.example.admin.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1;
    ListView lv;
    ArrayList<Student> a1;
    MyAdapter m;
    int counter=0;

    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return a1.size();
        }

        @Override
        public Object getItem(int position) {
            return a1.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Student student = a1.get(position);
            View view = getLayoutInflater().inflate(R.layout.row,parent,false);
            TextView tv1 = view.findViewById(R.id.tv1);
            TextView tv2 = view.findViewById(R.id.tv2);
            TextView tv3 = view.findViewById(R.id.tv3);
            tv1.setText(student.getSno());
            tv2.setText(student.getName());
            tv3.setText(student.getSubject());
            return view;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        b1 = (Button) findViewById(R.id.b1);
        lv = (ListView) findViewById(R.id.lv);
        a1 = new ArrayList<>();
        m = new MyAdapter();
        lv.setAdapter(m);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                String name = et1.getText().toString();
                String subject = et2.getText().toString();
                Student student = new Student(""+counter,name,subject);
                a1.add(student);
                et1.setText("");
                et2.setText("");
                m.notifyDataSetChanged();
                et1.requestFocus();
            }
        });
    }
}
