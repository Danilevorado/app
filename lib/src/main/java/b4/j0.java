package b4;

import android.util.Log;

/* loaded from: classes.dex */
class j0 {

    /* renamed from: e, reason: collision with root package name */
    private static final j0 f4435e = new j0(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f4436a;

    /* renamed from: b, reason: collision with root package name */
    final String f4437b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f4438c;

    /* renamed from: d, reason: collision with root package name */
    final int f4439d;

    private j0(boolean z10, int i10, int i11, String str, Throwable th) {
        this.f4436a = z10;
        this.f4439d = i10;
        this.f4437b = str;
        this.f4438c = th;
    }

    static j0 b() {
        return f4435e;
    }

    static j0 c(String str) {
        return new j0(false, 1, 5, str, null);
    }

    static j0 d(String str, Throwable th) {
        return new j0(false, 1, 5, str, th);
    }

    static j0 f(int i10) {
        return new j0(true, i10, 1, null, null);
    }

    static j0 g(int i10, int i11, String str, Throwable th) {
        return new j0(false, i10, i11, str, th);
    }

    String a() {
        return this.f4437b;
    }

    final void e() {
        if (this.f4436a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f4438c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f4438c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
