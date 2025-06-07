package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f7605a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    private boolean f7606b;

    public final e2 a(int i10) {
        gt1.f(!this.f7606b);
        this.f7605a.append(i10, true);
        return this;
    }

    public final g4 b() {
        gt1.f(!this.f7606b);
        this.f7606b = true;
        return new g4(this.f7605a, null);
    }
}
