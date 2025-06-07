package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class FH extends AbstractC0961Ub<C1151ag> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FH(C1151ag c1151ag) {
        super(c1151ag);
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C1151ag c1151agA07 = A07();
        if (c1151agA07 == null) {
            return;
        }
        C1073Yn c1073Yn = c1151agA07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (M5.A02(c1073Yn)) {
            c1151agA07.A07();
        } else {
            c1151agA07.A05.postDelayed(c1151agA07.A0C, 5000L);
        }
    }
}
