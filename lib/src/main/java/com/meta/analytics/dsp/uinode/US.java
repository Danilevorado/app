package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class US extends AbstractC03444t {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C03173r A00;

    public US(C03173r c03173r) {
        this.A00 = c03173r;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03444t
    public final void A0L(C0556Eb c0556Eb, int i10) {
        int scrollPosition;
        super.A0L(c0556Eb, i10);
        C1099Zo linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A23()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0E()) {
            return;
        }
        MJ mj = (MJ) c0556Eb.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = "";
        if (mj == null) {
            return;
        }
        mj.AFr();
    }
}
