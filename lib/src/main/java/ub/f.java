package ub;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f extends e {
    public static int a(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static int b(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long c(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static long d(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static a e(int i10, int i11) {
        return a.f27674p.a(i10, i11, -1);
    }
}
