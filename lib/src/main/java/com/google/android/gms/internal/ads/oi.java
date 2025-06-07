package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oi extends ui {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f13255i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f13256j = new Object();

    public oi(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "HiRHV0+7iHel8ouy3rC3Vh6JmfAaV6+B5y9bcOz6v6RtgCUkDJJ1u0Sc7x4KnqIM", "XIDT/tdnEZKwO9t3IF1TXzt4lSi3aThE4MpcZzXzgu8=", xcVar, i10, 33);
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        if (f13255i == null) {
            synchronized (f13256j) {
                if (f13255i == null) {
                    f13255i = (Long) this.f16346f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f16345e) {
            this.f16345e.Q(f13255i.longValue());
        }
    }
}
