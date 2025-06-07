package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Iv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0674Iv implements AudienceNetworkExportedActivityApi {
    public static byte[] A01;
    public static String[] A02 = {"lqcZKkXS6TgOyt76sZ5yjVO68Nd1QdQN", "bQWyI3suGbnh3U5StjCALiPIzXDV3Wa6", "hqk98641WxUvYLytASVEQqAqBzewRvKz", "WJUhx8cI8X6XmYecnMlLMKWkuLUkkXH9", "MP1e4gCZR", "1EPuqCSCyQ9J2YoomIIpPWX0Nb9xTOcz", "0suERcaSwAa0E2CxcbYZCTLc9cS16", "2TigNonfP4HCMPOeSAXXuXDynNOGBzuQ"};
    public final Activity A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {126, 121, 99, 104, 101, 97, 104, 118, 103, 103, 104, 120, 101, 126, 114, 121, 99, 118, 99, 126, 120, 121, 104, 124, 114, 110, 61, 58, 60, 49, 47, 42, 49, 39, 42, 49, 37, 43, 55};
        if (A02[2].charAt(23) != 'q') {
            throw new RuntimeException();
        }
        A02[2] = "wLiEtUSufX2SvKxRiuuw2ghqe6rTYyXA";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C0674Iv(Activity activity) {
        this.A00 = activity;
    }

    private void A02(int i10) {
        this.A00.setResult(i10);
        this.A00.finish();
    }

    private boolean A03(C0673Iu c0673Iu) {
        String callingPackage = this.A00.getCallingPackage();
        if (callingPackage != null) {
            String callingPackage2 = c0673Iu.A03;
            if (callingPackage.equals(callingPackage2)) {
                return true;
            }
        }
        A02(12);
        if (c0673Iu.A00 instanceof C1138aT) {
            ((C1138aT) c0673Iu.A00).A0F().A0E().AEj();
        }
        if (c0673Iu.A00 instanceof C1135aQ) {
            ((C1135aQ) c0673Iu.A00).A0H().A0E().AEj();
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi
    public final void onCreate(Bundle bundle) {
        C1073Yn c1073YnA05 = C03525c.A05(this.A00, UUID.randomUUID().toString());
        if (this.A00.isTaskRoot()) {
            c1073YnA05.A0E().AEc();
            A02(10);
            return;
        }
        String adId = this.A00.getIntent().getStringExtra(A00(26, 13, 15));
        if (adId == null) {
            c1073YnA05.A0E().AEf();
            A02(11);
            return;
        }
        C0673Iu c0673IuA04 = VW.A00().A04(adId);
        AnonymousClass23 anonymousClass23 = c0673IuA04 != null ? c0673IuA04.A00 : null;
        if (A02[6].length() == 29) {
            A02[6] = "3hvfYctBGPg0BeMvR8jiqRXkEjCpv";
            if (c0673IuA04 != null && (anonymousClass23 instanceof C1135aQ)) {
                if (!A03(c0673IuA04)) {
                    return;
                }
                C1135aQ c1135aQ = (C1135aQ) anonymousClass23;
                c1135aQ.A0G().A02().A0I(this.A00);
                c1135aQ.A0M(this.A00.getIntent().getIntExtra(A00(0, 26, 86), -1), 0L);
            } else {
                if (c0673IuA04 != null) {
                    boolean z10 = anonymousClass23 instanceof C1138aT;
                    if (A02[1].charAt(21) == 'i') {
                        A02[2] = "XUW1n7Q8abvbP2RLETYRfIyqCZkI4d7q";
                        if (z10) {
                            if (!A03(c0673IuA04)) {
                                return;
                            }
                            C1138aT c1138aT = (C1138aT) anonymousClass23;
                            c1138aT.A0E().A05().A0I(this.A00);
                            c1138aT.A0J();
                        }
                    }
                }
                c1073YnA05.A0E().AF5();
                A02(13);
                return;
            }
            this.A00.setResult(-1);
            this.A00.finish();
            return;
        }
        throw new RuntimeException();
    }
}
