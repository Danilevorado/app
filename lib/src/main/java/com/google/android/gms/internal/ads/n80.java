package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e4.c;

/* loaded from: classes.dex */
public final class n80 extends e4.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public n80(Context context, Looper looper, c.a aVar, c.b bVar) {
        Context applicationContext = context.getApplicationContext();
        super(applicationContext != null ? applicationContext : context, looper, 8, aVar, bVar, null);
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.ads.service.ADS";
    }

    public final z80 n0() {
        return (z80) super.H();
    }

    @Override // e4.c
    protected final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return iInterfaceQueryLocalInterface instanceof z80 ? (z80) iInterfaceQueryLocalInterface : new x80(iBinder);
    }
}
