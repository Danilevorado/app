package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class i53 extends v43 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f9550m;

    /* renamed from: n, reason: collision with root package name */
    private int f9551n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ k53 f9552o;

    i53(k53 k53Var, int i10) {
        this.f9552o = k53Var;
        Object[] objArr = k53Var.f10826o;
        objArr.getClass();
        this.f9550m = objArr[i10];
        this.f9551n = i10;
    }

    private final void a() {
        int i10 = this.f9551n;
        if (i10 != -1 && i10 < this.f9552o.size()) {
            Object obj = this.f9550m;
            k53 k53Var = this.f9552o;
            int i11 = this.f9551n;
            Object[] objArr = k53Var.f10826o;
            objArr.getClass();
            if (d33.a(obj, objArr[i11])) {
                return;
            }
        }
        this.f9551n = this.f9552o.r(this.f9550m);
    }

    @Override // com.google.android.gms.internal.ads.v43, java.util.Map.Entry
    public final Object getKey() {
        return this.f9550m;
    }

    @Override // com.google.android.gms.internal.ads.v43, java.util.Map.Entry
    public final Object getValue() {
        Map mapK = this.f9552o.k();
        if (mapK != null) {
            return mapK.get(this.f9550m);
        }
        a();
        int i10 = this.f9551n;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = this.f9552o.f10827p;
        objArr.getClass();
        return objArr[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapK = this.f9552o.k();
        if (mapK != null) {
            return mapK.put(this.f9550m, obj);
        }
        a();
        int i10 = this.f9551n;
        if (i10 == -1) {
            this.f9552o.put(this.f9550m, obj);
            return null;
        }
        Object[] objArr = this.f9552o.f10827p;
        objArr.getClass();
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
