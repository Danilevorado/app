package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uy2 extends sz2 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f16496e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f16497f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f16498g;

    /* renamed from: h, reason: collision with root package name */
    private long f16499h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16500i;

    public uy2(Context context) {
        super(false);
        this.f16496e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) throws IOException {
        try {
            Uri uri = ib3Var.f9669a;
            this.f16497f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h(ib3Var);
            InputStream inputStreamOpen = this.f16496e.open(path, 1);
            this.f16498g = inputStreamOpen;
            if (inputStreamOpen.skip(ib3Var.f9674f) < ib3Var.f9674f) {
                throw new tx2(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j10 = ib3Var.f9675g;
            if (j10 != -1) {
                this.f16499h = j10;
            } else {
                long jAvailable = this.f16498g.available();
                this.f16499h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f16499h = -1L;
                }
            }
            this.f16500i = true;
            i(ib3Var);
            return this.f16499h;
        } catch (tx2 e5) {
            throw e5;
        } catch (IOException e10) {
            throw new tx2(e10, true != (e10 instanceof FileNotFoundException) ? AdError.SERVER_ERROR_CODE : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f16497f;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        this.f16497f = null;
        try {
            try {
                InputStream inputStream = this.f16498g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f16498g = null;
                if (this.f16500i) {
                    this.f16500i = false;
                    g();
                }
            } catch (IOException e5) {
                throw new tx2(e5, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f16498g = null;
            if (this.f16500i) {
                this.f16500i = false;
                g();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f16499h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e5) {
                throw new tx2(e5, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.f16498g;
        int i12 = sv2.f15560a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f16499h;
        if (j11 != -1) {
            this.f16499h = j11 - i13;
        }
        w(i13);
        return i13;
    }
}
