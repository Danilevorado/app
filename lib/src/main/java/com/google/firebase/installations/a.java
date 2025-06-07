package com.google.firebase.installations;

import com.google.firebase.installations.g;
import java.util.Objects;

/* loaded from: classes.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final String f21351a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21352b;

    /* renamed from: c, reason: collision with root package name */
    private final long f21353c;

    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private String f21354a;

        /* renamed from: b, reason: collision with root package name */
        private Long f21355b;

        /* renamed from: c, reason: collision with root package name */
        private Long f21356c;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str = "";
            if (this.f21354a == null) {
                str = " token";
            }
            if (this.f21355b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f21356c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f21354a, this.f21355b.longValue(), this.f21356c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f21354a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f21356c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f21355b = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, long j10, long j11) {
        this.f21351a = str;
        this.f21352b = j10;
        this.f21353c = j11;
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f21351a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f21353c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f21352b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f21351a.equals(gVar.b()) && this.f21352b == gVar.d() && this.f21353c == gVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f21351a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f21352b;
        long j11 = this.f21353c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f21351a + ", tokenExpirationTimestamp=" + this.f21352b + ", tokenCreationTimestamp=" + this.f21353c + "}";
    }
}
