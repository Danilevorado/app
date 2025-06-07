package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class gi0 implements t53 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8741a;

    /* renamed from: b, reason: collision with root package name */
    private final t53 f8742b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8743c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8744d;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f8746f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8747g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f8748h;

    /* renamed from: i, reason: collision with root package name */
    private volatile bm f8749i;

    /* renamed from: m, reason: collision with root package name */
    private ib3 f8753m;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8750j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8751k = false;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicLong f8752l = new AtomicLong(-1);

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8745e = ((Boolean) k3.w.c().b(ir.I1)).booleanValue();

    public gi0(Context context, t53 t53Var, String str, int i10, wy3 wy3Var, fi0 fi0Var) {
        this.f8741a = context;
        this.f8742b = t53Var;
        this.f8743c = str;
        this.f8744d = i10;
    }

    private final boolean g() {
        if (!this.f8745e) {
            return false;
        }
        if (!((Boolean) k3.w.c().b(ir.X3)).booleanValue() || this.f8750j) {
            return ((Boolean) k3.w.c().b(ir.Y3)).booleanValue() && !this.f8751k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) throws IOException {
        if (this.f8747g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f8747g = true;
        Uri uri = ib3Var.f9669a;
        this.f8748h = uri;
        this.f8753m = ib3Var;
        this.f8749i = bm.f(uri);
        yl ylVarB = null;
        byte b10 = 0;
        if (!((Boolean) k3.w.c().b(ir.U3)).booleanValue()) {
            if (this.f8749i != null) {
                this.f8749i.f6544t = ib3Var.f9674f;
                this.f8749i.f6545u = y33.c(this.f8743c);
                this.f8749i.f6546v = this.f8744d;
                ylVarB = j3.t.e().b(this.f8749i);
            }
            if (ylVarB != null && ylVarB.y()) {
                this.f8750j = ylVarB.A();
                this.f8751k = ylVarB.z();
                if (!g()) {
                    this.f8746f = ylVarB.v();
                    return -1L;
                }
            }
        } else if (this.f8749i != null) {
            this.f8749i.f6544t = ib3Var.f9674f;
            this.f8749i.f6545u = y33.c(this.f8743c);
            this.f8749i.f6546v = this.f8744d;
            long jLongValue = ((Long) k3.w.c().b(this.f8749i.f6543s ? ir.W3 : ir.V3)).longValue();
            j3.t.b().b();
            j3.t.f();
            Future futureA = mm.a(this.f8741a, this.f8749i);
            try {
                nm nmVar = (nm) futureA.get(jLongValue, TimeUnit.MILLISECONDS);
                nmVar.d();
                this.f8750j = nmVar.f();
                this.f8751k = nmVar.e();
                nmVar.a();
                if (g()) {
                    j3.t.b().b();
                    throw null;
                }
                this.f8746f = nmVar.c();
                j3.t.b().b();
                throw null;
            } catch (InterruptedException unused) {
                futureA.cancel(false);
                Thread.currentThread().interrupt();
                j3.t.b().b();
                throw null;
            } catch (ExecutionException | TimeoutException unused2) {
                futureA.cancel(false);
                j3.t.b().b();
                throw null;
            }
        }
        if (this.f8749i != null) {
            this.f8753m = new ib3(Uri.parse(this.f8749i.f6537m), null, ib3Var.f9673e, ib3Var.f9674f, ib3Var.f9675g, null, ib3Var.f9677i);
        }
        return this.f8742b.a(this.f8753m);
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void b(wy3 wy3Var) {
    }

    @Override // com.google.android.gms.internal.ads.t53, com.google.android.gms.internal.ads.zt3
    public final /* synthetic */ Map c() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f8748h;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() throws IOException {
        if (!this.f8747g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f8747g = false;
        this.f8748h = null;
        InputStream inputStream = this.f8746f;
        if (inputStream == null) {
            this.f8742b.f();
        } else {
            i4.k.a(inputStream);
            this.f8746f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f8747g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f8746f;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.f8742b.z(bArr, i10, i11);
    }
}
