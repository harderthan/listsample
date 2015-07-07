package kr.ac.daegu.app.mylistsample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by daeguunivmac26 on 2015. 7. 7..
 */
public class MylistActivity extends ListActivity{

    String[] data = {"하나, 둘, 셋"};
    ArrayList<String> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        retreiveData();
        final ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, dataList);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), adapter.getItem(position).toString(), Toast.LENGTH_SHORT);
            }
        });
    }

    private void retreiveData() {
        dataList = new ArrayList<String>();
        dataList.add("하나");
        dataList.add("둘");
        dataList.add("셋");
        dataList.add("넷");
        dataList.add("다섯");
    }
}
