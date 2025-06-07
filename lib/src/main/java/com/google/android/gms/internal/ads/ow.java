package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import l4.c;

/* loaded from: classes.dex */
public final class ow extends l4.c {
    public ow() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // l4.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof xu ? (xu) iInterfaceQueryLocalInterface : new vu(iBinder);
    }

    public final uu c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderD2 = ((xu) b(context)).d2(l4.b.p1(context), l4.b.p1(frameLayout), l4.b.p1(frameLayout2), 231004000);
            if (iBinderD2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderD2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof uu ? (uu) iInterfaceQueryLocalInterface : new su(iBinderD2);
        } catch (RemoteException | c.a e5) {
            ze0.h("Could not create remote NativeAdViewDelegate.", e5);
            return null;
        }
    }
}
