package com.meta.analytics.dsp.uinode;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class SL extends O4 {
    public final ImageView A00;
    public final C1073Yn A01;

    public SL(C1073Yn c1073Yn) {
        super(c1073Yn);
        this.A01 = c1073Yn;
        ImageView imageView = new ImageView(c1073Yn);
        this.A00 = imageView;
        imageView.setAdjustViewBounds(true);
        addView(imageView, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC0950Tq downloadImageTask = new AsyncTaskC0950Tq(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
