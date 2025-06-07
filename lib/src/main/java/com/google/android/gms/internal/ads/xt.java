package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class xt {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17805a;

    public xt(Context context) {
        this.f17805a = context;
    }

    public final void a(j80 j80Var) {
        String strValueOf;
        String str;
        try {
            ((yt) df0.b(this.f17805a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new bf0() { // from class: com.google.android.gms.internal.ads.wt
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.bf0
                public final Object a(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof yt ? (yt) iInterfaceQueryLocalInterface : new yt(obj);
                }
            })).w3(j80Var);
        } catch (RemoteException e5) {
            strValueOf = String.valueOf(e5.getMessage());
            str = "Error calling setFlagsAccessedBeforeInitializedListener: ";
            ze0.g(str.concat(strValueOf));
        } catch (cf0 e10) {
            strValueOf = String.valueOf(e10.getMessage());
            str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:";
            ze0.g(str.concat(strValueOf));
        }
    }
}
