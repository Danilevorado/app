package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class al implements Comparator {
    public al(bl blVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ok okVar = (ok) obj;
        ok okVar2 = (ok) obj2;
        if (okVar.d() >= okVar2.d()) {
            if (okVar.d() > okVar2.d()) {
                return 1;
            }
            if (okVar.b() >= okVar2.b()) {
                if (okVar.b() > okVar2.b()) {
                    return 1;
                }
                float fA = (okVar.a() - okVar.d()) * (okVar.c() - okVar.b());
                float fA2 = (okVar2.a() - okVar2.d()) * (okVar2.c() - okVar2.b());
                if (fA <= fA2) {
                    return fA < fA2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
