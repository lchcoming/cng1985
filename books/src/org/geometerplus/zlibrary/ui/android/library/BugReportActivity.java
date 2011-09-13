/*
 * Copyright (C) 2007-2011 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.zlibrary.ui.android.library;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;

import com.baoyi.apps.Res;

public class BugReportActivity extends Activity {
	static final String STACKTRACE = "fbreader.stacktrace";

	private String getVersionName() {
		try {
			return getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
		} catch (Exception e) {
			return "";
		}
	}

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(Res.layout.bug_report_view);
		final String stackTrace = getIntent().getStringExtra(STACKTRACE);
		final TextView reportTextView = (TextView)findViewById(Res.id.report_text);
		reportTextView.setMovementMethod(ScrollingMovementMethod.getInstance());
		reportTextView.setClickable(false);
		reportTextView.setLongClickable(false);

		final String versionName = getVersionName();
		reportTextView.append("安卓图书馆 " + versionName + " 除了，感谢你的反馈\n\n");
		reportTextView.append(stackTrace);

		findViewById(Res.id.send_report).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view) {
					Intent sendIntent = new Intent(Intent.ACTION_SEND);
					sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "735529126@qq.com" });
					sendIntent.putExtra(Intent.EXTRA_TEXT, stackTrace);
					sendIntent.putExtra(Intent.EXTRA_SUBJECT, "安卓图书馆 " + versionName + " exception report");
					sendIntent.setType("message/rfc822");
					startActivity(sendIntent);
					finish();
				}
			}
		);

		findViewById(Res.id.cancel_report).setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View view) {
					finish();
				}
			}
		);
	}
}
