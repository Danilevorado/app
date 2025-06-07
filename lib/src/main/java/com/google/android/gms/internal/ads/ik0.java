package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
final class ik0 implements DialogInterface.OnCancelListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f9775m;

    ik0(JsPromptResult jsPromptResult) {
        this.f9775m = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f9775m.cancel();
    }
}
