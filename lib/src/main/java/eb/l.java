package eb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class l {
    private byte[] c(int i10) {
        return new byte[]{(byte) ((i10 >>> 24) & 255), (byte) ((i10 >>> 16) & 255), (byte) ((i10 >>> 8) & 255), (byte) (i10 & 255)};
    }

    private int e(byte[] bArr) {
        return (bArr[3] & 255) + ((bArr[2] & 255) << 8) + ((bArr[1] & 255) << 16) + (bArr[0] << 24);
    }

    public Set a(byte[] bArr) {
        byte b10 = bArr[0];
        int i10 = 1;
        if (b10 != -1) {
            throw new ClassCastException(String.format("Set<String> cannot be deserialized in '%s' flag type", Byte.valueOf(b10)));
        }
        HashSet hashSet = new HashSet();
        while (i10 < bArr.length) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, i10, bArr2, 0, 4);
            int iE = e(bArr2);
            byte[] bArr3 = new byte[iE];
            for (int i11 = 0; i11 < iE; i11++) {
                bArr3[i11] = bArr[i10 + i11 + 4];
            }
            hashSet.add(new String(bArr3));
            i10 += 4 + iE;
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public boolean b(byte b10) {
        return b10 == -1;
    }

    public byte[] d(Set set) {
        int size = set.size();
        byte[][] bArr = new byte[size][];
        Iterator it = set.iterator();
        int length = 1;
        int i10 = 1;
        int i11 = 0;
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes();
            byte[] bArrC = c(bytes.length);
            int length2 = bytes.length + bArrC.length;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(bArrC, 0, bArr2, 0, bArrC.length);
            System.arraycopy(bytes, 0, bArr2, bArrC.length, bytes.length);
            bArr[i11] = bArr2;
            i10 += length2;
            i11++;
        }
        byte[] bArr3 = new byte[i10];
        bArr3[0] = -1;
        for (int i12 = 0; i12 < size; i12++) {
            byte[] bArr4 = bArr[i12];
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }
}
