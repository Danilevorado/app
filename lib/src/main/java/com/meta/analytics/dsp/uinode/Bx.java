package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Bx {
    public static String[] A01 = {"jIa5nEsghJXI3YtRygMiM4nRYP", "Ly9ufvl5ownJqyYsGEEXhuulkxQO72eL", "sMPtg", "IfecpjktAKGmFhJKDBvdKsFSs", "x3OFnvvirXrPXrYRolaRsAtReKUP", "t7Io5cjMF1OaMgplIhuUmJuHh", "FmC7xp59Mv4zEWANQ3dHM2IzVgPFt2kt", "Z77KJEO3n3QLGnllHMFWIwXSkpKCnreC"};
    public final C0654Hz A00 = new C0654Hz(10);

    public final Metadata A00(InterfaceC0512Bt interfaceC0512Bt, InterfaceC0544Di interfaceC0544Di) throws InterruptedException, IOException {
        int tagLength = 0;
        Metadata metadataA0O = null;
        while (true) {
            try {
                interfaceC0512Bt.ADv(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int iA0G = this.A00.A0G();
                int peekedId3Bytes = C1012Wd.A03;
                if (iA0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int iA0D = this.A00.A0D();
                int framesLength = iA0D + 10;
                if (metadataA0O == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    interfaceC0512Bt.ADv(bArr, 10, iA0D);
                    metadataA0O = new C1012Wd(interfaceC0544Di).A0O(bArr, framesLength);
                } else {
                    interfaceC0512Bt.A3W(iA0D);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC0512Bt.AFM();
        interfaceC0512Bt.A3W(tagLength);
        if (A01[1].charAt(2) != '9') {
            throw new RuntimeException();
        }
        A01[6] = "WrSJC1Ub8dr1CYR3Oq5fRcEdvzu2UCyy";
        return metadataA0O;
    }
}
