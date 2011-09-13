package com.iym.bookstore;

import org.geometerplus.android.fbreader.BookInfoActivity;
import org.geometerplus.android.fbreader.SQLiteBooksDatabase;
import org.geometerplus.android.fbreader.library.LibraryTopLevelActivity;
import org.geometerplus.android.fbreader.network.NetworkLibraryActivity;
import org.geometerplus.fbreader.library.AuthorTree;
import org.geometerplus.fbreader.library.Book;
import org.geometerplus.fbreader.library.BookTree;
import org.geometerplus.fbreader.library.BooksDatabase;
import org.geometerplus.fbreader.library.Library;
import org.geometerplus.fbreader.library.TagTree;
import org.geometerplus.fbreader.tree.FBTree;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

import com.baoyi.adapter.BooksAdapter;
import com.baoyi.widget.BookWidget;

public class MainUI extends Activity {
	private void chanageBg(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.imageButton1:
			tushu.setImageResource(R.drawable.tushu1);
			zuoze.setImageResource(R.drawable.zuoze2);
			biaoti.setImageResource(R.drawable.biaoti2);
			break;
		case R.id.imageButton2:
			tushu.setImageResource(R.drawable.tushu2);
			zuoze.setImageResource(R.drawable.zuoze1);
			biaoti.setImageResource(R.drawable.biaoti2);
			break;
		case R.id.imageButton3:
			tushu.setImageResource(R.drawable.tushu2);
			zuoze.setImageResource(R.drawable.zuoze2);
			biaoti.setImageResource(R.drawable.biaoti1);
			break;
		default:
			break;
		}
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ui_main);
		tushu = (ImageButton) findViewById(R.id.imageButton1);
		zuoze = (ImageButton) findViewById(R.id.imageButton2);
		biaoti = (ImageButton) findViewById(R.id.imageButton3);
		tushuguan = (ImageButton) findViewById(R.id.imageButton4);
		tushu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation = AnimationUtils.loadAnimation(MainUI.this,
						R.anim.max);
				v.startAnimation(animation);
				chanageBg(v);
				initDataByTitle();
			}

		});
		zuoze.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation = AnimationUtils.loadAnimation(MainUI.this,
						R.anim.max);
				v.startAnimation(animation);
				chanageBg(v);
				initDataByAuthor();
			}
		});
		biaoti.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation = AnimationUtils.loadAnimation(MainUI.this,
						R.anim.max);
				v.startAnimation(animation);
				initDataByTag();
				chanageBg(v);
				
			}
		});
		tushuguan.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation = AnimationUtils.loadAnimation(MainUI.this,
						R.anim.max);
				v.startAnimation(animation);
				openOnline();
			
			}
		});

		init();
		chanageBg(tushu);
		initDataByTitle();
		//aa();
	}

	private ImageButton tushu;
	private ImageButton zuoze;
	private ImageButton biaoti;
	private ImageButton tushuguan;

	private void init() {
		listView = (ListView) findViewById(R.id.listView1);

	}

	BooksAdapter adapter;

	private void initDataByTitle() {
		DatabaseInstance = SQLiteBooksDatabase.Instance();
		if (DatabaseInstance == null) {
			DatabaseInstance = new SQLiteBooksDatabase(this, "LIBRARY");
		}
	

		adapter = new BooksAdapter(this,R.drawable.ic_list_library_books);
		// adapter.set
		LibraryInstance = new Library();
		LibraryInstance.synchronize();
		try {
			adapter.setDatas(LibraryInstance.byTitle());
			listView.setAdapter(adapter);
			listView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					BookWidget book = (BookWidget) arg1;
					Object item = adapter.getItem(arg2);
					if (item instanceof BookTree) {
						BookTree fb = (BookTree) item;
						showBookInfo(fb.Book);
					}
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private void initDataByTag() {
		DatabaseInstance = SQLiteBooksDatabase.Instance();
		if (DatabaseInstance == null) {
			DatabaseInstance = new SQLiteBooksDatabase(this, "LIBRARY");
		}
	

		adapter = new BooksAdapter(this,R.drawable.ic_list_library_tag);
		// adapter.set
		LibraryInstance = new Library();
		LibraryInstance.synchronize();
		try {
			adapter.setDatas(LibraryInstance.byTag());
			listView.setAdapter(adapter);
			listView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					BookWidget book = (BookWidget) arg1;
					Object item = adapter.getItem(arg2);
					if (item instanceof TagTree) {
						TagTree fb = (TagTree) item;
						showAuthor(fb);
					}
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private void initDataByAuthor() {
		DatabaseInstance = SQLiteBooksDatabase.Instance();
		if (DatabaseInstance == null) {
			DatabaseInstance = new SQLiteBooksDatabase(this, "LIBRARY");
		}
	

		adapter = new BooksAdapter(this,R.drawable.ic_list_library_author);
		// adapter.set
		LibraryInstance = new Library();
		LibraryInstance.synchronize();
		try {
			adapter.setDatas(LibraryInstance.byAuthor());
			listView.setAdapter(adapter);
			listView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					BookWidget book = (BookWidget) arg1;
					Object item = adapter.getItem(arg2);
					if (item instanceof AuthorTree) {
						AuthorTree fb = (AuthorTree) item;
						showAuthor(fb);
						//showBookInfo(fb.Book);
					}
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	protected void showAuthor(FBTree tree) {
		adapter = new BooksAdapter(this,R.drawable.ic_list_library_books);
		// adapter.set
		LibraryInstance = new Library();
		LibraryInstance.synchronize();
		try {
			adapter.setDatas(tree);
			listView.setAdapter(adapter);
			listView.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					BookWidget book = (BookWidget) arg1;
					Object item = adapter.getItem(arg2);
					if (item instanceof BookTree) {
						BookTree fb = (BookTree) item;
						showBookInfo(fb.Book);
					}
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void showBookInfo(Book book) {
		startActivityForResult(new Intent(getApplicationContext(),
				BookInfoActivity.class).putExtra(
				BookInfoActivity.CURRENT_BOOK_PATH_KEY, book.File.getPath()),
				BOOK_INFO_REQUEST);
	}

	protected static final int BOOK_INFO_REQUEST = 1;

	Library LibraryInstance;
	static BooksDatabase DatabaseInstance;
	private void aa() {
		Intent intent = new Intent(this, LibraryTopLevelActivity.class);
		startActivity(intent);
	}

	@Override
	protected void onResume() {
		//initData();
		super.onResume();
	}

	private ListView listView;

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			ShowMessageDialog();
		}
		return super.onKeyDown(keyCode, event);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
		super.onCreateOptionsMenu(menu);

		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.local:
			openLocal();
			return true;
		case R.id.online:
			openOnline();

			return true;

		default:
			return true;
		}

	}

	private void openOnline() {
		Intent intent = new Intent(this, NetworkLibraryActivity.class);
		startActivity(intent);

	}

	private void openLocal() {
		Intent intent = new Intent(this, LibraryTopLevelActivity.class);
		startActivity(intent);

	}

	protected void ShowMessageDialog() {
		AlertDialog.Builder builder = new Builder(MainUI.this);
		builder.setTitle(R.string.true_calce);
		builder.setPositiveButton(R.string.yes,
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface arg0, int arg1) {
						MainUI.this.finish();
						android.os.Process.killProcess(android.os.Process
								.myPid());
					}
				});
		builder.setNegativeButton(R.string.no,
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {

					}
				});
		builder.create().show();
	}

}