package com.baoyi.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.iym.bookstore.R;

public class BookWidget extends LinearLayout{

	private TextView noveltext;

	public BookWidget(Context context) {
		super(context);
		LayoutInflater.from(getContext()).inflate(R.layout.widget_book, this);
		noveltext = (TextView) findViewById(R.id.titleview);
	}
	public void setTitle(String title){
		noveltext.setText(title);
	}

}
