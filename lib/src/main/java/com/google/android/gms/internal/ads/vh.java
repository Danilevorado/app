package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vh extends ui {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f16688i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f16689j = new Object();

    public vh(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "kqx1em1yk7MpX3m25KaHLmM/cmSaigSw7EiXU2reD6DVU/yG3Bj+ID2Om7QFkYwd", "7E6XPHHgJYFzxm7py5uavXz1wvEMAaDOWzYZ4RGmH8Q=", xcVar, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        if (f16688i == null) {
            synchronized (f16689j) {
                if (f16688i == null) {
                    f16688i = (Long) this.f16346f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f16345e) {
            this.f16345e.q0(f16688i.longValue());
        }
    }
}
