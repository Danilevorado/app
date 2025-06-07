package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UE implements InterfaceC0854Py {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{29, 27, 13, 26, 11, 4, 1, 11, 3};
    }

    public UE(UD ud) {
        this.A00 = ud;
    }

    public /* synthetic */ UE(UD ud, UK uk) {
        this(ud);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0854Py
    public final void ABD() {
        this.A00.A0U(true, A00(0, 9, 55));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0854Py
    public final void ABj() {
        if (!TextUtils.isEmpty(this.A00.A0F.A12())) {
            this.A00.A0J.A9g(this.A00.A0F.A12(), new C0786Ni().A03(this.A00.A07.getViewabilityChecker()).A02(this.A00.A07.getTouchDataRecorder()).A05());
            C1U.A07(this.A00.A0F.A0y(), this.A00.A0I);
            C2O.A00(this.A00.A0F.A0N());
            this.A00.A0I.A0E().A2k();
        }
        this.A00.A0N.A43(this.A00.A0O.A7B());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0854Py
    public final void AC4() {
        this.A00.A0N.A43(this.A00.A0O.A6y());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0854Py
    public final void ADj() {
        this.A00.A0N.AB0(15);
    }
}
