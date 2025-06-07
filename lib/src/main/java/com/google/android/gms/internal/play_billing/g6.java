package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class g6 extends j6 implements h6 {
    public static h6 C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof h6 ? (h6) iInterfaceQueryLocalInterface : new f6(iBinder);
    }
}
