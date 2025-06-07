package i7;

import com.onesignal.n2;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static a f24336b;

    /* renamed from: a, reason: collision with root package name */
    private b f24337a;

    public a(n2 n2Var) {
        f24336b = this;
        if (n2Var.g(n2Var.h(), "PREFS_OS_LANGUAGE", null) != null) {
            this.f24337a = new c(n2Var);
        } else {
            this.f24337a = new d();
        }
    }

    public static a a() {
        return f24336b;
    }

    public String b() {
        return this.f24337a.a();
    }
}
