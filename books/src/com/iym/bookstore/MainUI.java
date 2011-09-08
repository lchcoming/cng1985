package com.iym.bookstore;

import org.geometerplus.android.fbreader.library.LibraryBaseActivity;
import org.geometerplus.android.fbreader.library.LibraryTopLevelActivity;
import org.geometerplus.fbreader.library.Library;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.baoyi.adapter.BooksAdapter;

public class MainUI extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_main);
        listView=(ListView)findViewById(R.id.listView1);
        BooksAdapter adapter=new BooksAdapter(this);
       // adapter.set
        LibraryInstance=new Library();
        LibraryInstance.searchResults();
        LibraryInstance.build();
        LibraryInstance.synchronize();
        adapter.setDatas(LibraryInstance.byTitle());
        listView.setAdapter(adapter);
    }
    Library LibraryInstance;
	private void aa() {
		Intent intent=new Intent(this,LibraryTopLevelActivity.class);
        startActivity(intent);
	}
    private ListView listView;
}