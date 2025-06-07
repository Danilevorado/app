package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e4.c;

/* loaded from: classes.dex */
public final class am extends j3.c {
    am(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(y90.a(context), looper, 123, aVar, bVar, null);
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean n0() {
        return ((Boolean) k3.w.c().b(ir.I1)).booleanValue() && i4.b.c(k(), d3.e0.f22833a);
    }

    public final dm o0() {
        return (dm) super.H();
    }

    @Override // e4.c
    protected final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof dm ? (dm) iInterfaceQueryLocalInterface : new dm(iBinder);
    }

    @Override // e4.c
    public final b4.d[] z() {
        return d3.e0.f22834b;
    }
}
