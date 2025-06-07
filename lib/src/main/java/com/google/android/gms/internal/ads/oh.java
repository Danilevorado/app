package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* loaded from: classes.dex */
public final class oh extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final Activity f13245i;

    /* renamed from: j, reason: collision with root package name */
    private final View f13246j;

    public oh(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, View view, Activity activity) {
        super(dhVar, "KT2Tv8TPKs8B/+lHkvvu6s01+PimOKMOvsBTxmvtb79k6T7ZyFNxwI/cZRLVhJ7V", "0IMe0hZjzvPOj0FU8vVpI60XmFXXOxBk0ZbCWvkG8dU=", xcVar, i10, 62);
        this.f13246j = view;
        this.f13245i = activity;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        if (this.f13246j == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) k3.w.c().b(ir.f10003l2)).booleanValue();
        Object[] objArr = (Object[]) this.f16346f.invoke(null, this.f13246j, this.f13245i, Boolean.valueOf(zBooleanValue));
        synchronized (this.f16345e) {
            this.f16345e.e0(((Long) objArr[0]).longValue());
            this.f16345e.g0(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.f16345e.f0((String) objArr[2]);
            }
        }
    }
}
