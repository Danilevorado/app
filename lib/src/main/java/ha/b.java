package ha;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public interface b {
    void b(String str, byte[] bArr);

    void c(String str);

    void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener);

    void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener);
}
