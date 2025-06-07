package ha;

import android.content.SharedPreferences;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final List f24156a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f24157b = new Handler();

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f24158m;

        a(String str) {
            this.f24158m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(d.this.f24156a).iterator();
            while (it.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it.next()).onSharedPreferenceChanged(null, this.f24158m);
            }
        }
    }

    public d(String str, Map map) {
        this.f24156a = d(str, map);
    }

    private List d(String str, Map map) {
        if (map.containsKey(str)) {
            return (List) map.get(str);
        }
        ArrayList arrayList = new ArrayList();
        map.put(str, arrayList);
        return arrayList;
    }

    private void e(String str) {
        this.f24157b.post(new a(str));
    }

    @Override // ha.b
    public void b(String str, byte[] bArr) {
        e(str);
    }

    @Override // ha.b
    public void c(String str) {
        e(str);
    }

    @Override // ha.b
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f24156a.add(onSharedPreferenceChangeListener);
    }

    @Override // ha.b
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f24156a.remove(onSharedPreferenceChangeListener);
    }
}
