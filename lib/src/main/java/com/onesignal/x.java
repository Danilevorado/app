package com.onesignal;

import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22500a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f22501b;

    public x(boolean z10, PackageInfo packageInfo) {
        this.f22500a = z10;
        this.f22501b = packageInfo;
    }

    public final PackageInfo a() {
        return this.f22501b;
    }

    public final boolean b() {
        return this.f22500a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f22500a == xVar.f22500a && rb.h.a(this.f22501b, xVar.f22501b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f22500a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        PackageInfo packageInfo = this.f22501b;
        return i10 + (packageInfo == null ? 0 : packageInfo.hashCode());
    }

    public String toString() {
        return "GetPackageInfoResult(successful=" + this.f22500a + ", packageInfo=" + this.f22501b + ')';
    }
}
