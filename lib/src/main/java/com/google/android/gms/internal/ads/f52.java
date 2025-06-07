package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class f52 {

    /* renamed from: a, reason: collision with root package name */
    private final bb1 f8117a;

    public f52(Context context, bb1 bb1Var) {
        this.f8117a = bb1Var;
    }

    public final /* bridge */ /* synthetic */ Object a(un2 un2Var, hn2 hn2Var, View view, b52 b52Var) {
        aa1 aa1VarC = this.f8117a.c(new tx0(un2Var, hn2Var, null), new d52(this, new jb1() { // from class: com.google.android.gms.internal.ads.c52
            @Override // com.google.android.gms.internal.ads.jb1
            public final void a(boolean z10, Context context, y11 y11Var) {
            }
        }));
        b52Var.c(new e52(this, aa1VarC));
        return aa1VarC.i();
    }
}
