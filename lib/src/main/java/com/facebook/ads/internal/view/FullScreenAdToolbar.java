package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meta.analytics.dsp.uinode.AbstractC0740Lo;
import com.meta.analytics.dsp.uinode.C02481a;
import com.meta.analytics.dsp.uinode.C02541g;
import com.meta.analytics.dsp.uinode.C0753Mb;
import com.meta.analytics.dsp.uinode.C0844Po;
import com.meta.analytics.dsp.uinode.C1073Yn;
import com.meta.analytics.dsp.uinode.C1P;
import com.meta.analytics.dsp.uinode.EnumC0748Lw;
import com.meta.analytics.dsp.uinode.JA;
import com.meta.analytics.dsp.uinode.LD;
import com.meta.analytics.dsp.uinode.M9;
import com.meta.analytics.dsp.uinode.MA;
import com.meta.analytics.dsp.uinode.MB;
import com.meta.analytics.dsp.uinode.MC;
import com.meta.analytics.dsp.uinode.ML;
import com.meta.analytics.dsp.uinode.OI;
import com.meta.analytics.dsp.uinode.ViewOnClickListenerC0945Tl;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends MB {
    public static byte[] A09;
    public static String[] A0A = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public M9 A00;
    public MA A01;
    public MA A02;
    public boolean A03;
    public final RelativeLayout A04;
    public final JA A05;
    public final MC A06;
    public final C0753Mb A07;
    public final C0844Po A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74, 77, 72, 72, 69, 59, 58, 75};
    }

    static {
        A03();
        int i10 = (int) (LD.A02 * 10.0f);
        A0B = i10;
        int i11 = (int) (LD.A02 * 16.0f);
        A0F = i11;
        A0D = i11 - i10;
        A0E = (i11 * 2) - i10;
        A0C = (int) (LD.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1073Yn c1073Yn, MC mc, JA ja2, int i10) {
        super(c1073Yn);
        this.A01 = null;
        this.A03 = true;
        this.A06 = mc;
        this.A05 = ja2;
        setGravity(16);
        C0753Mb c0753Mb = new C0753Mb(c1073Yn, i10);
        this.A07 = c0753Mb;
        c0753Mb.setContentDescription(A02(0, 8, 50));
        c0753Mb.setActionClickListener(new ML(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = A0D;
        layoutParams.setMargins(i11, i11, A0E, i11);
        addView(c0753Mb, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(c1073Yn);
        this.A04 = relativeLayout;
        LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(0, -2);
        containerParams.weight = 1.0f;
        C0844Po c0844Po = new C0844Po(c1073Yn);
        this.A08 = c0844Po;
        AbstractC0740Lo.A0G(1006, c0844Po);
        LinearLayout.LayoutParams toolbarActionViewParams = new LinearLayout.LayoutParams(-2, -2);
        toolbarActionViewParams.gravity = 17;
        c0844Po.setLayoutParams(toolbarActionViewParams);
        relativeLayout.addView(c0844Po);
        addView(relativeLayout, containerParams);
    }

    public FullScreenAdToolbar(C1073Yn c1073Yn, MC mc, JA ja2, int i10, int i11) {
        this(c1073Yn, mc, ja2, i10);
        A09(c1073Yn, i11);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A04() {
        MA ma2 = this.A01;
        if (ma2 != null) {
            this.A02 = ma2;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A05() {
        this.A01 = getToolbarListener();
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final void A06(C1P c1p, boolean z10) {
        boolean z11 = this.A03;
        int iA04 = c1p.A04(z11);
        this.A08.A02(c1p.A0A(z11), iA04);
        this.A00.setIconColors(iA04);
        this.A00.setContentDescription(A02(8, 9, 117));
        this.A07.A02(c1p, z11, z10);
        if (z11) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            AbstractC0740Lo.A0S(this, gradientDrawable);
            AbstractC0740Lo.A0Q(this.A00, 0, -16777216, A0C);
            return;
        }
        AbstractC0740Lo.A0M(this, 0);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public final boolean A07() {
        return this.A07.A03();
    }

    public final void A08(C02481a c02481a, String str, int i10) {
        this.A07.setInitialUnskippableSeconds(i10);
        M9 m92 = this.A00;
        if (m92 != null) {
            m92.setAdDetails(c02481a, str, this.A05, this.A06);
        }
    }

    public final void A09(C1073Yn c1073Yn, int i10) {
        M9 m92 = this.A00;
        if (m92 != null) {
            AbstractC0740Lo.A0J(m92);
            this.A00.removeAllViews();
        }
        this.A00 = new M9(c1073Yn, i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int i11 = A0F;
        layoutParams.setMargins(0, i11 / 2, i11 / 2, i11 / 2);
        addView(this.A00, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public View getDetailsContainer() {
        return this.A04;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public int getToolbarActionMode() {
        return this.A07.getToolbarActionMode();
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public int getToolbarHeight() {
        return MB.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public MA getToolbarListener() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setAdReportingVisible(boolean z10) {
        this.A00.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A08.setOnClickListener(onClickListener);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setCTAClickListener(ViewOnClickListenerC0945Tl viewOnClickListenerC0945Tl) {
        this.A08.setOnClickListener(OI.A03(viewOnClickListenerC0945Tl, A02(17, 7, 104)));
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setFullscreen(boolean z10) {
        this.A03 = z10;
    }

    public void setOnlyPageDetails(C02481a c02481a) {
        if (c02481a != null) {
            this.A08.setPageDetails(c02481a);
        } else {
            this.A08.A01();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setPageDetails(C02481a c02481a, String str, int i10, C02541g c02541g) {
        this.A07.setInitialUnskippableSeconds(i10);
        this.A08.setPageDetails(c02481a);
        M9 m92 = this.A00;
        if (m92 != null) {
            m92.setAdDetails(c02481a, str, this.A05, this.A06);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setPageDetailsVisible(boolean z10) {
        this.A04.removeAllViews();
        if (z10) {
            RelativeLayout relativeLayout = this.A04;
            C0844Po c0844Po = this.A08;
            if (A0A[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(c0844Po);
        }
        C0753Mb c0753Mb = this.A07;
        String[] strArr2 = A0A;
        if (strArr2[2].length() == strArr2[3].length()) {
            c0753Mb.setToolbarMessageEnabled(!z10);
        } else {
            A0A[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
            c0753Mb.setToolbarMessageEnabled(!z10);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgress(float f5) {
        this.A07.setProgress(f5);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setProgressClickListener(onClickListener);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressImage(EnumC0748Lw enumC0748Lw) {
        this.A07.setProgressImage(enumC0748Lw);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressImmediate(float f5) {
        this.A07.setProgressImmediate(f5);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setProgressSpinnerInvisible(boolean z10) {
        this.A07.setProgressSpinnerInvisible(z10);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarActionMessage(String str) {
        this.A07.setToolbarMessage(str);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarActionMode(int i10) {
        this.A07.setToolbarActionMode(i10);
    }

    @Override // com.meta.analytics.dsp.uinode.MB
    public void setToolbarListener(MA ma2) {
        this.A02 = ma2;
    }
}
