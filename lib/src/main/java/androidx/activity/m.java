package androidx.activity;

import android.view.View;

/* loaded from: classes.dex */
public abstract class m {
    public static final void a(View view, k kVar) {
        rb.h.e(view, "<this>");
        rb.h.e(kVar, "onBackPressedDispatcherOwner");
        view.setTag(l.f375a, kVar);
    }
}
