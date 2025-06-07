package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e4.c;

/* loaded from: classes.dex */
public final class ly2 extends j3.c {
    private final int F;

    public ly2(Context context, Looper looper, c.a aVar, c.b bVar, int i10) {
        super(context, looper, 116, aVar, bVar, null);
        this.F = i10;
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.gass.START";
    }

    @Override // e4.c
    public final int h() {
        return this.F;
    }

    public final qy2 n0() {
        return (qy2) super.H();
    }

    @Override // e4.c
    protected final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof qy2 ? (qy2) iInterfaceQueryLocalInterface : new qy2(iBinder);
    }
}
