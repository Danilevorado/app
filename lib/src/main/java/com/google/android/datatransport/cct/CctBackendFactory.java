package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import s2.h;
import s2.m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements s2.d {
    @Override // s2.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
