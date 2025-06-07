package androidx.room;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class a0 implements u0.g {

    /* renamed from: m, reason: collision with root package name */
    private final u0.g f3618m;

    /* renamed from: n, reason: collision with root package name */
    private final i0.f f3619n;

    /* renamed from: o, reason: collision with root package name */
    private final Executor f3620o;

    a0(u0.g gVar, i0.f fVar, Executor executor) {
        this.f3618m = gVar;
        this.f3619n = fVar;
        this.f3620o = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        this.f3619n.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        this.f3619n.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X() {
        this.f3619n.a("END TRANSACTION", Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(String str) {
        this.f3619n.a(str, new ArrayList(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(String str, List list) {
        this.f3619n.a(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(String str) {
        this.f3619n.a(str, Collections.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(u0.j jVar, d0 d0Var) {
        this.f3619n.a(jVar.a(), d0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(u0.j jVar, d0 d0Var) {
        this.f3619n.a(jVar.a(), d0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0() {
        this.f3619n.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    @Override // u0.g
    public boolean A() {
        return this.f3618m.A();
    }

    @Override // u0.g
    public Cursor B(final u0.j jVar, CancellationSignal cancellationSignal) {
        final d0 d0Var = new d0();
        jVar.c(d0Var);
        this.f3620o.execute(new Runnable() { // from class: androidx.room.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f3809m.c0(jVar, d0Var);
            }
        });
        return this.f3618m.r(jVar);
    }

    @Override // u0.g
    public boolean E() {
        return this.f3618m.E();
    }

    @Override // u0.g
    public void H() {
        this.f3620o.execute(new Runnable() { // from class: androidx.room.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f3797m.d0();
            }
        });
        this.f3618m.H();
    }

    @Override // u0.g
    public void I(final String str, Object[] objArr) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.f3620o.execute(new Runnable() { // from class: androidx.room.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f3803m.Z(str, arrayList);
            }
        });
        this.f3618m.I(str, arrayList.toArray());
    }

    @Override // u0.g
    public void J() {
        this.f3620o.execute(new Runnable() { // from class: androidx.room.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f3796m.W();
            }
        });
        this.f3618m.J();
    }

    @Override // u0.g
    public int K(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        return this.f3618m.K(str, i10, contentValues, str2, objArr);
    }

    @Override // u0.g
    public Cursor S(final String str) {
        this.f3620o.execute(new Runnable() { // from class: androidx.room.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f3801m.a0(str);
            }
        });
        return this.f3618m.S(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3618m.close();
    }

    @Override // u0.g
    public void i() {
        this.f3620o.execute(new Runnable() { // from class: androidx.room.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f3795m.X();
            }
        });
        this.f3618m.i();
    }

    @Override // u0.g
    public void j() {
        this.f3620o.execute(new Runnable() { // from class: androidx.room.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f3798m.V();
            }
        });
        this.f3618m.j();
    }

    @Override // u0.g
    public boolean m() {
        return this.f3618m.m();
    }

    @Override // u0.g
    public List n() {
        return this.f3618m.n();
    }

    @Override // u0.g
    public void p(final String str) {
        this.f3620o.execute(new Runnable() { // from class: androidx.room.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f3799m.Y(str);
            }
        });
        this.f3618m.p(str);
    }

    @Override // u0.g
    public Cursor r(final u0.j jVar) {
        final d0 d0Var = new d0();
        jVar.c(d0Var);
        this.f3620o.execute(new Runnable() { // from class: androidx.room.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f3806m.b0(jVar, d0Var);
            }
        });
        return this.f3618m.r(jVar);
    }

    @Override // u0.g
    public u0.k u(String str) {
        return new g0(this.f3618m.u(str), this.f3619n, str, this.f3620o);
    }

    @Override // u0.g
    public String z() {
        return this.f3618m.z();
    }
}
