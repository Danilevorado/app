package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class mj0 extends sz2 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f12154e;

    /* renamed from: f, reason: collision with root package name */
    private final t53 f12155f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12156g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12157h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f12158i;

    /* renamed from: j, reason: collision with root package name */
    private InputStream f12159j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12160k;

    /* renamed from: l, reason: collision with root package name */
    private Uri f12161l;

    /* renamed from: m, reason: collision with root package name */
    private volatile bm f12162m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12163n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12164o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12165p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12166q;

    /* renamed from: r, reason: collision with root package name */
    private long f12167r;

    /* renamed from: s, reason: collision with root package name */
    private ab3 f12168s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicLong f12169t;

    /* renamed from: u, reason: collision with root package name */
    private final pj0 f12170u;

    public mj0(Context context, t53 t53Var, String str, int i10, wy3 wy3Var, pj0 pj0Var) {
        super(false);
        this.f12154e = context;
        this.f12155f = t53Var;
        this.f12170u = pj0Var;
        this.f12156g = str;
        this.f12157h = i10;
        this.f12163n = false;
        this.f12164o = false;
        this.f12165p = false;
        this.f12166q = false;
        this.f12167r = 0L;
        this.f12169t = new AtomicLong(-1L);
        this.f12168s = null;
        this.f12158i = ((Boolean) k3.w.c().b(ir.I1)).booleanValue();
        b(wy3Var);
    }

    private final boolean r() {
        if (!this.f12158i) {
            return false;
        }
        if (!((Boolean) k3.w.c().b(ir.X3)).booleanValue() || this.f12165p) {
            return ((Boolean) k3.w.c().b(ir.Y3)).booleanValue() && !this.f12166q;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.t53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.ib3 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mj0.a(com.google.android.gms.internal.ads.ib3):long");
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f12161l;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() throws IOException {
        if (!this.f12160k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f12160k = false;
        this.f12161l = null;
        boolean z10 = (this.f12158i && this.f12159j == null) ? false : true;
        InputStream inputStream = this.f12159j;
        if (inputStream != null) {
            i4.k.a(inputStream);
            this.f12159j = null;
        } else {
            this.f12155f.f();
        }
        if (z10) {
            g();
        }
    }

    public final long k() {
        return this.f12167r;
    }

    public final long l() {
        if (this.f12162m == null) {
            return -1L;
        }
        if (this.f12169t.get() == -1) {
            synchronized (this) {
                if (this.f12168s == null) {
                    this.f12168s = of0.f13186a.g(new Callable() { // from class: com.google.android.gms.internal.ads.lj0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f11627a.m();
                        }
                    });
                }
            }
            if (!this.f12168s.isDone()) {
                return -1L;
            }
            try {
                this.f12169t.compareAndSet(-1L, ((Long) this.f12168s.get()).longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.f12169t.get();
    }

    final /* synthetic */ Long m() {
        return Long.valueOf(j3.t.e().a(this.f12162m));
    }

    public final boolean n() {
        return this.f12163n;
    }

    public final boolean o() {
        return this.f12166q;
    }

    public final boolean p() {
        return this.f12165p;
    }

    public final boolean q() {
        return this.f12164o;
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f12160k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f12159j;
        int iZ = inputStream != null ? inputStream.read(bArr, i10, i11) : this.f12155f.z(bArr, i10, i11);
        if (!this.f12158i || this.f12159j != null) {
            w(iZ);
        }
        return iZ;
    }
}
