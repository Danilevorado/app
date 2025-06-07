package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
final class hk0 implements DialogInterface.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ JsResult f9159m;

    hk0(JsResult jsResult) {
        this.f9159m = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f9159m.confirm();
    }
}
