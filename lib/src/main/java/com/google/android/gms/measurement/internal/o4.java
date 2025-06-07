package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.be;
import java.util.List;

/* loaded from: classes.dex */
final class o4 implements be {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q4 f20243a;

    o4(q4 q4Var) {
        this.f20243a = q4Var;
    }

    @Override // com.google.android.gms.internal.measurement.be
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        q3 q3VarO;
        int i11 = i10 - 1;
        if (i11 == 0) {
            q3VarO = this.f20243a.f20269a.b().o();
        } else if (i11 == 1) {
            s3 s3VarB = this.f20243a.f20269a.b();
            q3VarO = z10 ? s3VarB.r() : !z11 ? s3VarB.q() : s3VarB.p();
        } else if (i11 == 3) {
            q3VarO = this.f20243a.f20269a.b().t();
        } else if (i11 != 4) {
            q3VarO = this.f20243a.f20269a.b().s();
        } else {
            s3 s3VarB2 = this.f20243a.f20269a.b();
            q3VarO = z10 ? s3VarB2.w() : !z11 ? s3VarB2.v() : s3VarB2.u();
        }
        int size = list.size();
        if (size == 1) {
            q3VarO.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            q3VarO.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            q3VarO.a(str);
        } else {
            q3VarO.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
