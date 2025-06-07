package com.meta.analytics.dsp.uinode;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class R7 implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0697Ju A00;

    public R7(TextureViewSurfaceTextureListenerC0697Ju textureViewSurfaceTextureListenerC0697Ju) {
        this.A00 = textureViewSurfaceTextureListenerC0697Ju;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.A00.A0G && this.A00.A0A != null && motionEvent.getAction() == 1) {
            if (this.A00.A0A.isShowing()) {
                this.A00.A0A.hide();
            } else {
                this.A00.A0A.show();
            }
        }
        return true;
    }
}
