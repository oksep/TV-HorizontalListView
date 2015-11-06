package cn.septenary.example;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import cn.septenary.widget.HListView;
import cn.septenary.widget.ViewHolder;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
    }

    public void init() {
        HListView listView = (HListView) findViewById(R.id.list_view);
        listView.setAdapter(new TestAdapter(this));
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "onItemClick  " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "onItemLongClick" + position, Toast.LENGTH_SHORT).show();
        return true;
    }

    private static class TestAdapter extends BaseAdapter {

        private final Context mContext;

        public TestAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public String getItem(int position) {
            return "Pos:" + position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
                convertView.setBackgroundColor(0xff << 24 | new Random().nextInt(0xffffff));
            }
            TextView tv = ViewHolder.getView(convertView, R.id.txt);
            tv.setText(getItem(position));
            return convertView;
        }
    }
}
