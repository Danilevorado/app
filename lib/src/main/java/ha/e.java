package ha;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24160a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f24161b;

    public e(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f24160a = sharedPreferences;
        this.f24161b = onSharedPreferenceChangeListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.f24161b;
        if (onSharedPreferenceChangeListener == null ? eVar.f24161b != null : !onSharedPreferenceChangeListener.equals(eVar.f24161b)) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f24160a;
        SharedPreferences sharedPreferences2 = eVar.f24160a;
        return sharedPreferences != null ? sharedPreferences.equals(sharedPreferences2) : sharedPreferences2 == null;
    }

    public int hashCode() {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.f24161b;
        int iHashCode = (onSharedPreferenceChangeListener != null ? onSharedPreferenceChangeListener.hashCode() : 0) * 31;
        SharedPreferences sharedPreferences = this.f24160a;
        return iHashCode + (sharedPreferences != null ? sharedPreferences.hashCode() : 0);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f24161b.onSharedPreferenceChanged(this.f24160a, str);
    }
}
