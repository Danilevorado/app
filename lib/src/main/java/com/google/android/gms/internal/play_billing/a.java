package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
enum a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final m C;

    /* renamed from: m, reason: collision with root package name */
    private final int f19453m;

    static {
        l lVar = new l();
        for (a aVar : values()) {
            lVar.a(Integer.valueOf(aVar.f19453m), aVar);
        }
        C = lVar.b();
    }

    a(int i10) {
        this.f19453m = i10;
    }

    static a b(int i10) {
        m mVar = C;
        Integer numValueOf = Integer.valueOf(i10);
        return !mVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (a) mVar.get(numValueOf);
    }
}
