package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class gz2 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8912a;

    /* renamed from: b, reason: collision with root package name */
    private int f8913b;

    /* renamed from: c, reason: collision with root package name */
    private int f8914c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ hz2 f8915d;

    /* synthetic */ gz2(hz2 hz2Var, byte[] bArr, fz2 fz2Var) {
        this.f8915d = hz2Var;
        this.f8912a = bArr;
    }

    public final gz2 a(int i10) {
        this.f8914c = i10;
        return this;
    }

    public final gz2 b(int i10) {
        this.f8913b = i10;
        return this;
    }

    public final synchronized void c() {
        try {
            hz2 hz2Var = this.f8915d;
            if (hz2Var.f9462b) {
                hz2Var.f9461a.E0(this.f8912a);
                this.f8915d.f9461a.a0(this.f8913b);
                this.f8915d.f9461a.w(this.f8914c);
                this.f8915d.f9461a.r0(null);
                this.f8915d.f9461a.e();
            }
        } catch (RemoteException e5) {
            Log.d("GASS", "Clearcut log failed", e5);
        }
    }
}
