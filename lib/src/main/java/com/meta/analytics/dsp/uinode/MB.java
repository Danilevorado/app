package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public abstract class MB extends LinearLayout {
    public static int A00 = (int) (LD.A02 * 56.0f);

    public abstract void A04();

    public abstract void A05();

    public abstract void A06(C1P c1p, boolean z10);

    public abstract boolean A07();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract MA getToolbarListener();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC0945Tl viewOnClickListenerC0945Tl);

    public abstract void setFullscreen(boolean z10);

    public abstract void setPageDetails(C02481a c02481a, String str, int i10, C02541g c02541g);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f5);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(EnumC0748Lw enumC0748Lw);

    public abstract void setProgressImmediate(float f5);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i10);

    public abstract void setToolbarListener(MA ma2);

    public MB(Context context) {
        super(context);
    }
}
