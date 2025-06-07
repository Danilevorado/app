package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class i34 implements cc {

    /* renamed from: v, reason: collision with root package name */
    private static final u34 f9518v = u34.b(i34.class);

    /* renamed from: m, reason: collision with root package name */
    protected final String f9519m;

    /* renamed from: n, reason: collision with root package name */
    private dc f9520n;

    /* renamed from: q, reason: collision with root package name */
    private ByteBuffer f9523q;

    /* renamed from: r, reason: collision with root package name */
    long f9524r;

    /* renamed from: t, reason: collision with root package name */
    o34 f9526t;

    /* renamed from: s, reason: collision with root package name */
    long f9525s = -1;

    /* renamed from: u, reason: collision with root package name */
    private ByteBuffer f9527u = null;

    /* renamed from: p, reason: collision with root package name */
    boolean f9522p = true;

    /* renamed from: o, reason: collision with root package name */
    boolean f9521o = true;

    protected i34(String str) {
        this.f9519m = str;
    }

    private final synchronized void b() {
        if (this.f9522p) {
            return;
        }
        try {
            u34 u34Var = f9518v;
            String str = this.f9519m;
            u34Var.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.f9523q = this.f9526t.Q(this.f9524r, this.f9525s);
            this.f9522p = true;
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.cc
    public final String a() {
        return this.f9519m;
    }

    @Override // com.google.android.gms.internal.ads.cc
    public final void c(o34 o34Var, ByteBuffer byteBuffer, long j10, zb zbVar) {
        this.f9524r = o34Var.b();
        byteBuffer.remaining();
        this.f9525s = j10;
        this.f9526t = o34Var;
        o34Var.h(o34Var.b() + j10);
        this.f9522p = false;
        this.f9521o = false;
        f();
    }

    protected abstract void d(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.cc
    public final void e(dc dcVar) {
        this.f9520n = dcVar;
    }

    public final synchronized void f() {
        b();
        u34 u34Var = f9518v;
        String str = this.f9519m;
        u34Var.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f9523q;
        if (byteBuffer != null) {
            this.f9521o = true;
            byteBuffer.rewind();
            d(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f9527u = byteBuffer.slice();
            }
            this.f9523q = null;
        }
    }
}
