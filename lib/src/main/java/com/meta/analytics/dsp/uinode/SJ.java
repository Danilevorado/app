package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class SJ implements InterfaceC0885Rd {
    public static String[] A01 = {"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    public final /* synthetic */ Q7 A00;

    public SJ(Q7 q72) {
        this.A00 = q72;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0885Rd
    public final void AEA() {
        if (this.A00.A02 != null) {
            Q7 q72 = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            A01[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            q72.A02.A43(this.A00.A03.A7w());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0885Rd
    public final void AEC(C0887Rf c0887Rf) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c0887Rf != null && c0887Rf.A00()) {
            MC mc = this.A00.A02;
            Q7 q72 = this.A00;
            if (A01[5].length() == 14) {
                throw new RuntimeException();
            }
            A01[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
            mc.A43(q72.A03.A7x());
            return;
        }
        this.A00.A02.A43(this.A00.A03.A7w());
    }
}
