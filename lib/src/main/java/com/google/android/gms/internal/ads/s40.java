package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class s40 extends c40 {

    /* renamed from: m, reason: collision with root package name */
    private final o3.w f15080m;

    public s40(o3.w wVar) {
        this.f15080m = wVar;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final void A() {
        this.f15080m.s();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String B() {
        return this.f15080m.n();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final void D2(l4.a aVar, l4.a aVar2, l4.a aVar3) {
        this.f15080m.E((View) l4.b.L0(aVar), (HashMap) l4.b.L0(aVar2), (HashMap) l4.b.L0(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final boolean F() {
        return this.f15080m.l();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final void H3(l4.a aVar) {
        this.f15080m.q((View) l4.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final void I4(l4.a aVar) {
        this.f15080m.F((View) l4.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final boolean O() {
        return this.f15080m.m();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final double c() {
        if (this.f15080m.o() != null) {
            return this.f15080m.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final float e() {
        return this.f15080m.k();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final float g() {
        return this.f15080m.f();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final float h() {
        return this.f15080m.e();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final Bundle i() {
        return this.f15080m.g();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final k3.m2 j() {
        if (this.f15080m.H() != null) {
            return this.f15080m.H().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final ju k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final qu l() {
        g3.d dVarI = this.f15080m.i();
        if (dVarI != null) {
            return new cu(dVarI.a(), dVarI.c(), dVarI.b(), dVarI.e(), dVarI.d());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final l4.a m() {
        View viewG = this.f15080m.G();
        if (viewG == null) {
            return null;
        }
        return l4.b.p1(viewG);
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final l4.a n() {
        View viewA = this.f15080m.a();
        if (viewA == null) {
            return null;
        }
        return l4.b.p1(viewA);
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String o() {
        return this.f15080m.b();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final l4.a p() {
        Object objI = this.f15080m.I();
        if (objI == null) {
            return null;
        }
        return l4.b.p1(objI);
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String q() {
        return this.f15080m.c();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String r() {
        return this.f15080m.d();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String t() {
        return this.f15080m.h();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final String u() {
        return this.f15080m.p();
    }

    @Override // com.google.android.gms.internal.ads.d40
    public final List v() {
        List<g3.d> listJ = this.f15080m.j();
        ArrayList arrayList = new ArrayList();
        if (listJ != null) {
            for (g3.d dVar : listJ) {
                arrayList.add(new cu(dVar.a(), dVar.c(), dVar.b(), dVar.e(), dVar.d()));
            }
        }
        return arrayList;
    }
}
