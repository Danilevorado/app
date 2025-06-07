package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes.dex */
final class d60 implements DialogInterface.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ f60 f7204m;

    d60(f60 f60Var) {
        this.f7204m = f60Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Intent intentI = this.f7204m.i();
        j3.t.r();
        m3.b2.o(this.f7204m.f8131d, intentI);
    }
}
