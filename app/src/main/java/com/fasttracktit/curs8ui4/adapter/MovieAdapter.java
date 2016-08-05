package com.fasttracktit.curs8ui4.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.fasttracktit.curs8ui4.R;
import com.fasttracktit.curs8ui4.viewmodel.MovieItemViewModel;

import java.util.List;

/**
 * @author mihai.mecea
 */
public class MovieAdapter extends ArrayAdapter<MovieItemViewModel> {

  LayoutInflater inflater;
  List<MovieItemViewModel> items;

  public MovieAdapter(Context context,
      List<MovieItemViewModel> items) {
    super(context, R.layout.movie_item, items);

    inflater = LayoutInflater.from(context);
    this.items = items;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View view;

    if(convertView != null) {
      view = convertView;
      Log.d("recycler", "view recycled");
    } else {
      view = inflater.inflate(R.layout.movie_item, parent, false);
    }

    MovieItemViewModel item = items.get(position);

    TextView nameTextView = (TextView) view.findViewById(R.id.name_textView);
    TextView descTextView = (TextView) view.findViewById(R.id.desc_textView);
    ImageView movieImageView = (ImageView) view.findViewById(R.id.movie_imageView);

    nameTextView.setText(item.name);
    descTextView.setText(item.description);
    movieImageView.setImageResource(item.imgResId);

    return view;
  }

}
