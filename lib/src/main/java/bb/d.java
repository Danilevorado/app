package bb;

import android.content.Context;
import android.content.SharedPreferences;
import k9.h;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f4599b;

    /* renamed from: a, reason: collision with root package name */
    private int f4600a;

    private d() {
        Context contextB = c9.a.b();
        SharedPreferences sharedPreferences = contextB == null ? null : contextB.getSharedPreferences("com.pushwoosh.migration", 0);
        this.f4600a = sharedPreferences == null ? 3 : sharedPreferences.getInt("lastVersion", 1);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("lastVersion", 3).apply();
        }
        h.u("PrefsFactory created. LastVersion: " + this.f4600a + "; CurrentVersion: 3");
    }

    public static db.a a() {
        if (f4599b == null) {
            e();
        }
        return f4599b.g();
    }

    private e9.a b(int i10) {
        Context contextB = c9.a.b();
        if (i10 == 1) {
            return new c(contextB);
        }
        if (i10 == 2) {
            return new b(contextB);
        }
        if (i10 == 3) {
            return new c(contextB);
        }
        h.v("PrefsFactory", "Unknown version: " + i10);
        return null;
    }

    public static e9.a c() {
        if (f4599b == null) {
            e();
        }
        return f4599b.b(3);
    }

    public static e9.a d() {
        if (f4599b == null) {
            return null;
        }
        return f4599b.f();
    }

    private static void e() {
        synchronized (d.class) {
            if (f4599b == null) {
                f4599b = new d();
            }
        }
    }

    private e9.a f() {
        return b(this.f4600a);
    }

    private db.a g() {
        if (this.f4600a == 2) {
            return new f9.b(b(3));
        }
        return null;
    }
}
