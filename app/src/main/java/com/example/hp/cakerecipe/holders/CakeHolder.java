package com.example.hp.cakerecipe.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.cakerecipe.R;
import com.example.hp.cakerecipe.model.Cakes;

public class CakeHolder extends RecyclerView.ViewHolder {

    private ImageView mainImage;
    private TextView titleTextView;
    public CakeHolder(@NonNull View itemView) {
        super(itemView);

        this.mainImage = (ImageView)itemView.findViewById(R.id.mainImage);
        this.titleTextView = (TextView)itemView.findViewById(R.id.titleText);
    }

    public  void updateUi(Cakes cakes){
        String uri = cakes.getImgUri();
        int resource  = mainImage.getResources().getIdentifier(uri,null,mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);

        titleTextView.setText(cakes.getCakeTitle());
    }
}
