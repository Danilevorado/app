package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e4.c;

/* loaded from: classes.dex */
public final class fz extends j3.c {
    fz(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(y90.a(context), looper, 166, aVar, bVar, null);
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final mz n0() {
        return (mz) super.H();
    }

    @Override // e4.c
    protected final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof mz ? (mz) iInterfaceQueryLocalInterface : new mz(iBinder);
    }
}
