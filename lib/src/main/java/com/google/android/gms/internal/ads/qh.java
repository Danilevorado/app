package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class qh extends ui {
    public qh(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "kwtXYBCvBLfWcikGQlC0YCCiAi3jf0v8mKFP3Rqx70Jf0cytKZO4qWHMAffIVrkU", "nMO31gtWkn27JzpwW/zLPiiIPhLCWt7BVghY/Hyr+TE=", xcVar, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() throws InvocationTargetException {
        this.f16345e.W(3);
        try {
            int i10 = 1;
            boolean zBooleanValue = ((Boolean) this.f16346f.invoke(null, this.f16342b.b())).booleanValue();
            xc xcVar = this.f16345e;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            xcVar.W(i10);
        } catch (InvocationTargetException e5) {
            if (!(e5.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e5;
            }
        }
    }
}
