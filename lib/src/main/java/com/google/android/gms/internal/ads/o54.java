package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o54 extends qj0 {
    public static final xa4 B = new xa4() { // from class: com.google.android.gms.internal.ads.n54
    };
    private static final String C = Integer.toString(AdError.NO_FILL_ERROR_CODE, 36);
    private static final String D = Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
    private static final String E = Integer.toString(1003, 36);
    private static final String F = Integer.toString(1004, 36);
    private static final String G = Integer.toString(1005, 36);
    private static final String H = Integer.toString(1006, 36);
    final boolean A;

    /* renamed from: u, reason: collision with root package name */
    public final int f13013u;

    /* renamed from: v, reason: collision with root package name */
    public final String f13014v;

    /* renamed from: w, reason: collision with root package name */
    public final int f13015w;

    /* renamed from: x, reason: collision with root package name */
    public final k9 f13016x;

    /* renamed from: y, reason: collision with root package name */
    public final int f13017y;

    /* renamed from: z, reason: collision with root package name */
    public final ja0 f13018z;

    private o54(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private o54(int i10, Throwable th, String str, int i11, String str2, int i12, k9 k9Var, int i13, boolean z10) {
        String str3;
        String str4;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(k9Var);
            int i14 = sv2.f15560a;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = str2 + " error, index=" + i12 + ", format=" + strValueOf + ", format_supported=" + str4;
        }
        this(TextUtils.isEmpty(null) ? str3 : str3.concat(": null"), th, i11, i10, str2, i12, k9Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private o54(String str, Throwable th, int i10, int i11, String str2, int i12, k9 k9Var, int i13, ja0 ja0Var, long j10, boolean z10) {
        boolean z11;
        super(str, th, i10, j10);
        int i14 = i11;
        if (!z10) {
            z11 = true;
        } else if (i14 == 1) {
            i14 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        gt1.d(z11);
        gt1.d(th != null);
        this.f13013u = i14;
        this.f13014v = str2;
        this.f13015w = i12;
        this.f13016x = k9Var;
        this.f13017y = i13;
        this.f13018z = ja0Var;
        this.A = z10;
    }

    public static o54 b(Throwable th, String str, int i10, k9 k9Var, int i11, boolean z10, int i12) {
        return new o54(1, th, null, i12, str, i10, k9Var, k9Var == null ? 4 : i11, z10);
    }

    public static o54 c(IOException iOException, int i10) {
        return new o54(0, iOException, i10);
    }

    public static o54 d(RuntimeException runtimeException, int i10) {
        return new o54(2, runtimeException, i10);
    }

    final o54 a(ja0 ja0Var) {
        String message = getMessage();
        int i10 = sv2.f15560a;
        return new o54(message, getCause(), this.f14360m, this.f13013u, this.f13014v, this.f13015w, this.f13016x, this.f13017y, ja0Var, this.f14361n, this.A);
    }
}
