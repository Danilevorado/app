package h9;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24117a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24118b;

    /* renamed from: c, reason: collision with root package name */
    private int f24119c;

    public g(SharedPreferences sharedPreferences, String str, w9.i iVar) {
        this.f24118b = str;
        try {
            this.f24119c = sharedPreferences == null ? iVar.d() : sharedPreferences.getInt(str, iVar.d());
        } catch (Exception e5) {
            k9.h.o(e5);
            this.f24119c = iVar.d();
        }
        this.f24117a = sharedPreferences;
    }

    public w9.i a() {
        return w9.i.b(this.f24119c);
    }
}
