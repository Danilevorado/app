package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j42 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    private final cz1 f10292a;

    /* renamed from: b, reason: collision with root package name */
    private final gz1 f10293b;

    /* renamed from: c, reason: collision with root package name */
    private final ls2 f10294c;

    /* renamed from: d, reason: collision with root package name */
    private final bb3 f10295d;

    public j42(ls2 ls2Var, bb3 bb3Var, cz1 cz1Var, gz1 gz1Var) {
        this.f10294c = ls2Var;
        this.f10295d = bb3Var;
        this.f10293b = gz1Var;
        this.f10292a = cz1Var;
    }

    static final String e(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(final un2 un2Var, final hn2 hn2Var) {
        final dz1 dz1VarA;
        Iterator it = hn2Var.f9273u.iterator();
        while (true) {
            if (!it.hasNext()) {
                dz1VarA = null;
                break;
            }
            try {
                dz1VarA = this.f10292a.a((String) it.next(), hn2Var.f9275w);
                break;
            } catch (io2 unused) {
            }
        }
        if (dz1VarA == null) {
            return qa3.g(new f22("Unable to instantiate mediation adapter class."));
        }
        tf0 tf0Var = new tf0();
        dz1VarA.f7559c.p1(new i42(this, dz1VarA, tf0Var));
        if (hn2Var.N) {
            Bundle bundle = un2Var.f16412a.f14851a.f7445d.f24626y;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        ls2 ls2Var = this.f10294c;
        return vr2.d(new or2() { // from class: com.google.android.gms.internal.ads.g42
            @Override // com.google.android.gms.internal.ads.or2
            public final void a() {
                this.f8600a.d(un2Var, hn2Var, dz1VarA);
            }
        }, this.f10295d, fs2.ADAPTER_LOAD_AD_SYN, ls2Var).b(fs2.ADAPTER_LOAD_AD_ACK).d(tf0Var).b(fs2.ADAPTER_WRAP_ADAPTER).e(new nr2() { // from class: com.google.android.gms.internal.ads.h42
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                return this.f8997a.c(un2Var, hn2Var, dz1VarA, (Void) obj);
            }
        }).a();
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        return !hn2Var.f9273u.isEmpty();
    }

    final /* synthetic */ Object c(un2 un2Var, hn2 hn2Var, dz1 dz1Var, Void r42) {
        return this.f10293b.b(un2Var, hn2Var, dz1Var);
    }

    final /* synthetic */ void d(un2 un2Var, hn2 hn2Var, dz1 dz1Var) {
        this.f10293b.a(un2Var, hn2Var, dz1Var);
    }
}
