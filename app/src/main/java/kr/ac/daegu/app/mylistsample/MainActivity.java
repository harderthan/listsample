package kr.ac.daegu.app.mylistsample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private String[] dataArray = {"고길동", "둘리", "두치", "희동이", "고길동", "둘리", "두치", "희동이", "고길동", "둘리", "두치", "희동이"
            , "고길동", "둘리", "두치", "희동이", "고길동", "둘리", "두치", "희동이", "고길동", "둘리", "두치", "희동이", "고길동", "둘리", "두치", "희동이"
            , "고길동", "둘리", "두치", "희동이", "고길동", "둘리", "두치", "희동이", "고길동", "둘리", "두치", "희동이", "고길동", "둘리", "두치", "희동이"};
    private ListView mListView;

    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retreiveData();
        mListView = (ListView)findViewById(R.id.list);
        mListView.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                R.layout.listitem,
//                android.R.layout.simple_list_item_1,
                dataArray));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView tv = (TextView)view;
                Toast.makeText(MainActivity.this, "나는 " + tv.getText() + " 입니다", Toast.LENGTH_SHORT)
                        .show();

            }
        });
    }

    private void retreiveData() {
        dataList =new ArrayList<String>();
        dataList.add("고길동");
        dataList.add("길동");
        dataList.add("길동");
        dataList.add("고길동");
        dataList.add("고동");
        dataList.add("고하동");
        dataList.add("레");
        dataList.add("두동");
        dataList.add("고길잇이동");
        dataList.add("고길");
        dataList.add("고왓");
        dataList.add("고길동리");
        dataList.add("고길동");
        dataList.add("고길동");
        dataList.add("고길동");
        dataList.add("고길동");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
