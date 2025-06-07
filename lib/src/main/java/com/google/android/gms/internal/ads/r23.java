package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class r23 extends sz2 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f14595e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f14596f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f14597g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f14598h;

    /* renamed from: i, reason: collision with root package name */
    private long f14599i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14600j;

    public r23(Context context) {
        super(false);
        this.f14595e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) throws IOException {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uri = ib3Var.f9669a;
                this.f14596f = uri;
                h(ib3Var);
                if ("content".equals(ib3Var.f9669a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f14595e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f14595e.openAssetFileDescriptor(uri, "r");
                }
                this.f14597g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: " + String.valueOf(uri));
                    i10 = AdError.SERVER_ERROR_CODE;
                    try {
                        throw new q13(iOException, AdError.SERVER_ERROR_CODE);
                    } catch (IOException e5) {
                        e = e5;
                        if (true == (e instanceof FileNotFoundException)) {
                            i10 = 2005;
                        }
                        throw new q13(e, i10);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f14598h = fileInputStream;
                if (length != -1 && ib3Var.f9674f > length) {
                    throw new q13(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(ib3Var.f9674f + startOffset) - startOffset;
                if (jSkip != ib3Var.f9674f) {
                    throw new q13(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f14599i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f14599i = jPosition;
                        if (jPosition < 0) {
                            throw new q13(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f14599i = jPosition;
                    if (jPosition < 0) {
                        throw new q13(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long jMin = ib3Var.f9675g;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.f14599i = jMin;
                }
                this.f14600j = true;
                i(ib3Var);
                long j10 = ib3Var.f9675g;
                return j10 != -1 ? j10 : this.f14599i;
            } catch (IOException e10) {
                e = e10;
                i10 = AdError.SERVER_ERROR_CODE;
            }
        } catch (q13 e11) {
            throw e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f14596f;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        this.f14596f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f14598h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f14598h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f14597g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e5) {
                        throw new q13(e5, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f14597g = null;
                    if (this.f14600j) {
                        this.f14600j = false;
                        g();
                    }
                }
            } catch (Throwable th) {
                this.f14598h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f14597g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f14597g = null;
                        if (this.f14600j) {
                            this.f14600j = false;
                            g();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.f14597g = null;
                        if (this.f14600j) {
                            this.f14600j = false;
                            g();
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    throw new q13(e10, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e11) {
            throw new q13(e11, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14599i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e5) {
                throw new q13(e5, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.f14598h;
        int i12 = sv2.f15560a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f14599i;
        if (j11 != -1) {
            this.f14599i = j11 - i13;
        }
        w(i13);
        return i13;
    }
}
