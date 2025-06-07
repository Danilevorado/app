package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
final class u1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f19326q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f19327r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Context f19328s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Bundle f19329t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ u2 f19330u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u1(u2 u2Var, String str, String str2, Context context, Bundle bundle) {
        super(u2Var, true);
        this.f19330u = u2Var;
        this.f19326q = str;
        this.f19327r = str2;
        this.f19328s = context;
        this.f19329t = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            u2 u2Var = this.f19330u;
            if (u2.l(this.f19326q, this.f19327r)) {
                String str4 = this.f19327r;
                str2 = this.f19326q;
                str3 = str4;
                str = this.f19330u.f19332a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            e4.p.l(this.f19328s);
            u2 u2Var2 = this.f19330u;
            u2Var2.f19340i = u2Var2.r(this.f19328s, true);
            if (this.f19330u.f19340i == null) {
                Log.w(this.f19330u.f19332a, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.f19328s, ModuleDescriptor.MODULE_ID);
            ((f1) e4.p.l(this.f19330u.f19340i)).initialize(l4.b.p1(this.f19328s), new n1(68000L, Math.max(iA, r0), DynamiteModule.c(this.f19328s, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.f19329t, x4.m.a(this.f19328s)), this.f19043m);
        } catch (Exception e5) {
            this.f19330u.i(e5, true, false);
        }
    }
}
