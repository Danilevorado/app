package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class hz2 {

    /* renamed from: a, reason: collision with root package name */
    final kz2 f9461a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f9462b;

    private hz2(kz2 kz2Var) {
        this.f9461a = kz2Var;
        this.f9462b = kz2Var != null;
    }

    public static hz2 b(Context context, String str, String str2) throws iy2 {
        kz2 iz2Var;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f5851b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        iz2Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        iz2Var = iInterfaceQueryLocalInterface instanceof kz2 ? (kz2) iInterfaceQueryLocalInterface : new iz2(iBinderD);
                    }
                    iz2Var.H5(l4.b.p1(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new hz2(iz2Var);
                } catch (Exception e5) {
                    throw new iy2(e5);
                }
            } catch (RemoteException | iy2 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new hz2(new lz2());
            }
        } catch (Exception e10) {
            throw new iy2(e10);
        }
    }

    public static hz2 c() {
        lz2 lz2Var = new lz2();
        Log.d("GASS", "Clearcut logging disabled");
        return new hz2(lz2Var);
    }

    public final gz2 a(byte[] bArr) {
        return new gz2(this, bArr, null);
    }
}
