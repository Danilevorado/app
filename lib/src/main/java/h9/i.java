package h9;

import android.content.SharedPreferences;
import w9.l;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24123a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24124b;

    /* renamed from: c, reason: collision with root package name */
    private int f24125c;

    public i(SharedPreferences sharedPreferences, String str, l lVar) {
        this.f24124b = str;
        try {
            this.f24125c = sharedPreferences == null ? lVar.d() : sharedPreferences.getInt(str, lVar.d());
        } catch (Exception e5) {
            k9.h.o(e5);
            this.f24125c = lVar.d();
        }
        this.f24123a = sharedPreferences;
    }

    public l a() {
        return l.b(this.f24125c);
    }
}
