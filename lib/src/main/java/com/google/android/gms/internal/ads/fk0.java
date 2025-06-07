package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
final class fk0 implements DialogInterface.OnCancelListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ JsResult f8307m;

    fk0(JsResult jsResult) {
        this.f8307m = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f8307m.cancel();
    }
}
