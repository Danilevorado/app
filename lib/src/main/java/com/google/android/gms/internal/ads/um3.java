package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes.dex */
public final class um3 extends sz2 {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f16401e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f16402f;

    /* renamed from: g, reason: collision with root package name */
    private long f16403g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16404h;

    public um3() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) throws IOException {
        Uri uri = ib3Var.f9669a;
        this.f16402f = uri;
        h(ib3Var);
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f16401e = randomAccessFile;
            try {
                randomAccessFile.seek(ib3Var.f9674f);
                long length = ib3Var.f9675g;
                if (length == -1) {
                    length = this.f16401e.length() - ib3Var.f9674f;
                }
                this.f16403g = length;
                if (length < 0) {
                    throw new tl3(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                this.f16404h = true;
                i(ib3Var);
                return this.f16403g;
            } catch (IOException e5) {
                throw new tl3(e5, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new tl3(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
            }
            if (sv2.f15560a < 21 || !sk3.b(e10.getCause())) {
                i10 = 2005;
            }
            throw new tl3(e10, i10);
        } catch (SecurityException e11) {
            throw new tl3(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new tl3(e12, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f16402f;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        this.f16402f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f16401e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f16401e = null;
                if (this.f16404h) {
                    this.f16404h = false;
                    g();
                }
            } catch (IOException e5) {
                throw new tl3(e5, AdError.SERVER_ERROR_CODE);
            }
        } catch (Throwable th) {
            this.f16401e = null;
            if (this.f16404h) {
                this.f16404h = false;
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
        long j10 = this.f16403g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f16401e;
            int i12 = sv2.f15560a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f16403g -= i13;
                w(i13);
            }
            return i13;
        } catch (IOException e5) {
            throw new tl3(e5, AdError.SERVER_ERROR_CODE);
        }
    }
}
