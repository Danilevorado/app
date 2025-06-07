package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class u54 {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes f16178a;

    /* synthetic */ u54(u74 u74Var, t44 t44Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i10 = sv2.f15560a;
        if (i10 >= 29) {
            lo2.a(usage, 1);
        }
        if (i10 >= 32) {
            mf3.a(usage, 0);
        }
        this.f16178a = usage.build();
    }
}
