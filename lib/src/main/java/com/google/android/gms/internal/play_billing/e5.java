package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public enum e5 implements p1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* renamed from: r, reason: collision with root package name */
    private static final q1 f19492r = new q1() { // from class: com.google.android.gms.internal.play_billing.c5
    };

    /* renamed from: m, reason: collision with root package name */
    private final int f19494m;

    e5(int i10) {
        this.f19494m = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19494m);
    }
}
