package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1149ae implements AnonymousClass18 {
    public static byte[] A02;
    public static String[] A03 = {"gOGPE1XGqnroAJihU7XGAfTAdWa21jWC", "Kcs30m2Uc1eFMAQARd2pOhOOSRswugkg", "xkwB", "vFLx4ryI8nKhSFQKGVnAMH5qObxMihWN", "NnwKyO2XMzRH0BXfVduboZ9DAJ5a5svW", "U3uRLxNZuwH", "U9y6Wp3Jad2LD1", "sOAhAPVwmiqriGnbgM61Uai8lTIQh97W"};
    public final /* synthetic */ FG A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{81, 3, 5, 95, 81, 7, 7, 84, 112, 71, 85, 67, 80, 70, 71, 70, 2, 116, 75, 70, 71, 77, 2, 75, 79, 82, 80, 71, 81, 81, 75, 77, 76, 2, 68, 75, 80, 71, 70, 70, 71, 123, 76, 94, 72, 91, 77, 76, 77, Byte.MAX_VALUE, 64, 77, 76, 70, 104, 77, 101, 70, 78, 78, 64, 71, 78, 96, 68, 89, 91, 76, 90, 90, 64, 70, 71};
    }

    static {
        A01();
    }

    public C1149ae(FG fg, Runnable runnable) {
        this.A00 = fg;
        this.A01 = runnable;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void ACv(AbstractC1180b9 abstractC1180b9) {
        this.A00.A06.A06();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void ACw(AbstractC1180b9 abstractC1180b9) {
        this.A00.A06.A07();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void ACx(AbstractC1180b9 abstractC1180b9) {
        this.A00.A06.A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void ACy(AbstractC1180b9 abstractC1180b9) {
        this.A00.A0F().removeCallbacks(this.A01);
        this.A00.A01 = abstractC1180b9;
        this.A00.A0I();
        this.A00.A06.A0F(abstractC1180b9);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void ACz(AbstractC1180b9 abstractC1180b9) {
        AbstractC0692Jp.A05(A00(39, 34, 72), A00(8, 31, 67), A00(0, 8, 7));
        this.A00.A06.A0D();
        this.A00.A0L();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void AD0(AbstractC1180b9 abstractC1180b9) {
        this.A00.A06.A08();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void AD1(AbstractC1180b9 abstractC1180b9, AdError adError) {
        this.A00.A0F().removeCallbacks(this.A01);
        this.A00.A0B.A0E().A4t(adError.getErrorCode(), adError.getErrorMessage());
        if (AdError.AD_PRESENTATION_ERROR.equals(adError) && C0662Ih.A1V(this.A00.A0B)) {
            this.A00.A06.A0G(C0679Jb.A00(AdErrorType.AD_PRESENTATION_ERROR));
        } else {
            AdError adError2 = AdError.NO_FILL;
            if (A03[2].length() != 4) {
                throw new RuntimeException();
            }
            A03[2] = "s57s";
            if (adError2.equals(adError)) {
                this.A00.A06.A0G(C0679Jb.A00(AdErrorType.NO_FILL));
            } else {
                this.A00.A06.A0G(C0679Jb.A00(AdErrorType.INTERNAL_ERROR));
            }
        }
        this.A00.A0N(abstractC1180b9);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A06.A09();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass18
    public final void onRewardedVideoClosed() {
        this.A00.A06.A0A();
    }
}
