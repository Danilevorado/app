package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0611Gh {
    public int A00;
    public final int A01;
    public final InterfaceC0610Gg[] A02;

    public C0611Gh(InterfaceC0610Gg... interfaceC0610GgArr) {
        this.A02 = interfaceC0610GgArr;
        this.A01 = interfaceC0610GgArr.length;
    }

    public final InterfaceC0610Gg A00(int i10) {
        return this.A02[i10];
    }

    public final InterfaceC0610Gg[] A01() {
        return (InterfaceC0610Gg[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C0611Gh) obj).A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}
