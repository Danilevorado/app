package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FO extends AbstractC1157am {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, 12, 69, 95, 12, 66, 67, 88, 12, 94, 73, 77, 72, 85, 12, 67, 94, 12, 77, 64, 94, 73, 77, 72, 85, 12, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public FO(C1073Yn c1073Yn, C02681u c02681u) {
        super(c1073Yn, c02681u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j10) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j10));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls == null || trackingUrls.isEmpty()) {
            return;
        }
        Iterator<String> it = trackingUrls.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (zHasNext) {
                new AsyncTaskC0886Re(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1157am
    public final void A0M() {
        C1191bK c1191bK = (C1191bK) this.A01;
        if (c1191bK.A0R()) {
            if (this.A06 != null) {
                this.A06.A0B(c1191bK);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1157am
    public final void A0O(InterfaceC02370p interfaceC02370p, C8S c8s, C8Q c8q, C02691v c02691v) {
        C1191bK c1191bK = (C1191bK) interfaceC02370p;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1154aj c1154aj = new C1154aj(this, c02691v, c1191bK, jCurrentTimeMillis, c8q);
        A0F().postDelayed(c1154aj, c8s.A05().A05());
        c1191bK.A0L(this.A0B, new C1153ai(this, c1154aj, jCurrentTimeMillis, c8q), this.A08, c02691v, V2.A0K());
    }
}
