package l5;

import android.content.Context;
import android.graphics.Color;
import p5.b;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f25109f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25110a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25111b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25112c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25113d;

    /* renamed from: e, reason: collision with root package name */
    private final float f25114e;

    public a(Context context) {
        this(b.b(context, c5.b.f4688p, false), i5.a.b(context, c5.b.f4687o, 0), i5.a.b(context, c5.b.f4686n, 0), i5.a.b(context, c5.b.f4684l, 0), context.getResources().getDisplayMetrics().density);
    }

    public a(boolean z10, int i10, int i11, int i12, float f5) {
        this.f25110a = z10;
        this.f25111b = i10;
        this.f25112c = i11;
        this.f25113d = i12;
        this.f25114e = f5;
    }

    private boolean e(int i10) {
        return androidx.core.graphics.a.j(i10, 255) == this.f25113d;
    }

    public float a(float f5) {
        if (this.f25114e <= 0.0f || f5 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f5 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f5) {
        int i11;
        float fA = a(f5);
        int iAlpha = Color.alpha(i10);
        int iH = i5.a.h(androidx.core.graphics.a.j(i10, 255), this.f25111b, fA);
        if (fA > 0.0f && (i11 = this.f25112c) != 0) {
            iH = i5.a.g(iH, androidx.core.graphics.a.j(i11, f25109f));
        }
        return androidx.core.graphics.a.j(iH, iAlpha);
    }

    public int c(int i10, float f5) {
        return (this.f25110a && e(i10)) ? b(i10, f5) : i10;
    }

    public boolean d() {
        return this.f25110a;
    }
}
