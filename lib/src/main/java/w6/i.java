package w6;

import r6.m;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27985a;

    i(boolean z10) {
        this.f27985a = z10;
    }

    public void a(m[] mVarArr) {
        if (!this.f27985a || mVarArr == null || mVarArr.length < 3) {
            return;
        }
        m mVar = mVarArr[0];
        mVarArr[0] = mVarArr[2];
        mVarArr[2] = mVar;
    }
}
