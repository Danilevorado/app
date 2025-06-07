package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class ji extends ui {

    /* renamed from: i, reason: collision with root package name */
    private List f10498i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f10499j;

    public ji(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, Context context) {
        super(dhVar, "Jdw9xFuo4OHuL+Waf9VEkBs6M7XtRhuX3PknFoicWEjQXQ4CENXY5MXEEK1WPoR/", "NFKyR+VbXbtroBTvca7ACsz/BEp9N5Lv9/EMVuAgXOo=", xcVar, i10, 31);
        this.f10498i = null;
        this.f10499j = context;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        this.f16345e.R(-1L);
        this.f16345e.N(-1L);
        Context contextB = this.f10499j;
        if (contextB == null) {
            contextB = this.f16342b.b();
        }
        if (this.f10498i == null) {
            this.f10498i = (List) this.f16346f.invoke(null, contextB);
        }
        List list = this.f10498i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f16345e) {
            this.f16345e.R(((Long) this.f10498i.get(0)).longValue());
            this.f16345e.N(((Long) this.f10498i.get(1)).longValue());
        }
    }
}
