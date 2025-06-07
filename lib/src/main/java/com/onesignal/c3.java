package com.onesignal;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class c3 extends WebView {
    public c3(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }
}
