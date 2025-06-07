package com.meta.analytics.dsp.uinode;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0509Bq implements WL {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public C03414q A02;
    public final ArrayDeque<C03414q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0510Br> A04;
    public final PriorityQueue<C03414q> A05;

    public abstract WI A0N();

    public abstract void A0P(C5 c52);

    public abstract boolean A0R();

    public AbstractC0509Bq() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new C03414q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.A04.add(new C03384n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C03414q c03414q) {
        c03414q.A07();
        this.A03.add(c03414q);
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public C5 A54() throws C0594Fp {
        AbstractC0629Ha.A04(this.A02 == null);
        boolean zIsEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (zIsEmpty) {
            return null;
        }
        C03414q c03414qPollFirst = this.A03.pollFirst();
        this.A02 = c03414qPollFirst;
        return c03414qPollFirst;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC0510Br A55() throws C0594Fp {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1051Xr) this.A05.peek()).A00 <= this.A00) {
            C03414q c03414qPoll = this.A05.poll();
            if (c03414qPoll.A04()) {
                AbstractC0510Br abstractC0510BrPollFirst = this.A04.pollFirst();
                abstractC0510BrPollFirst.A00(4);
                A0K(c03414qPoll);
                String[] strArr = A06;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "Z7l20gfPvvtRCAhrDUNIN8ivECfXDju3";
                strArr2[3] = "MHWMj6Fd4O5yELPFkyyjrniha9DdnabU";
                return abstractC0510BrPollFirst;
            }
            A0P(c03414qPoll);
            if (A0R()) {
                WI wiA0N = A0N();
                if (!c03414qPoll.A03()) {
                    AbstractC0510Br abstractC0510BrPollFirst2 = this.A04.pollFirst();
                    abstractC0510BrPollFirst2.A09(((C1051Xr) c03414qPoll).A00, wiA0N, Long.MAX_VALUE);
                    A0K(c03414qPoll);
                    return abstractC0510BrPollFirst2;
                }
            }
            A0K(c03414qPoll);
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEG(C5 c52) throws C0594Fp {
        AbstractC0629Ha.A03(c52 == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (c52.A03()) {
            A0K(this.A02);
        } else {
            C03414q c03414q = this.A02;
            long j10 = this.A01;
            this.A01 = 1 + j10;
            c03414q.A00 = j10;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0510Br abstractC0510Br) {
        abstractC0510Br.A07();
        this.A04.add(abstractC0510Br);
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    public void AEV() {
    }

    @Override // com.meta.analytics.dsp.uinode.WL
    public void AGB(long j10) {
        this.A00 = j10;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C03414q c03414q = this.A02;
        if (c03414q != null) {
            A0K(c03414q);
            this.A02 = null;
        }
    }
}
