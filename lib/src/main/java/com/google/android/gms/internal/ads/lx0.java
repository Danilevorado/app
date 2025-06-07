package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class lx0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f11861a;

    public lx0(ex0 ex0Var) {
        this.f11861a = Collections.singletonList(qa3.h(ex0Var));
    }

    public lx0(List list) {
        this.f11861a = list;
    }

    public static az1 a(az1 az1Var) {
        return new bz1(az1Var, new w23() { // from class: com.google.android.gms.internal.ads.kx0
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return new lx0((ex0) obj);
            }
        });
    }
}
