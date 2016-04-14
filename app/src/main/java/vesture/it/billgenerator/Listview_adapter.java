package vesture.it.billgenerator;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ars021 on 14/4/16.
 */
public class Listview_adapter extends ArrayAdapter<Bean> {
    private ArrayList<Bean> mListItems;
    public Listview_adapter(Context context, int resource) {

        super(context, resource);

    }
    static class Viewholder{

        TextView productname;
        TextView qty;
        TextView rate;
        TextView discount;
        TextView vat;
        TextView amt;

    }
    @Override
    public void add(Bean object) {
        super.add(object);
    }


    @Override
    public Bean getItem(int position) {
        return super.getItem(position);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder viewholder;
        View row = convertView;
        if (row==null) {
            viewholder = new Viewholder();
            Log.e("msg", "inflater");
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            Log.e("msg", "false");
            row = inflater.inflate(R.layout.listview, parent,false);
            Log.e("msg", "row");
            viewholder.productname = (TextView) row.findViewById(R.id.productname);
            viewholder.qty = (TextView) row.findViewById(R.id.qty);
            viewholder.rate = (TextView) row.findViewById(R.id.rate);
            viewholder.discount = (TextView) row.findViewById(R.id.discount);
            viewholder.vat = (TextView) row.findViewById(R.id.vat);
            viewholder.amt = (TextView) row.findViewById(R.id.amt);
            Log.e("msg", "true");
            row.setTag(viewholder);
            Log.e("msg", "yyyyy");
        } else {
                // the getTag returns the viewHolder object set as a tag to the view
                Log.e("msg","mmmmm");
                viewholder = (Viewholder)row.getTag();
                Log.e("msg", "zzzz");
            }
        return row;


    }
}
