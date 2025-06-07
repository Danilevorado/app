package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes.dex */
final class kk0 implements DialogInterface.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f11114m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ EditText f11115n;

    kk0(JsPromptResult jsPromptResult, EditText editText) {
        this.f11114m = jsPromptResult;
        this.f11115n = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f11114m.confirm(this.f11115n.getText().toString());
    }
}
