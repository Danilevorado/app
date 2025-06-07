package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class ai extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final Map f6094i;

    /* renamed from: j, reason: collision with root package name */
    private final View f6095j;

    /* renamed from: k, reason: collision with root package name */
    private final Context f6096k;

    public ai(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, Map map, View view, Context context) {
        super(dhVar, "C2cxj1PqlGI/7sXzj/vQoDZCGl/mHCTxIbvQCRFAKNnzfg9WbUpjhk8QJWw60E8Q", "faUXYiGUMq7bQIeIkZZxqavg/5i6OivEyj0LKDXCfso=", xcVar, i10, 85);
        this.f6094i = map;
        this.f6095j = view;
        this.f6096k = context;
    }

    private final long c(int i10) {
        Map map = this.f6094i;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f6094i.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        long[] jArr = {c(1), c(2)};
        Context contextB = this.f6096k;
        if (contextB == null) {
            contextB = this.f16342b.b();
        }
        long[] jArr2 = (long[]) this.f16346f.invoke(null, jArr, contextB, this.f6095j);
        long j10 = jArr2[0];
        this.f6094i.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.f6094i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f16345e) {
            this.f16345e.x0(j10);
            this.f16345e.w0(j11);
        }
    }
}
