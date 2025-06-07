package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class R3 implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0698Jv A00;

    public R3(TextureViewSurfaceTextureListenerC0698Jv textureViewSurfaceTextureListenerC0698Jv) {
        this.A00 = textureViewSurfaceTextureListenerC0698Jv;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00.A09 != null && motionEvent.getAction() == 1) {
            if (this.A00.A09.isShowing()) {
                this.A00.A09.hide();
            } else {
                this.A00.A09.show();
            }
        }
        return true;
    }
}
