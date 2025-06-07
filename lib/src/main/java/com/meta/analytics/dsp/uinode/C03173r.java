package com.meta.analytics.dsp.uinode;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03173r extends C0556Eb {
    public C03173r(C1073Yn c1073Yn) {
        super(c1073Yn);
        setCarouselLayoutManager(c1073Yn);
    }

    public AbstractC0908Sa getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.C0556Eb
    public C1099Zo getLayoutManager() {
        return (C1099Zo) super.getLayoutManager();
    }

    public AbstractC03444t getOnScrollListener() {
        return new US(this);
    }

    private void setCarouselLayoutManager(C1073Yn c1073Yn) {
        C1099Zo c1099Zo = new C1099Zo(c1073Yn, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1099Zo.A1R(true);
        }
        super.setLayoutManager(c1099Zo);
    }

    @Override // com.meta.analytics.dsp.uinode.C0556Eb
    public void setLayoutManager(AbstractC03394o abstractC03394o) {
    }
}
