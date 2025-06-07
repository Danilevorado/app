package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Objects;

/* loaded from: classes.dex */
final class o03 extends j13 {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f12944a;

    /* renamed from: b, reason: collision with root package name */
    private String f12945b;

    /* renamed from: c, reason: collision with root package name */
    private int f12946c;

    /* renamed from: d, reason: collision with root package name */
    private float f12947d;

    /* renamed from: e, reason: collision with root package name */
    private int f12948e;

    /* renamed from: f, reason: collision with root package name */
    private String f12949f;

    /* renamed from: g, reason: collision with root package name */
    private byte f12950g;

    o03() {
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final j13 a(String str) {
        this.f12949f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final j13 b(String str) {
        this.f12945b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final j13 c(int i10) {
        this.f12950g = (byte) (this.f12950g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final j13 d(int i10) {
        this.f12946c = i10;
        this.f12950g = (byte) (this.f12950g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final j13 e(float f5) {
        this.f12947d = f5;
        this.f12950g = (byte) (this.f12950g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final j13 f(boolean z10) {
        this.f12950g = (byte) (this.f12950g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final j13 g(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.f12944a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final j13 h(int i10) {
        this.f12948e = i10;
        this.f12950g = (byte) (this.f12950g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j13
    public final k13 i() {
        IBinder iBinder;
        if (this.f12950g == 31 && (iBinder = this.f12944a) != null) {
            return new r03(iBinder, false, this.f12945b, this.f12946c, this.f12947d, 0, null, this.f12948e, this.f12949f, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12944a == null) {
            sb2.append(" windowToken");
        }
        if ((this.f12950g & 1) == 0) {
            sb2.append(" stableSessionToken");
        }
        if ((this.f12950g & 2) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.f12950g & 4) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.f12950g & 8) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.f12950g & 16) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
