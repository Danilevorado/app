package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class uk extends pk {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f16371c;

    @Override // com.google.android.gms.internal.ads.pk
    public final byte[] b(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i10 = 4;
        if (length == 1) {
            int iA = tk.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int iA2 = tk.a(strArrSplit[i11]);
                    int i12 = (iA2 >> 16) ^ ((char) iA2);
                    byte[] bArr2 = {(byte) i12, (byte) (i12 >> 8)};
                    int i13 = i11 + i11;
                    bArr[i13] = bArr2[0];
                    bArr[i13 + 1] = bArr2[1];
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                    int iA3 = tk.a(strArrSplit[i14]);
                    bArr[i14] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f16371c = a();
        synchronized (this.f13921a) {
            MessageDigest messageDigest = this.f16371c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f16371c.update(bArrArray);
            byte[] bArrDigest = this.f16371c.digest();
            int length2 = bArrDigest.length;
            if (length2 <= 4) {
                i10 = length2;
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArrDigest, 0, bArr3, 0, i10);
            return bArr3;
        }
    }
}
