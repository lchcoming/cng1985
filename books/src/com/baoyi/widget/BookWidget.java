package com.baoyi.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.iym.bookstore.R;

public class BookWidget extends LinearLayout{

	private TextView noveltext;
	private TextView author;
	public BookWidget(Context context) {
		super(context);
		LayoutInflater.from(getContext()).inflate(R.layout.widget_book, this);
		noveltext = (TextView) findViewById(R.id.library_tree_item_name);
		author= (TextView) findViewById(R.id.library_tree_item_childrenlist);
	}
	public void setTitle(String title){
		noveltext.setText(title);
	}
	public void setAuthor(String title){
		author.setText(title);
	}

}
