package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1168ax implements AnonymousClass61 {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC1176b5 A00;
    public final /* synthetic */ InterfaceC02551h A01;
    public final /* synthetic */ C02561i A02;
    public final /* synthetic */ C1073Yn A03;
    public final /* synthetic */ boolean A04;

    public C1168ax(C02561i c02561i, C1073Yn c1073Yn, boolean z10, AbstractC1176b5 abstractC1176b5, InterfaceC02551h interfaceC02551h) {
        this.A02 = c02561i;
        this.A03 = c1073Yn;
        this.A04 = z10;
        this.A00 = abstractC1176b5;
        this.A01 = interfaceC02551h;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        if (C0662Ih.A1O(this.A03) && this.A04) {
            this.A02.A02.add(PC.A01(this.A03, this.A00, 1, new C1169ay(this)));
            return;
        }
        InterfaceC02551h interfaceC02551h = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC02551h.AAf();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.AAe(AdError.CACHE_ERROR);
    }
}
