package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class d5 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    static final r1 f19482a = new d5();

    private d5() {
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final boolean a(int i10) {
        e5 e5Var = e5.BROADCAST_ACTION_UNSPECIFIED;
        if (i10 != 0) {
            e5Var = i10 != 1 ? i10 != 2 ? i10 != 3 ? null : e5.ALTERNATIVE_BILLING_ACTION : e5.LOCAL_PURCHASES_UPDATED_ACTION : e5.PURCHASES_UPDATED_ACTION;
        }
        return e5Var != null;
    }
}
