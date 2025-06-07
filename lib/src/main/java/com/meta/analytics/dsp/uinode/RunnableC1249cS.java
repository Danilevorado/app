package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1249cS implements Runnable {
    public static String[] A03 = {"dpzU5luUOUHn3PWLQSytUkpXF5uf76Gb", "OIXAlbgxv8lxL6Dw2D3vNQ6xborOE6Ab", "016lHYH9eT2TKwrcc2bnFjN8P1e", "T3DTHKpc", "xtrZuPGJxZVhMxMYehMPzz7RP9cUVZ", "GHqsJR2NBv7dmhvhUyJ2cgs96CqPd5ri", "JC4MWKMVQLy9m", "a7WpfUfSeSK3qdCMwJm40hXORQEICpVd"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1248cR A01;
    public final /* synthetic */ Exception A02;

    public RunnableC1249cS(C1248cR c1248cR, int i10, Exception exc) {
        this.A01 = c1248cR;
        this.A00 = i10;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A01.A01) {
                    C1248cR c1248cR = this.A01;
                    c1248cR.A04(c1248cR.A05.AAY());
                    this.A01.A04.postDelayed(this.A01.A09, this.A00);
                }
            } catch (Exception e5) {
                StackTraceElement[] innerTrace = e5.getStackTrace();
                StackTraceElement[] stackTrace = this.A02.getStackTrace();
                StackTraceElement[] callerTrace = (StackTraceElement[]) Arrays.copyOf(innerTrace, innerTrace.length + stackTrace.length);
                System.arraycopy(stackTrace, 0, callerTrace, innerTrace.length, stackTrace.length);
                e5.setStackTrace(callerTrace);
                throw e5;
            }
        } catch (Throwable th) {
            if (A03[4].length() == 16) {
                throw new RuntimeException();
            }
            A03[3] = "b6O1Nd";
            KL.A00(th, this);
        }
    }
}
