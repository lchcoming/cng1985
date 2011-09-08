package com.iym.bookstore;

import java.io.File;

import org.geometerplus.zlibrary.ui.android.library.ZLAndroidApplication;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.baoyi.content.content;

/**
 * 顺便看小说管理程序资源
 * 
 * @author Administrator
 * 
 */
public class BaoyiApplication extends ZLAndroidApplication {
	/**
	 * Singleton pattern
	 */
	private static BaoyiApplication instance;
	/**
	 * Tag used for DDMS logging
	 */
	public static String TAG = "baoyi";

	public static BaoyiApplication getInstance() {
		return instance;
	}


	/**
	 * Image cache, one for all activities and orientations
	 */

	/**
	 * Access to global image cache across Activity instances
	 * 
	 * @return
	 */

	/**
	 * Retrieves application's version number from the manifest
	 * 
	 * @return
	 */
	public String getVersion() {
		String version = "0.0.0";

		PackageManager packageManager = getPackageManager();
		try {
			PackageInfo packageInfo = packageManager.getPackageInfo(
					getPackageName(), 0);
			version = packageInfo.versionName;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

		return version;
	}

	private void inticacheDisk() {

		File disk = new File(content.baoyinovel);
		if (!(disk.exists()) && !(disk.isDirectory())) {
			boolean creadok = disk.mkdirs();
			if (creadok) {
				System.out.println(" ok:创建文件夹成功！ ");
			} else {
				System.out.println(" err:创建文件夹失败！ ");
			}
		}
	}

	@Override
	public void onCreate() {
		super.onCreate();
		inticacheDisk();
		instance = this;
	}

	public boolean isonline() {
		ConnectivityManager cManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo info = cManager.getActiveNetworkInfo();
		if (info != null && info.isAvailable()) {
			// do something
			// 能联网
			return true;
		} else {
			// 不能联网
			return false;
		}
	}
}
