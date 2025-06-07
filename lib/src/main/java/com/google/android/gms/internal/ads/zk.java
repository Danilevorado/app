package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class zk extends pk {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f18610c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18611d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18612e;

    public zk(int i10) {
        int i11 = i10 >> 3;
        this.f18611d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f18612e = i10;
    }

    @Override // com.google.android.gms.internal.ads.pk
    public final byte[] b(String str) {
        synchronized (this.f13921a) {
            MessageDigest messageDigestA = a();
            this.f18610c = messageDigestA;
            if (messageDigestA == null) {
                return new byte[0];
            }
            messageDigestA.reset();
            this.f18610c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] bArrDigest = this.f18610c.digest();
            int length = bArrDigest.length;
            int i10 = this.f18611d;
            if (length > i10) {
                length = i10;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if ((this.f18612e & 7) > 0) {
                long j10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (i11 > 0) {
                        j10 <<= 8;
                    }
                    j10 += bArr[i11] & 255;
                }
                long j11 = j10 >>> (8 - (this.f18612e & 7));
                int i12 = this.f18611d;
                while (true) {
                    i12--;
                    if (i12 < 0) {
                        break;
                    }
                    bArr[i12] = (byte) (255 & j11);
                    j11 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
