package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import l4.c;

/* loaded from: classes.dex */
public final class a70 extends l4.c {
    public a70() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // l4.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof g70 ? (g70) iInterfaceQueryLocalInterface : new e70(iBinder);
    }

    public final d70 c(Activity activity) {
        try {
            IBinder iBinderZze = ((g70) b(activity)).zze(l4.b.p1(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof d70 ? (d70) iInterfaceQueryLocalInterface : new b70(iBinderZze);
        } catch (RemoteException e5) {
            ze0.h("Could not create remote AdOverlay.", e5);
            return null;
        } catch (c.a e10) {
            ze0.h("Could not create remote AdOverlay.", e10);
            return null;
        }
    }
}
