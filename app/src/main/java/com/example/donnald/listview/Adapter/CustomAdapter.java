package com.example.donnald.listview.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.donnald.listview.Activity.MainActivity;
import com.example.donnald.listview.Model.College;
import com.example.donnald.listview.R;

import java.util.List;

/**
 * Created by Donnald on 9/7/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    private List<College> listcolleges;
    ImageView ivLogo;
    TextView tvName, tvYear;


    public CustomAdapter(Context c, List<College> listcollege) {
        this.c = c;
        this.listcolleges = listcollege;

    }

    @Override
    public int getCount() {
        return listcolleges.size();
    }

    @Override
    public Object getItem(int position) {
        return listcolleges.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(c, R.layout.row_layout, null);
        ivLogo = (ImageView) v.findViewById(R.id.ivLogo);
        tvName = (TextView) v.findViewById(R.id.tvCollege);
        tvYear = (TextView) v.findViewById(R.id.tvYear);

        tvName.setText(listcolleges.get(position).getName());
        tvYear.setText(listcolleges.get(position).getYear());
        ivLogo.setImageResource(listcolleges.get(position).getLogo());

        return v;
    }
}
