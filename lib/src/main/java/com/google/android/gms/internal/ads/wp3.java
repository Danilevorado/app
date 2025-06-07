package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class wp3 extends t63 {

    /* renamed from: n, reason: collision with root package name */
    public final ib3 f17241n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17242o;

    public wp3(ib3 ib3Var, int i10, int i11) {
        super(b(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.f17241n = ib3Var;
        this.f17242o = 1;
    }

    public wp3(IOException iOException, ib3 ib3Var, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f17241n = ib3Var;
        this.f17242o = i11;
    }

    public wp3(String str, ib3 ib3Var, int i10, int i11) {
        super(str, b(i10, i11));
        this.f17241n = ib3Var;
        this.f17242o = i11;
    }

    public wp3(String str, IOException iOException, ib3 ib3Var, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f17241n = ib3Var;
        this.f17242o = i11;
    }

    public static wp3 a(IOException iOException, ib3 ib3Var, int i10) {
        String message = iOException.getMessage();
        boolean z10 = iOException instanceof SocketTimeoutException;
        int i11 = AdError.INTERNAL_ERROR_CODE;
        if (z10) {
            i11 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && n23.a(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        }
        return i11 == 2007 ? new vo3(iOException, ib3Var) : new wp3(iOException, ib3Var, i11, i10);
    }

    private static int b(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE : i10;
    }
}
