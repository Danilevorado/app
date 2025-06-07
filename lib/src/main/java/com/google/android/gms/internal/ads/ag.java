package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ag extends zf {
    protected ag(Context context, String str, boolean z10) {
        super(context, str, z10);
    }

    public static ag x(String str, Context context, boolean z10) {
        zf.t(context, false);
        return new ag(context, str, false);
    }

    public static ag y(String str, Context context, boolean z10, int i10) {
        zf.t(context, z10);
        return new ag(context, str, z10);
    }

    @Override // com.google.android.gms.internal.ads.zf
    protected final List r(dh dhVar, Context context, xc xcVar, qc qcVar) {
        if (dhVar.k() == null || !this.H) {
            return super.r(dhVar, context, xcVar, null);
        }
        int iA = dhVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.r(dhVar, context, xcVar, null));
        arrayList.add(new xh(dhVar, "Nh+w10G1n7Da4ABjUIxN+bi57DvusNUcn9VqpF1GXimOuh+Booa8zjDH+Fzh+CdP", "2aR451s+WavC28PZAI1OicYdxdf9H8e1m2qQ6Vd7HNY=", xcVar, iA, 24));
        return arrayList;
    }
}
