package amir.code.playwithandroid2;

/*******************************************************************************
 * Copyright (c) 2014.
 *  @Author Amir Asaad
 ******************************************************************************/

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {

    static final String[] ACTIVITY_CHOICES = new String[]{
            "Play 1",
            "Play 2",
            "Play 3"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,
                ACTIVITY_CHOICES));

        ListView lv = getListView();
        lv.setTextFilterEnabled(true);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                    default:
                        break;
                }


            }
        });
    }


}
