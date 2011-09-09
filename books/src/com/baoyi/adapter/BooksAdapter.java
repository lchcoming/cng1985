package com.baoyi.adapter;

import java.util.ArrayList;
import java.util.List;

import org.geometerplus.fbreader.tree.FBTree;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.baoyi.widget.BookWidget;

public class BooksAdapter extends BaseAdapter {
 private Context context;
 private List<BookWidget> widgets=new ArrayList<BookWidget>();
	public BooksAdapter(Context c){
		context=c;
	}
	public void setDatas(FBTree fbs){
		datas=	fbs.subTrees();
		if(null!=datas){
			widgets.clear();
			for (FBTree fbTree : datas) {
				BookWidget item=new BookWidget(context);
				item.setTitle(fbTree.getName());
				widgets.add(item);
			}
		}
	}
	private List<FBTree> datas;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return widgets.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return widgets.get(position);
	}

}