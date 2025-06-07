package com.meta.analytics.dsp.uinode;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FG extends AbstractC1157am {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 112);
            i13++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public FG(C1073Yn c1073Yn, C02681u c02681u) {
        super(c1073Yn, c02681u);
    }

    private C1149ae A00(Runnable runnable) {
        return new C1149ae(this, runnable);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1157am
    public final void A0M() {
        AbstractC1180b9 abstractC1180b9 = (AbstractC1180b9) this.A01;
        abstractC1180b9.A00(this.A07.A00);
        abstractC1180b9.A01(this.A07.A01);
        abstractC1180b9.A0I();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1157am
    public final void A0O(InterfaceC02370p interfaceC02370p, C8S c8s, C8Q c8q, C02691v c02691v) {
        FY fy = (FY) interfaceC02370p;
        C1150af c1150af = new C1150af(this, c02691v, fy);
        if (C0662Ih.A27(this.A0B)) {
            A0F().postDelayed(c1150af, c8s.A05().A05());
        }
        C1073Yn c1073Yn = this.A0B;
        C1149ae c1149aeA00 = A00(c1150af);
        boolean z10 = this.A07.A06;
        String str = this.A07.A04;
        C02681u c02681u = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        fy.A0J(c1073Yn, c1149aeA00, c02691v, z10, str, c02681u.A05);
    }

    public final void A0X(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A7e() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC1180b9 rewardedVideoAdapter = (AbstractC1180b9) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
