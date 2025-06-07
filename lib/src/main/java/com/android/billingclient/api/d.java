package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private int f5188a;

    /* renamed from: b, reason: collision with root package name */
    private String f5189b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f5190a;

        /* renamed from: b, reason: collision with root package name */
        private String f5191b = "";

        /* synthetic */ a(k1.r rVar) {
        }

        public d a() {
            d dVar = new d();
            dVar.f5188a = this.f5190a;
            dVar.f5189b = this.f5191b;
            return dVar;
        }

        public a b(String str) {
            this.f5191b = str;
            return this;
        }

        public a c(int i10) {
            this.f5190a = i10;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f5189b;
    }

    public int b() {
        return this.f5188a;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.a0.f(this.f5188a) + ", Debug Message: " + this.f5189b;
    }
}
