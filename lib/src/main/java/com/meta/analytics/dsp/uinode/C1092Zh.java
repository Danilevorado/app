package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Zh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1092Zh implements InterfaceC03334i {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ C0556Eb A00;

    public C1092Zh(C0556Eb c0556Eb) {
        this.A00 = c0556Eb;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03334i
    public final void AAj(AnonymousClass56 anonymousClass56) {
        anonymousClass56.A0X(true);
        if (anonymousClass56.A06 != null && anonymousClass56.A07 == null) {
            anonymousClass56.A06 = null;
        }
        anonymousClass56.A07 = null;
        if (!anonymousClass56.A0A() && !this.A00.A1v(anonymousClass56.A0H) && anonymousClass56.A0c()) {
            C0556Eb c0556Eb = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            c0556Eb.removeDetachedView(anonymousClass56.A0H, false);
        }
    }
}
