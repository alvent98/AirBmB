package com.example.airbmb.View.Owner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.example.airbmb.Model.Owner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import project_airbmb.airbmb.R;


public class AdvancedListAdapter extends BaseAdapter implements Filterable
{
    private Context context;
    private LayoutInflater inflater;
    private List<Owner> dataSource, rawDataSource;
    private ItemFilter mFilter = new ItemFilter();

    /**
     * Constructor with context
     * @param context context's activity
     */
    public AdvancedListAdapter(Context context)
    {
        this.context = context;
        dataSource = rawDataSource = new ArrayList<>();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    /**
     * Returns number of objects in the list
     * @return number of objects
     */
    @Override
    public int getCount()
    {
        return dataSource.size();
    }

    /**
     * Returns an object given a position
     * @param position object's position
     * @return object
     */
    @Override
    public Object getItem(int position)
    {
        return dataSource.get(position);
    }

    /**
     * returns object's id given a position in the list
     * @param position object's position
     * @return object's id
     */
    @Override
    public long getItemId(int position)
    {
        return position;
    }

    /**
     * Creates a view given a position of an object
     * @param position object's position
     * @param convertView not used
     * @param parent view's parent
     * @return view
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Owner h = (Owner) getItem(position);

        View rowView = inflater.inflate(h == null ? R.layout.activity_manage_owners: R.layout.content_manage_houses2, parent, false);

        ((TextView) rowView.findViewById(R.id.text_first_name)).setText(h.getFirstName());
        ((TextView) rowView.findViewById(R.id.text_last_name)).setText(h.getLastName());

        ((TextView) rowView.findViewById(R.id.text_email)).setText(h.getEmail());
//        ((TextView) rowView.findViewById(R.id.item_view_details)).setText(">");
//
////        PixelUtils.drawInitialsImage(context, (ImageView) rowView.findViewById(R.id.item_image), h.getFirst(), new int[]{R.color.colorSmallBlue, R.color.colorSmallGreen, R.color.colorSmallOrange});
//
//        String initials = "";
//
//        ((TextView) rowView.findViewById(R.id.image_text)).setText(initials);

        return rowView;
    }

    /**
     * Loads data from source
     * @param dataSource list
     */
    public void loadSource(List<Owner> dataSource)
    {
        this.dataSource = dataSource;
        Collections.reverse(this.dataSource);

        this.rawDataSource = dataSource.subList(0, dataSource.size());//shallow copy
        notifyDataSetChanged();
    }

    /**
     * Returns filter
     * @return filter
     */
    public Filter getFilter(){
        return mFilter;
    }

    /**
     * extends Filter
     */
    private class ItemFilter extends Filter
    {
        /**
         * publishes filtered results
         * @param constraint restricted String
         * @param results results
         */
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results)
        {
            dataSource = (List<Owner>)results.values;
            notifyDataSetChanged();
        }

        /**
         * Filters results
         * @param constraint restricted String
         * @return filtered results
         */
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            String filterString = constraint.toString().toLowerCase();
            FilterResults results = new FilterResults();
            List<Owner> matches = new ArrayList<>();

            for(Owner h : rawDataSource)
                if (h.getFirstName()== filterString || h.getLastName() == filterString || h.getEmail() == filterString)
                    matches.add(h);

            results.values = matches;
            results.count = matches.size();

            return results;
        }
    }
}