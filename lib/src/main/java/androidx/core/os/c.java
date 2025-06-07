package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2254a = new c();

    private c() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        rb.h.e(bundle, "bundle");
        rb.h.e(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        rb.h.e(bundle, "bundle");
        rb.h.e(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
