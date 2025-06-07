package mb;

import rb.h;

/* loaded from: classes2.dex */
public class a extends lb.a {
    @Override // lb.a
    public void a(Throwable th, Throwable th2) {
        h.e(th, "cause");
        h.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
