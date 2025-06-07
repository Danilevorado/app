package t9;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final ua.a f27350a;

    /* renamed from: b, reason: collision with root package name */
    private final ha.b f27351b;

    /* renamed from: c, reason: collision with root package name */
    private final v9.a f27352c;

    /* renamed from: d, reason: collision with root package name */
    private final da.a f27353d;

    /* renamed from: e, reason: collision with root package name */
    private final d8.c f27354e;

    /* renamed from: f, reason: collision with root package name */
    private final cb.a f27355f;

    /* renamed from: g, reason: collision with root package name */
    private final Lock f27356g;

    /* renamed from: h, reason: collision with root package name */
    private final Lock f27357h;

    /* renamed from: i, reason: collision with root package name */
    private final wa.b f27358i;

    a(ua.a aVar, ha.b bVar, v9.a aVar2, da.a aVar3, d8.c cVar, cb.a aVar4, ya.a aVar5, wa.b bVar2) {
        this.f27350a = aVar;
        this.f27351b = bVar;
        this.f27352c = aVar2;
        this.f27353d = aVar3;
        this.f27354e = cVar;
        this.f27355f = aVar4;
        this.f27356g = aVar5.a();
        this.f27357h = aVar5.e();
        this.f27358i = bVar2;
    }

    private f a() {
        this.f27356g.lock();
        try {
            return new c(this.f27350a, this.f27351b, this.f27354e, this.f27355f, this.f27353d, this.f27352c, this.f27357h);
        } finally {
            this.f27356g.unlock();
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f27358i.contains(str);
    }

    @Override // android.content.SharedPreferences
    public f edit() {
        return a();
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        return this.f27358i.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        return ((Boolean) this.f27358i.b(str, Boolean.valueOf(z10))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f5) {
        return ((Float) this.f27358i.b(str, Float.valueOf(f5))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        return ((Integer) this.f27358i.b(str, Integer.valueOf(i10))).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        return ((Long) this.f27358i.b(str, Long.valueOf(j10))).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        return (String) this.f27358i.b(str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        return (Set) this.f27358i.b(str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f27357h.lock();
        try {
            this.f27351b.registerOnSharedPreferenceChangeListener(new ha.e(this, onSharedPreferenceChangeListener));
        } finally {
            this.f27357h.unlock();
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f27357h.lock();
        try {
            this.f27351b.unregisterOnSharedPreferenceChangeListener(new ha.e(this, onSharedPreferenceChangeListener));
        } finally {
            this.f27357h.unlock();
        }
    }
}
