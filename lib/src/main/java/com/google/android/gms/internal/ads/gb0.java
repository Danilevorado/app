package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class gb0 {
    public static final ua0 a(Context context, String str, o30 o30Var) {
        try {
            IBinder iBinderW3 = ((ya0) df0.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new bf0() { // from class: com.google.android.gms.internal.ads.fb0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.bf0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof ya0 ? (ya0) iInterfaceQueryLocalInterface : new ya0(obj);
                }
            })).w3(l4.b.p1(context), str, o30Var, 231004000);
            if (iBinderW3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderW3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof ua0 ? (ua0) iInterfaceQueryLocalInterface : new sa0(iBinderW3);
        } catch (RemoteException | cf0 e5) {
            ze0.i("#007 Could not call remote method.", e5);
            return null;
        }
    }
}
