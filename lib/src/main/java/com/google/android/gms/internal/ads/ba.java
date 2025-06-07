package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    private int f6403a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private int f6404b;

    public final int a() {
        return this.f6404b;
    }

    public final int b() {
        return this.f6403a;
    }

    public final void c(xa xaVar) throws xa {
        int i10 = this.f6404b + 1;
        this.f6404b = i10;
        int i11 = this.f6403a;
        this.f6403a = i11 + i11;
        if (i10 > 1) {
            throw xaVar;
        }
    }
}
