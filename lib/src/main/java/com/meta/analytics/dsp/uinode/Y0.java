package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y0 implements InterfaceC0490Ax {
    public final C1054Xu A00;
    public final C1053Xt A01;
    public final InterfaceC0468Ab[] A02;

    public Y0(InterfaceC0468Ab... interfaceC0468AbArr) {
        InterfaceC0468Ab[] interfaceC0468AbArr2 = (InterfaceC0468Ab[]) Arrays.copyOf(interfaceC0468AbArr, interfaceC0468AbArr.length + 2);
        this.A02 = interfaceC0468AbArr2;
        C1054Xu c1054Xu = new C1054Xu();
        this.A00 = c1054Xu;
        C1053Xt c1053Xt = new C1053Xt();
        this.A01 = c1053Xt;
        interfaceC0468AbArr2[interfaceC0468AbArr.length] = c1054Xu;
        interfaceC0468AbArr2[interfaceC0468AbArr.length + 1] = c1053Xt;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0490Ax
    public final C04649x A3b(C04649x c04649x) {
        this.A00.A0B(c04649x.A02);
        return new C04649x(this.A01.A01(c04649x.A01), this.A01.A00(c04649x.A00), c04649x.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0490Ax
    public final InterfaceC0468Ab[] A64() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0490Ax
    public final long A7O(long j10) {
        return this.A01.A02(j10);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0490Ax
    public final long A80() {
        return this.A00.A0A();
    }
}
