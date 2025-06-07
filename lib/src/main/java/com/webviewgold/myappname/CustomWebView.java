package com.webviewgold.myappname;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class CustomWebView extends WebView {

    /* renamed from: m, reason: collision with root package name */
    private GestureDetector f22633m;

    public CustomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f22633m.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.f22633m = gestureDetector;
    }
}
