package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0829Oz implements View.OnTouchListener {
    public final /* synthetic */ B3 A00;

    public ViewOnTouchListenerC0829Oz(B3 b32) {
        this.A00 = b32;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0E.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
