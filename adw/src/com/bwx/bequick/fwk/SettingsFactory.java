package com.bwx.bequick.fwk;

import static com.bwx.bequick.fwk.Setting.*;
import static com.bwx.bequick.Constants.*;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import com.ada.apps.Res;
import com.bwx.bequick.handlers.AirplaneModeSettingHandler;
import com.bwx.bequick.handlers.BluetoothSettingHandler;
import com.bwx.bequick.handlers.BrightnessSettingHandler;
import com.bwx.bequick.handlers.BrightnessSettingHandlerX10;
import com.bwx.bequick.handlers.GpsSettingHandler;
import com.bwx.bequick.handlers.MasterVolumeSettingHandler;
import com.bwx.bequick.handlers.MobileDataSettingHandler2;
import com.bwx.bequick.handlers.RingerSettingHandler;
import com.bwx.bequick.handlers.ScreenTimeoutSettingHandler;
import com.bwx.bequick.handlers.SystemPropertySettingHandler;
import com.bwx.bequick.handlers.UnlockPatternSettingHandler;
import com.bwx.bequick.handlers.UnlockPatternSettingHandler22;
import com.bwx.bequick.handlers.VolumeControlSettingHandler;
import com.bwx.bequick.handlers.WiFiSettingHandler;
import com.bwx.bequick.handlers.WifiHotspotSettingHandler;
import com.bwx.bequick.handlers.apn.MobileDataSettingHandler;
import com.bwx.bequick.handlers.autosync.AutoSyncSettingHandler;
import com.bwx.bequick.handlers.wimax.FourGEvoSettingHandler;
import com.bwx.bequick.preferences.AirplaneModePrefs;
import com.bwx.bequick.preferences.BrightnessPrefs;
import com.bwx.bequick.preferences.GpsPrefs;
import com.bwx.bequick.preferences.MobileDataApnPrefs;
import com.bwx.bequick.preferences.MobileDataPrefs;

public class SettingsFactory {

	/**
	 * Factory method
	 * @param id			setting ID
	 * @param index			setting index (within a sorted list)
	 * @param defaultText	setting's default description
	 * @param context		instance of Context (never null)
	 * @return				an instance of configured setting
	 */
	public static Setting createSetting(int id, int index, String defaultText, Context context) {
    	Setting setting;
    	switch (id) {
    	
	    	case WIFI:
	    		setting = new Setting(WIFI, Res.drawable.ic_wifi, Res.string.wifi_title, defaultText);
	    		break;
	    		
	    	case GPS:
	    		setting = new Setting(GPS, Res.drawable.ic_gps, Res.string.gps_title, defaultText);
	    		setting.prefs = GpsPrefs.class;
	    		break;

	    	case RINGER:
	    		setting = new Setting(RINGER, Res.drawable.ic_sound, Res.string.txt_ringer, defaultText);
	    		setting.hasPopup = true;
	    		break;
	    	
	    	case BRIGHTNESS: {
	    		RangeSetting set = new RangeSetting(BRIGHTNESS, Res.drawable.ic_brightness, Res.string.txt_brightness, 0, 100);
	    		set.minIconId = Res.drawable.ic_brightness_min;
	    		set.maxIconId = Res.drawable.ic_brightness_max;
	    		set.prefs = BrightnessPrefs.class;
	    		setting = set;
	    		break;
    		}

	    	case AIRPLANE_MODE:
	    		setting = new Setting(AIRPLANE_MODE, Res.drawable.ic_airplane, Res.string.airmode_title, defaultText);
	    		setting.prefs = AirplaneModePrefs.class;
	    		break;

	    	case MOBILE_DATA_APN:
	    		if (isCDMA(context)) {
	    			return null; // not supported
	    		} else {
	    			setting = new Setting(MOBILE_DATA_APN, Res.drawable.ic_apn, Res.string.txt_apn_control, defaultText);
	    			setting.prefs = MobileDataApnPrefs.class;
	    		}
	    		break;
	    	
	    	case BLUETOOTH:
	    		setting = new Setting(BLUETOOTH, Res.drawable.ic_bt, Res.string.txt_bt, defaultText);
	    		break;
	    	
	    	case SCREEN_TIMEOUT:
	    		setting = new Setting(SCREEN_TIMEOUT, Res.drawable.ic_screentimeout, Res.string.txt_screen_timeout, defaultText);
	    		break;

	    	case VOLUME:
	    		setting = new Setting(VOLUME, Res.drawable.ic_volume_control, Res.string.txt_volume, context.getString(Res.string.txt_volume_descr));
	    		break;
	    		
	    	case AUTO_SYNC:
	    		setting = new Setting(AUTO_SYNC, Res.drawable.ic_autosync, Res.string.txt_auto_sync, defaultText);
	    		break;

	    	case AUTO_ROTATE:
	    		setting = new Setting(AUTO_ROTATE, Res.drawable.ic_rotate, Res.string.txt_auto_rotate, defaultText);
	    		break;

	    	case LOCK_PATTERN:
	    		setting = new Setting(LOCK_PATTERN, Res.drawable.ic_lock, Res.string.txt_unlock_pattern, defaultText);
	    		break;

	    	case MASTER_VOLUME: {
	    		RangeSetting set = new RangeSetting(MASTER_VOLUME, Res.drawable.ic_volume, Res.string.txt_master_volume, 0, 15);
	    		set.minIconId = Res.drawable.ic_volume_min;
	    		set.maxIconId = Res.drawable.ic_volume_max;
	    		setting = set;
	    		break;
	    	}
	    		
	    	case WIFI_HOTSPOT:
	    		if (SDK_VERSION >= 8) {
	    			setting = new Setting(WIFI_HOTSPOT, Res.drawable.ic_wifi_hs, Res.string.txt_wifi_hotspot, defaultText);
	    		} else {
	    			return null; // not supported on this device
	    		}
	    		break;
	    	
	    	case MOBILE_DATA:
	    		setting = new Setting(MOBILE_DATA, Res.drawable.ic_3g, Res.string.txt_mobile_data, defaultText);
	    		setting.prefs = MobileDataPrefs.class;
	    		break;
	    		
	    	case GROUP_VISIBLE:
	    		setting = new Setting(id, Res.string.txt_visible_settings);
	    		break;
	    		
	    	case GROUP_HIDDEN:
	    		setting = new Setting(id, Res.string.txt_hidden_settings);
	    		break;
    		
	    	case FOUR_G:
	    		if (SDK_VERSION >= 8 
	    					&& (Build.MODEL.equals("PC36100") /*EVO*/ 
							|| Build.MODEL.equals("PG06100") /*EVO Shift*/ 
							|| Build.MODEL.equals("PG86100") /*EVO 3D*/ 
							|| Build.MODEL.equals("HTC_X515E") /*EVO 4G+ (Korea KT)*/ 
	    					)) {
	    			setting = new Setting(FOUR_G, Res.drawable.ic_4g, Res.string.txt_four_g, defaultText);
	    		} else {
	    			return null; // not supported
	    		}
	    		break;
	    	
	    	default: 
	    		throw new IllegalStateException("unsupported setting type: " + id);
	    		
    	}
    	
    	setting.index = index;
    	return setting;
	}
	
