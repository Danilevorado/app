package com.meta.analytics.dsp.uinode;

import android.media.AudioTrack;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0484Ar {
    public static String[] A06 = {"tMW2fkMpy5HihKk0yN3j3FySApib3JSJ", "DmNw9hS4nxXBj6Mr2INd4L8q1xMEyvKq", "0eqkaL3Dsezuu4pOs0MDPfwpckzWpND4", "49OOFjFtCxl3f3ujLPMCOchIYt8uEQEa", "MWNNllbG7VNHRaURq2pyYfck8pAxQtjw", "ldwZ0eJIezAamtWPjZLM2iroOhc1OYkS", "11ihmkQKk", "Tg3NlfrAQ4uSsG9"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final C0482Ap A05;

    public C0484Ar(AudioTrack audioTrack) {
        if (IF.A02 >= 19) {
            this.A05 = new C0482Ap(audioTrack);
            A05();
        } else {
            this.A05 = null;
            A00(3);
        }
    }

    private void A00(int i10) {
        this.A00 = i10;
        switch (i10) {
            case 0:
                this.A03 = 0L;
                this.A01 = -1L;
                long jNanoTime = System.nanoTime();
                if (A06[6].length() != 9) {
                    throw new RuntimeException();
                }
                A06[6] = "I3kIT2QQI";
                this.A02 = jNanoTime / 1000;
                this.A04 = 5000L;
                return;
            case 1:
                this.A04 = 5000L;
                return;
            case 2:
            case 3:
                this.A04 = 10000000L;
                return;
            case 4:
                this.A04 = 500000L;
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A01() {
        C0482Ap c0482Ap = this.A05;
        if (c0482Ap != null) {
            return c0482Ap.A00();
        }
        return -1L;
    }

    public final long A02() {
        C0482Ap c0482Ap = this.A05;
        if (c0482Ap != null) {
            return c0482Ap.A01();
        }
        return -9223372036854775807L;
    }

    public final void A03() {
        if (this.A00 == 4) {
            A05();
        }
    }

    public final void A04() {
        A00(4);
    }

    public final void A05() {
        if (this.A05 != null) {
            A00(0);
        }
    }

    public final boolean A06() {
        int i10 = this.A00;
        return i10 == 1 || i10 == 2;
    }

    public final boolean A07() {
        return this.A00 == 2;
    }

    public final boolean A08(long j10) {
        C0482Ap c0482Ap = this.A05;
        if (c0482Ap == null || j10 - this.A03 < this.A04) {
            return false;
        }
        this.A03 = j10;
        boolean zA02 = c0482Ap.A02();
        switch (this.A00) {
            case 0:
                if (!zA02) {
                    if (j10 - this.A02 <= 500000) {
                        return zA02;
                    }
                    A00(3);
                    return zA02;
                }
                long jA01 = this.A05.A01();
                long timestampPositionFrames = this.A02;
                if (jA01 >= timestampPositionFrames) {
                    this.A01 = this.A05.A00();
                    A00(1);
                    return zA02;
                }
                return false;
            case 1:
                if (zA02) {
                    long jA00 = this.A05.A00();
                    long timestampPositionFrames2 = this.A01;
                    if (jA00 > timestampPositionFrames2) {
                        A00(2);
                        return zA02;
                    }
                    return zA02;
                }
                A05();
                return zA02;
            case 2:
                if (!zA02) {
                    A05();
                    return zA02;
                }
                return zA02;
            case 3:
                if (zA02) {
                    A05();
                    return zA02;
                }
                return zA02;
            case 4:
                return zA02;
            default:
                throw new IllegalStateException();
        }
    }
}
