/*
 * Copyright (C) 2010 beworx.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bwx.bequick.preferences;

import static com.bwx.bequick.Constants.PREF_DISABLE_MMS;
import android.content.SharedPreferences;
import android.preference.CheckBoxPreference;

import com.ada.apps.Res;

public class MobileDataApnPrefs extends BasePrefs {

    public MobileDataApnPrefs() {
		super(Res.layout.prefs_mobile_data_apn);
	}

	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
		// update summary
		if (PREF_DISABLE_MMS.equals(key)) {
			CheckBoxPreference pref = (CheckBoxPreference) findPreference(PREF_DISABLE_MMS);
			pref.setSummary(pref.isChecked() ? Res.string.pref_disable_mms_descr_disabled : Res.string.pref_disable_mms_descr_enabled);
		}
	}
}