	/**
	 * Factory method
	 * @param setting	a setting for which a handler will be created
	 * @return			a setting handler
	 */
    public static SettingHandler createSettingHandler(Setting setting) {
    	
    	switch (setting.id) {
    	
	    	// create handlers
    		case WIFI: return new WiFiSettingHandler(setting);
	    	case GPS: return new GpsSettingHandler(setting);
	    	case RINGER: return new RingerSettingHandler(setting);
	    	case BRIGHTNESS: {
	    		if (SDK_VERSION == BrightnessSettingHandlerX10.SDK_VERSION && Build.DEVICE.equals(BrightnessSettingHandlerX10.DEVICE)) {
	    			return new BrightnessSettingHandlerX10(setting);
	    		} else {
	    			return new BrightnessSettingHandler(setting);
	    		}
	    	} 
	    	case AIRPLANE_MODE: return new AirplaneModeSettingHandler(setting);
	    	case MOBILE_DATA_APN: return new MobileDataSettingHandler(setting);
	    	case BLUETOOTH: return new BluetoothSettingHandler(setting);
	    	case SCREEN_TIMEOUT: return new ScreenTimeoutSettingHandler(setting);
	    	case VOLUME: return new VolumeControlSettingHandler(setting);
	    	case AUTO_SYNC: return new AutoSyncSettingHandler(setting);
	    	case AUTO_ROTATE: return new SystemPropertySettingHandler(setting, Settings.System.ACCELEROMETER_ROTATION, Settings.ACTION_DISPLAY_SETTINGS);
	    	case LOCK_PATTERN: return SDK_VERSION >= 8 ? new UnlockPatternSettingHandler22(setting) : new UnlockPatternSettingHandler(setting);
	    	case MASTER_VOLUME: return new MasterVolumeSettingHandler(setting);
	    	case WIFI_HOTSPOT: return new WifiHotspotSettingHandler(setting);
	    	case MOBILE_DATA: return new MobileDataSettingHandler2(setting);
	    	case FOUR_G : return new FourGEvoSettingHandler(setting);
	    	
	    	// null-handlers
	    	case Setting.GROUP_VISIBLE:
	    	case Setting.GROUP_HIDDEN:
    		default: 
    			return null;
    	}
    }

    private static final boolean isCDMA(Context context) {
    	TelephonyManager telephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
    	return telephony != null && telephony.getPhoneType() == TelephonyManager.PHONE_TYPE_CDMA;
    }
	
}
