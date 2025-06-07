package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
abstract class d03 {

    /* renamed from: g, reason: collision with root package name */
    static final String f7143g = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    private final String f7144a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7145b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7146c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7147d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7148e;

    /* renamed from: f, reason: collision with root package name */
    final e03 f7149f;

    d03(Context context, String str, String str2, String str3) {
        this.f7149f = e03.b(context);
        this.f7144a = str;
        this.f7145b = str.concat("_3p");
        this.f7146c = str2;
        this.f7147d = str2.concat("_3p");
        this.f7148e = str3;
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f7148e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str2 == null ? "null" : "not null");
        sb2.append(", hashKey is ");
        sb2.append(str3 != null ? "not null" : "null");
        throw new IllegalArgumentException(sb2.toString());
    }

    final long a(boolean z10) {
        return this.f7149f.a(z10 ? this.f7147d : this.f7146c, -1L);
    }

    final c03 b(String str, String str2, long j10, boolean z10) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f7143g)) {
                    String strE = e(true);
                    String strC = this.f7149f.c("paid_3p_hash_key", null);
                    if (strE != null && strC != null && !strE.equals(h(str, str2, strC))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new c03();
        }
        boolean z11 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f7148e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jA = a(z11);
        if (jA != -1) {
            if (jCurrentTimeMillis < jA) {
                this.f7149f.d(z11 ? this.f7147d : this.f7146c, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jA + j10) {
                return c(str, str2);
            }
        }
        String strE2 = e(z11);
        return (strE2 != null || z10) ? new c03(strE2, a(z11)) : c(str, str2);
    }

    final c03 c(String str, String str2) throws IOException {
        String strH;
        boolean z10;
        if (str == null) {
            strH = UUID.randomUUID().toString();
            z10 = false;
        } else {
            String string = UUID.randomUUID().toString();
            this.f7149f.d("paid_3p_hash_key", string);
            strH = h(str, str2, string);
            z10 = true;
        }
        return d(strH, z10);
    }

    final c03 d(String str, boolean z10) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f7148e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.f7149f.d(z10 ? this.f7147d : this.f7146c, Long.valueOf(jCurrentTimeMillis));
        this.f7149f.d(z10 ? this.f7145b : this.f7144a, str);
        return new c03(str, jCurrentTimeMillis);
    }

    final String e(boolean z10) {
        return this.f7149f.c(z10 ? this.f7145b : this.f7144a, null);
    }

    final void f(boolean z10) throws IOException {
        this.f7149f.e(z10 ? this.f7147d : this.f7146c);
        this.f7149f.e(z10 ? this.f7145b : this.f7144a);
    }

    final boolean g(boolean z10) {
        return this.f7149f.g(this.f7144a);
    }
}
