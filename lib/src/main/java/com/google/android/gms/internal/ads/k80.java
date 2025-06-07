package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e4.c;

/* loaded from: classes.dex */
public final class k80 extends j3.c {
    public k80(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(y90.a(context), looper, 8, aVar, bVar, null);
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.ads.service.START";
    }

    public final w80 n0() {
        return (w80) super.H();
    }

    @Override // e4.c
    protected final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof w80 ? (w80) iInterfaceQueryLocalInterface : new u80(iBinder);
    }
}
