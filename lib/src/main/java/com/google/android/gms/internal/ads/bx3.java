package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class bx3 extends sz2 {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f6701e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6702f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f6703g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f6704h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f6705i;

    /* renamed from: j, reason: collision with root package name */
    private long f6706j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6707k;

    public bx3(Context context) {
        super(false);
        this.f6701e = context.getResources();
        this.f6702f = context.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.t53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.ib3 r16) throws com.google.android.gms.internal.ads.t63, android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bx3.a(com.google.android.gms.internal.ads.ib3):long");
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f6703g;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        this.f6703g = null;
        try {
            try {
                InputStream inputStream = this.f6705i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f6705i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f6704h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e5) {
                        throw new bw3(null, e5, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f6704h = null;
                    if (this.f6707k) {
                        this.f6707k = false;
                        g();
                    }
                }
            } catch (Throwable th) {
                this.f6705i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f6704h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f6704h = null;
                        if (this.f6707k) {
                            this.f6707k = false;
                            g();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.f6704h = null;
                        if (this.f6707k) {
                            this.f6707k = false;
                            g();
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    throw new bw3(null, e10, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e11) {
            throw new bw3(null, e11, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f6706j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e5) {
                throw new bw3(null, e5, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.f6705i;
        int i12 = sv2.f15560a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f6706j == -1) {
                return -1;
            }
            throw new bw3("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j11 = this.f6706j;
        if (j11 != -1) {
            this.f6706j = j11 - i13;
        }
        w(i13);
        return i13;
    }
}
