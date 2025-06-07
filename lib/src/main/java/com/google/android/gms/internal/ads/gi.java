package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gi extends ui {

    /* renamed from: i, reason: collision with root package name */
    private static volatile String f8739i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f8740j = new Object();

    public gi(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "NVotBewebesTf3yaQqbfIHsAQGGO5mYV6zcO8zQG+1Te4y/3fFN6rm5Uo4mLM7YY", "Tgl2ye65VdPWpGRA4PcAavXIUkvdg+RB2j/Kpy7fLYc=", xcVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        this.f16345e.v("E");
        if (f8739i == null) {
            synchronized (f8740j) {
                if (f8739i == null) {
                    f8739i = (String) this.f16346f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f16345e) {
            this.f16345e.v(f8739i);
        }
    }
}
