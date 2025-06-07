package androidx.room;

import androidx.room.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class g0 implements u0.k {

    /* renamed from: m, reason: collision with root package name */
    private final u0.k f3649m;

    /* renamed from: n, reason: collision with root package name */
    private final i0.f f3650n;

    /* renamed from: o, reason: collision with root package name */
    private final String f3651o;

    /* renamed from: p, reason: collision with root package name */
    private final List f3652p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private final Executor f3653q;

    g0(u0.k kVar, i0.f fVar, String str, Executor executor) {
        this.f3649m = kVar;
        this.f3650n = fVar;
        this.f3651o = str;
        this.f3653q = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f3650n.a(this.f3651o, this.f3652p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f3650n.a(this.f3651o, this.f3652p);
    }

    private void g(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f3652p.size()) {
            for (int size = this.f3652p.size(); size <= i11; size++) {
                this.f3652p.add(null);
            }
        }
        this.f3652p.set(i11, obj);
    }

    @Override // u0.i
    public void G(int i10, long j10) {
        g(i10, Long.valueOf(j10));
        this.f3649m.G(i10, j10);
    }

    @Override // u0.i
    public void L(int i10, byte[] bArr) {
        g(i10, bArr);
        this.f3649m.L(i10, bArr);
    }

    @Override // u0.k
    public long R() {
        this.f3653q.execute(new Runnable() { // from class: androidx.room.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3637m.e();
            }
        });
        return this.f3649m.R();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3649m.close();
    }

    @Override // u0.i
    public void q(int i10, String str) {
        g(i10, str);
        this.f3649m.q(i10, str);
    }

    @Override // u0.k
    public int t() {
        this.f3653q.execute(new Runnable() { // from class: androidx.room.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3639m.f();
            }
        });
        return this.f3649m.t();
    }

    @Override // u0.i
    public void v(int i10) {
        g(i10, this.f3652p.toArray());
        this.f3649m.v(i10);
    }

    @Override // u0.i
    public void w(int i10, double d10) {
        g(i10, Double.valueOf(d10));
        this.f3649m.w(i10, d10);
    }
}
