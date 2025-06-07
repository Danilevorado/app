package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e4.c;

/* loaded from: classes.dex */
public final class o3 extends e4.c {
    public o3(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // e4.c
    public final int h() {
        return 12451000;
    }

    @Override // e4.c
    public final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof x4.f ? (x4.f) iInterfaceQueryLocalInterface : new j3(iBinder);
    }
}
