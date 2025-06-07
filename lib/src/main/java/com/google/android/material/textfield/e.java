package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    TextInputLayout f21221a;

    /* renamed from: b, reason: collision with root package name */
    Context f21222b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f21223c;

    /* renamed from: d, reason: collision with root package name */
    final int f21224d;

    e(TextInputLayout textInputLayout, int i10) {
        this.f21221a = textInputLayout;
        this.f21222b = textInputLayout.getContext();
        this.f21223c = textInputLayout.getEndIconView();
        this.f21224d = i10;
    }

    abstract void a();

    boolean b(int i10) {
        return true;
    }

    void c(boolean z10) {
    }

    boolean d() {
        return false;
    }
}
