package bc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static final int a(String str, int i10, int i11, int i12) {
        return (int) m.c(str, i10, i11, i12);
    }

    public static final long b(String str, long j10, long j11, long j12) {
        String strD = m.d(str);
        if (strD == null) {
            return j10;
        }
        Long lB = xb.k.b(strD);
        if (lB == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lB.longValue();
        boolean z10 = false;
        if (j11 <= jLongValue && jLongValue <= j12) {
            z10 = true;
        }
        if (z10) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final boolean c(String str, boolean z10) {
        String strD = m.d(str);
        return strD == null ? z10 : Boolean.parseBoolean(strD);
    }

    public static /* synthetic */ int d(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return m.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long e(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return m.c(str, j10, j13, j12);
    }
}
