package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5195a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5196b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f5197a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5198b;

        private a() {
        }

        public e a() {
            if (this.f5197a) {
                return new e(true, this.f5198b);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public a b() {
            this.f5197a = true;
            return this;
        }
    }

    private e(boolean z10, boolean z11) {
        this.f5195a = z10;
        this.f5196b = z11;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f5195a;
    }

    boolean b() {
        return this.f5196b;
    }
}
