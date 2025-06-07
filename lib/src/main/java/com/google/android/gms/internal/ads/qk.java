package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class qk implements Comparator {
    qk(sk skVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        xk xkVar = (xk) obj;
        xk xkVar2 = (xk) obj2;
        int i10 = xkVar.f17608c - xkVar2.f17608c;
        return i10 != 0 ? i10 : (xkVar.f17606a > xkVar2.f17606a ? 1 : (xkVar.f17606a == xkVar2.f17606a ? 0 : -1));
    }
}
