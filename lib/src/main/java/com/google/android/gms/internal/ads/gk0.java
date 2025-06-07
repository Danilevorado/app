package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
final class gk0 implements DialogInterface.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ JsResult f8782m;

    gk0(JsResult jsResult) {
        this.f8782m = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f8782m.cancel();
    }
}
