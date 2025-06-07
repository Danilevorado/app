package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ao3 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f6188a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private xn3 f6189b = xn3.f17644b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f6190c = null;

    public final ao3 a(qc3 qc3Var, int i10, String str, String str2) {
        ArrayList arrayList = this.f6188a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new co3(qc3Var, i10, str, str2, null));
        return this;
    }

    public final ao3 b(xn3 xn3Var) {
        if (this.f6188a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f6189b = xn3Var;
        return this;
    }

    public final ao3 c(int i10) {
        if (this.f6188a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f6190c = Integer.valueOf(i10);
        return this;
    }

    public final eo3 d() throws GeneralSecurityException {
        if (this.f6188a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.f6190c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f6188a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int iA = ((co3) arrayList.get(i10)).a();
                i10++;
                if (iA == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        eo3 eo3Var = new eo3(this.f6189b, Collections.unmodifiableList(this.f6188a), this.f6190c, null);
        this.f6188a = null;
        return eo3Var;
    }
}
