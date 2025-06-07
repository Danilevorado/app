package xb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class l extends k {
    public static boolean d(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean e(String str, int i10, String str2, int i11, int i12, boolean z10) {
        rb.h.e(str, "<this>");
        rb.h.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final boolean f(String str, String str2, boolean z10) {
        rb.h.e(str, "<this>");
        rb.h.e(str2, "prefix");
        return !z10 ? str.startsWith(str2) : e(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean g(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return f(str, str2, z10);
    }
}
