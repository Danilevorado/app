package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2253a = new b();

    private b() {
    }

    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        rb.h.e(bundle, "bundle");
        rb.h.e(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
