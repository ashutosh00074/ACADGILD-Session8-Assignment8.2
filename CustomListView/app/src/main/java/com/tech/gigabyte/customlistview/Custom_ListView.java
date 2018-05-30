package com.tech.gigabyte.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class Custom_ListView extends AppCompatActivity implements OnItemClickListener {


    //Called when activity is first created.

    ListView lview;
    ListViewAdapter lviewAdapter;

    //Creating Objects For Custom ListView TextView1
    private final static String name[] = {
            "   Name1", "   Name2", "   Name3",
            "   Name4", "   Name5", "   Name6",
            "   Name7", "   Name8", "   Name9",
            "   Name10", "   Name11", "   Name12",
            "   Name13", "   Name14", "   Name15"};


    //Creating Objects For Custom ListView TextView2
    private final static String number[] = {
            "   PhoneNumber1", "   PhoneNumber2", "   PhoneNumber3",
            "   PhoneNumber4", "   PhoneNumber5", "   PhoneNumber6",
            "   PhoneNumber7", "   PhoneNumber8", "   PhoneNumber9",
            "   PhoneNumber10", "   PhoneNumber11", "   PhoneNumber12",
            "   PhoneNumber13", "   PhoneNumber14", "   PhoneNumber15"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlv);

        //Set the activity content from a layout resource
        lview = (ListView) findViewById(R.id.lv);

        //Extending Baseadapter for custom listview
        lviewAdapter = new ListViewAdapter(this, name, number);

        //ready to accept output data
        System.out.println("adapter => " + lviewAdapter.getCount());

        //Setting the data behind this ListView
        lview.setAdapter(lviewAdapter);

        //The callback that will be invoked
        lview.setOnItemClickListener(this);
    }

    //The view within the AdapterView that was clicked
    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        // TODO Auto-generated method stub
        // When User Click in any of name (TextView) It will Pass a Toast Containing Exact Name and Number
        Toast.makeText(this, "Name =>" + name[position] + "Number =>" + number[position], Toast.LENGTH_SHORT).show();
    }
}