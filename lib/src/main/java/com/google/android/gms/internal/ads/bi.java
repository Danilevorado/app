package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bi extends ui {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f6490i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f6491j = new Object();

    public bi(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "CNH0HFMOMU1Nrmid580u5GwyoVtbweFPAsHIvna6oGuy7GvzbjYQOB8wix+zhJ0t", "afOCxwiNZt1pFw/pjRCeFiRYbGwWcjibO33q64LhR0M=", xcVar, i10, 22);
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        if (f6490i == null) {
            synchronized (f6491j) {
                if (f6490i == null) {
                    f6490i = (Long) this.f16346f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f16345e) {
            this.f16345e.A0(f6490i.longValue());
        }
    }
}
