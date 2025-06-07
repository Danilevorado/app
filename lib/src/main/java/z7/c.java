package z7;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f28912a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28913b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28914c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28915d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Object f28916e = new Object();

    public c(SharedPreferences sharedPreferences) {
        this.f28912a = sharedPreferences;
    }

    private Integer d() {
        try {
            if (e().contains("LastLaunchVersion")) {
                return Integer.valueOf(e().getInt("LastLaunchVersion", -1));
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private SharedPreferences e() {
        return this.f28912a;
    }

    private void h() {
        try {
            e().edit().putInt("LastLaunchVersion", a()).apply();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public int a() {
        Context contextB = c9.a.b();
        if (contextB == null) {
            return 0;
        }
        try {
            return contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0).versionCode;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public boolean b() {
        f();
        boolean z10 = this.f28914c;
        this.f28914c = false;
        return z10;
    }

    public boolean c() {
        f();
        boolean z10 = this.f28913b;
        this.f28913b = false;
        return z10;
    }

    public void f() {
        synchronized (this.f28916e) {
            if (this.f28915d) {
                return;
            }
            Integer numD = d();
            if (numD == null) {
                this.f28913b = true;
            } else {
                if (numD.intValue() != a()) {
                    this.f28913b = false;
                    this.f28914c = true;
                    h();
                    this.f28915d = true;
                }
                this.f28913b = false;
            }
            this.f28914c = false;
            h();
            this.f28915d = true;
        }
    }

    public boolean g() {
        f();
        return this.f28913b;
    }
}
