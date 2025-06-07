package z7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* loaded from: classes2.dex */
public abstract class g {
    public static Object a(String str, Class... clsArr) throws IOException {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            c8.c cVar = new c8.c(new ByteArrayInputStream(d(str)));
            cVar.a(clsArr);
            return cVar.readObject();
        } catch (Exception e5) {
            throw new IOException("Deserialization error: " + e5.getMessage(), e5);
        }
    }

    public static String b(Object obj) throws IOException {
        if (obj == null) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            return c(byteArrayOutputStream.toByteArray());
        } catch (Exception e5) {
            throw new IOException("Serialization error: " + e5.getMessage(), e5);
        }
    }

    private static String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append((char) (((bArr[i10] >> 4) & 15) + 97));
            sb2.append((char) ((bArr[i10] & 15) + 97));
        }
        return sb2.toString();
    }

    private static byte[] d(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i10 = 0; i10 < str.length(); i10 += 2) {
            int i11 = i10 / 2;
            bArr[i11] = (byte) ((str.charAt(i10) - 'a') << 4);
            bArr[i11] = (byte) (bArr[i11] + (str.charAt(i10 + 1) - 'a'));
        }
        return bArr;
    }
}
