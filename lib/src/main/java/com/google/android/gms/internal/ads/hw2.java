package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hw2 {

    /* renamed from: a, reason: collision with root package name */
    private final ov2 f9438a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f9439b;

    public hw2(ov2 ov2Var, String str) {
        ArrayList arrayList = new ArrayList();
        this.f9439b = arrayList;
        this.f9438a = ov2Var;
        arrayList.add(str);
    }

    public final ov2 a() {
        return this.f9438a;
    }

    public final ArrayList b() {
        return this.f9439b;
    }

    public final void c(String str) {
        this.f9439b.add(str);
    }
}
