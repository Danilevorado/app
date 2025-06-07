package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* loaded from: classes.dex */
final class e60 implements DialogInterface.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ f60 f7651m;

    e60(f60 f60Var) {
        this.f7651m = f60Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        this.f7651m.c("Operation denied by user.");
    }
}
