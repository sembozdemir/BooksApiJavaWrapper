package com.sembozdemir.booksapi;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sembozdemir.booksapi.library.models.ImageLinks;
import com.sembozdemir.booksapi.library.models.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by semih on 24.12.2015.
 */
public class BookListAdapter extends ArrayAdapter<Item> {
    protected List<Item> itemList;
    protected Context context;
    protected int layoutId;

    public BookListAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutId = resource;
        this.itemList = objects;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Item getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return itemList.get(position).hashCode();
    }

    protected class ViewHolder {
        ImageView imageViewCover;
        TextView textViewTitle;
        TextView textViewAuthor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layoutId, null);

            viewHolder = new ViewHolder();
            viewHolder.imageViewCover = (ImageView) convertView.findViewById(R.id.imageView_cover);
            viewHolder.textViewTitle = (TextView) convertView.findViewById(R.id.textView_title);
            viewHolder.textViewAuthor = (TextView) convertView.findViewById(R.id.textView_author);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Item item = itemList.get(position);

        ImageLinks imageLinks = item.getVolumeInfo().getImageLinks();
        if (imageLinks != null) {
            Picasso.with(context)
                    .load(imageLinks.getThumbnail())
                    .into(viewHolder.imageViewCover);
        }

        String title = item.getVolumeInfo().getTitle();
        viewHolder.textViewTitle.setText(title);

        List<String> authors = item.getVolumeInfo().getAuthors();
        if (!authors.isEmpty()) {
            String author = item.getVolumeInfo().getAuthors().get(0);
            viewHolder.textViewAuthor.setText(author);
        }


        return convertView;
    }
}
