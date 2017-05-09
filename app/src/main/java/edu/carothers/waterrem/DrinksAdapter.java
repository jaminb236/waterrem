package edu.carothers.waterrem;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
/**
 * Created by carothb on 5/1/2017.
 */


    public class DrinksAdapter extends BaseAdapter {

    private  Context mContext;
    private  Drink[] drinks;

    // 1
    public DrinksAdapter(Context context, Drink[] drinks) {
        this.mContext = context;
        this.drinks = drinks;
    }

    // 2
    @Override
    public int getCount() {
        return drinks.length;
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
        //everything below this line is failure
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
         Drink drink = drinks[position];

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.linearlayout_drink, null);
        }

        // 3

         TextView nameTextView = (TextView)convertView.findViewById(R.id.textview_drink_name);
         TextView sizeTextView = (TextView)convertView.findViewById(R.id.textview_drink_size);


        // 4

        nameTextView.setText((drink.getName()));
        sizeTextView.setText(((Integer.toString(drink.getSize()))));

        return convertView;
    } }