package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class oo1 implements xn1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f13345a;

    /* renamed from: b, reason: collision with root package name */
    private final do1 f13346b;

    /* renamed from: c, reason: collision with root package name */
    private final ym2 f13347c;

    oo1(long j10, Context context, do1 do1Var, km0 km0Var, String str) {
        this.f13345a = j10;
        this.f13346b = do1Var;
        an2 an2VarX = km0Var.x();
        an2VarX.a(context);
        an2VarX.o(str);
        this.f13347c = an2VarX.d().a();
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void b(k3.c4 c4Var) {
        try {
            this.f13347c.E4(c4Var, new mo1(this));
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void d() {
        try {
            this.f13347c.n2(new no1(this));
            this.f13347c.J0(l4.b.p1(null));
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }
}
