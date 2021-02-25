package com.example.navigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.navigation.Model.CardModel;

public class DashboardAdapter extends ArrayAdapter {
    public DashboardAdapter(@NonNull Context context) {
        super(context, R.layout.card_item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View  cardview, @NonNull ViewGroup parent) {
      ViewHolder viewHolder;
      if(cardview == null){
          LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       cardview = inflater.inflate(R.layout.card_item, parent, false);
       viewHolder = new ViewHolder(cardview);
       cardview.setTag(viewHolder);

      }else {
          viewHolder = (ViewHolder) cardview.getTag();
      }
        CardModel model = (CardModel) getItem(position);
      viewHolder.imageView.setImageResource(model.getImageId());
      viewHolder.title.setText(model.getTitle());
      viewHolder.description.setText(model.getDescription());

        return  cardview;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView title, description;
        ViewHolder(View view){
            imageView = view.findViewById(R.id.image);
            title = view.findViewById(R.id.title);
            description = view.findViewById(R.id.sub_title);
        }
    }
}
