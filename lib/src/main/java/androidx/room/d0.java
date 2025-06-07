package androidx.room;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class d0 implements u0.i {

    /* renamed from: m, reason: collision with root package name */
    private List f3635m = new ArrayList();

    d0() {
    }

    private void c(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f3635m.size()) {
            for (int size = this.f3635m.size(); size <= i11; size++) {
                this.f3635m.add(null);
            }
        }
        this.f3635m.set(i11, obj);
    }

    @Override // u0.i
    public void G(int i10, long j10) {
        c(i10, Long.valueOf(j10));
    }

    @Override // u0.i
    public void L(int i10, byte[] bArr) {
        c(i10, bArr);
    }

    List a() {
        return this.f3635m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // u0.i
    public void q(int i10, String str) {
        c(i10, str);
    }

    @Override // u0.i
    public void v(int i10) {
        c(i10, null);
    }

    @Override // u0.i
    public void w(int i10, double d10) {
        c(i10, Double.valueOf(d10));
    }
}
