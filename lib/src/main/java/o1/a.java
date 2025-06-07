package o1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Arrays;
import java.util.Hashtable;
import r6.c;
import r6.e;
import r6.i;
import r6.j;
import r6.k;
import s6.g;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f25697a;

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 > i11 && i16 / i14 > i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    public static k b(byte[] bArr, int i10, int i11) {
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(e.CHARACTER_SET, "utf-8");
            hashtable.put(e.TRY_HARDER, Boolean.TRUE);
            hashtable.put(e.POSSIBLE_FORMATS, r6.a.QR_CODE);
            return new v6.a().a(new c(new g(new i(bArr, i10, i11, 0, 0, i10, i11, false))), hashtable);
        } catch (j unused) {
            return null;
        }
    }

    public static Bitmap c(String str, int i10, int i11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = a(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    private static void d(byte[] bArr, int[] iArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            while (i16 < i10) {
                int i17 = (iArr[i14] & 16711680) >> 16;
                int i18 = (iArr[i14] & 65280) >> 8;
                int i19 = iArr[i14] & 255;
                i14++;
                int i20 = (((((i17 * 66) + (i18 * 129)) + (i19 * 25)) + 128) >> 8) + 16;
                int i21 = (((((i17 * (-38)) - (i18 * 74)) + (i19 * 112)) + 128) >> 8) + 128;
                int i22 = (((((i17 * 112) - (i18 * 94)) - (i19 * 18)) + 128) >> 8) + 128;
                int iMax = Math.max(0, Math.min(i20, 255));
                int iMax2 = Math.max(0, Math.min(i21, 255));
                int iMax3 = Math.max(0, Math.min(i22, 255));
                int i23 = i13 + 1;
                bArr[i13] = (byte) iMax;
                if (i15 % 2 == 0 && i16 % 2 == 0) {
                    int i24 = i12 + 1;
                    bArr[i12] = (byte) iMax3;
                    i12 = i24 + 1;
                    bArr[i24] = (byte) iMax2;
                }
                i16++;
                i13 = i23;
            }
        }
    }

    public static byte[] e(int i10, int i11, Bitmap bitmap) {
        int[] iArr = new int[i10 * i11];
        bitmap.getPixels(iArr, 0, i10, 0, 0, i10, i11);
        int i12 = (((i10 % 2 == 0 ? i10 : i10 + 1) * (i11 % 2 == 0 ? i11 : i11 + 1)) * 3) / 2;
        byte[] bArr = f25697a;
        if (bArr == null || bArr.length < i12) {
            f25697a = new byte[i12];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        d(f25697a, iArr, i10, i11);
        bitmap.recycle();
        return f25697a;
    }
}
