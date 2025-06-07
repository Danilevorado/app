package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2205e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2206a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2207b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2208c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2209d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f2206a = i10;
        this.f2207b = i11;
        this.f2208c = i12;
        this.f2209d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f2206a, bVar2.f2206a), Math.max(bVar.f2207b, bVar2.f2207b), Math.max(bVar.f2208c, bVar2.f2208c), Math.max(bVar.f2209d, bVar2.f2209d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f2205e : new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f2206a, this.f2207b, this.f2208c, this.f2209d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2209d == bVar.f2209d && this.f2206a == bVar.f2206a && this.f2208c == bVar.f2208c && this.f2207b == bVar.f2207b;
    }

    public int hashCode() {
        return (((((this.f2206a * 31) + this.f2207b) * 31) + this.f2208c) * 31) + this.f2209d;
    }

    public String toString() {
        return "Insets{left=" + this.f2206a + ", top=" + this.f2207b + ", right=" + this.f2208c + ", bottom=" + this.f2209d + '}';
    }
}
