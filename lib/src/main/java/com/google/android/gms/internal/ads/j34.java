package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class j34 extends n34 implements cc {

    /* renamed from: u, reason: collision with root package name */
    dc f10287u;

    /* renamed from: v, reason: collision with root package name */
    protected final String f10288v = "moov";

    public j34(String str) {
    }

    @Override // com.google.android.gms.internal.ads.cc
    public final String a() {
        return this.f10288v;
    }

    @Override // com.google.android.gms.internal.ads.cc
    public final void c(o34 o34Var, ByteBuffer byteBuffer, long j10, zb zbVar) {
        o34Var.b();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f12391n = o34Var;
        this.f12393p = o34Var.b();
        o34Var.h(o34Var.b() + j10);
        this.f12394q = o34Var.b();
        this.f12390m = zbVar;
    }

    @Override // com.google.android.gms.internal.ads.cc
    public final void e(dc dcVar) {
        this.f10287u = dcVar;
    }
}
