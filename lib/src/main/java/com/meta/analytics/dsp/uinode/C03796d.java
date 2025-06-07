package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03796d {
    public static byte[] A02;
    public static String[] A03 = {"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    public static final String A04;
    public static volatile C03796d A05;
    public final C1072Ym A00;
    public final Map<String, C03766a> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(C04017f c04017f, C03766a c03766a, String str) throws Throwable {
        Bitmap bitmapA01;
        String str2 = c03766a.A07;
        int i10 = c03766a.A03;
        int i11 = c03766a.A04;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IOException e5 = null;
        String strA08 = A08(223, 9, 70);
        boolean zStartsWith = str2.startsWith(strA08);
        String strA082 = A08(239, 22, 123);
        if (zStartsWith || str2.startsWith(strA082)) {
            String strSubstring = str2.startsWith(strA08) ? str2.substring(strA08.length()) : str2.substring(strA082.length());
            InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = this.A00.getAssets().open(strSubstring);
                    if (A0C(i10, i11)) {
                        try {
                            bitmapA01 = AbstractC03836h.A01(inputStreamOpen, i10, i11);
                        } catch (IOException e10) {
                            e = e10;
                            A0B(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (OutOfMemoryError e11) {
                            e = e11;
                            A0B(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            throw th;
                        }
                    } else {
                        bitmapA01 = BitmapFactory.decodeStream(inputStreamOpen);
                    }
                    if (inputStreamOpen != null) {
                        A0A(inputStreamOpen);
                    }
                } catch (IOException e12) {
                    e = e12;
                } catch (OutOfMemoryError e13) {
                    e = e13;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            boolean zA0C = A0C(i10, i11);
            if (A03[2].length() == 5) {
                throw new RuntimeException();
            }
            A03[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
            if (zA0C) {
                try {
                    bitmapA01 = A05(str2, i10, i11);
                } catch (IOException e14) {
                    e5 = e14;
                    A0B(e5);
                    bitmapA01 = A03(str2);
                }
            } else {
                bitmapA01 = A03(str2);
            }
        }
        String string = e5 != null ? e5.toString() : null;
        if (bitmapA01 == null) {
            C03816f.A03(c04017f, c03766a, str, C03816f.A03, string, null, null);
            return null;
        }
        long jA00 = A00(str2, bitmapA01);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jA00 > 0) {
            C03816f.A03(c04017f, c03766a, str, C03816f.A02, string, Long.valueOf(jA00), Long.valueOf(jCurrentTimeMillis2));
            return bitmapA01;
        }
        C03816f.A03(c04017f, c03766a, str, C03816f.A01, string, null, null);
        if (C0662Ih.A0t(c04017f)) {
            return null;
        }
        return bitmapA01;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, 26, 49, 44, 53, 57, 40, 120, 43, 49, 34, 61, 120, 61, 32, 59, 61, 61, 60, 43, 120, 53, 57, 32, 120, 43, 49, 34, 61, 120, 62, 55, 42, 120, 43, 44, 55, 42, 57, 63, 61, 98, 120, 103, 69, 71, 76, 65, 4, 65, 86, 86, 75, 86, 10, 4, 102, 77, 80, 73, 69, 84, 4, 77, 87, 4, 74, 81, 72, 72, 10, 57, 30, 22, 19, 26, 27, 95, 11, 16, 95, 28, 16, 15, 6, 95, 19, 16, 28, 30, 19, 95, 22, 18, 30, 24, 26, 95, 22, 17, 11, 16, 95, 28, 30, 28, 23, 26, 95, 87, 10, 13, 19, 66, 53, 14, 1, 2, 12, 5, 64, 20, 15, 64, 23, 18, 9, 20, 5, 64, 2, 9, 20, 13, 1, 16, 64, 20, 15, 64, 6, 9, 12, 5, 64, 72, 21, 18, 12, 93, 80, 107, 100, 103, 105, 96, 37, 113, 106, 37, 114, 119, 108, 113, 96, 37, 103, 108, 113, 104, 100, 117, 37, 113, 106, 37, 106, 112, 113, 117, 112, 113, 37, 118, 113, 119, 96, 100, 104, 126, 108, 108, 122, 107, 37, 48, 48, 48, 63, 48, 53, 60, 99, 118, 118, 68, 75, 78, 71, 24, 13, 13, 13, 67, 76, 70, 80, 77, 75, 70, 125, 67, 81, 81, 71, 86, 13, 27, 31, 19, 21, 23, 0, 3, 13, 8, 77, 86, 83, 86, 87, 79, 86};
    }

    static {
        A09();
        A04 = C03796d.class.getSimpleName();
    }

    public C03796d(C1072Ym c1072Ym) {
        this.A00 = c1072Ym;
    }

    private int A00(String str, Bitmap bitmap) throws IOException {
        String strA08 = A08(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int size = byteArrayOutputStream.size();
            if (size >= C0662Ih.A0F(this.A00)) {
                A0B(new Throwable(A08(35, 42, 1) + size));
                return 0;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            A0A(byteArrayOutputStream);
            if (A03[7].charAt(22) != 'z') {
                throw new RuntimeException();
            }
            A03[4] = "r6vsbyQxsbBUkJdqjFKv7NMRisOUwCFh";
            A0A(fileOutputStream);
            return size;
        } catch (OutOfMemoryError e5) {
            A0B(e5);
            Log.e(A04, A08(184, 39, 92), e5);
            return 0;
        } catch (FileNotFoundException e10) {
            Log.e(A04, A08(6, 29, 95) + file.getPath() + strA08, e10);
            A0B(e10);
            return 0;
        } catch (IOException e11) {
            A0B(e11);
            Log.e(A04, A08(148, 36, 57) + str + strA08, e11);
            return 0;
        } finally {
            A0A(byteArrayOutputStream);
            A0A(null);
        }
    }

    private final Bitmap A01(C04017f c04017f, C03766a c03766a, int i10, int i11, String str) throws IOException {
        if (C03816f.A06(c04017f) && A08(266, 4, 53).equals(str)) {
            Map<String, C03766a> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            A03[1] = "FHlvPh";
            map.put(c03766a.A07, c03766a);
        }
        String str2 = c03766a.A07;
        C03806e c03806e = new C03806e(c03766a.A05, c03766a.A06, A08(261, 5, 43), str, str2);
        File fileA07 = A07(this.A00);
        StringBuilder sbAppend = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 85);
        File file = new File(fileA07, sbAppend.append(url).toString());
        if (!file.exists()) {
            C03816f.A04(c04017f, c03806e, false);
            String url2 = A08(232, 7, 0);
            if (str2.startsWith(url2)) {
                String url3 = A08(239, 22, 123);
                if (!str2.startsWith(url3)) {
                    return A04(str2, i11, i10);
                }
            }
            return A02(c04017f, c03766a, str);
        }
        C03816f.A04(c04017f, c03806e, true);
        try {
            if (A0C(i11, i10)) {
                return AbstractC03836h.A02(file.getCanonicalPath(), i11, i10, this.A00);
            }
            String url4 = file.getCanonicalPath();
            return BitmapFactory.decodeFile(url4);
        } catch (IOException e5) {
            A0B(e5);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] bytes;
        RJ rjADy = C0884Rc.A00(this.A00).ADy(str, new RY());
        if (rjADy != null && (bytes = rjADy.A68()) != null) {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        return null;
    }

    private Bitmap A04(String str, int i10, int i11) {
        Bitmap bitmapDecodeStream;
        int iA00;
        try {
            boolean zA0C = A0C(i10, i11);
            String strA08 = A08(232, 7, 0);
            if (zA0C) {
                bitmapDecodeStream = AbstractC03836h.A02(str.substring(strA08.length()), i10, i11, this.A00);
            } else {
                bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(strA08.length())), null, null);
            }
            iA00 = A00(str, bitmapDecodeStream);
        } catch (IOException e5) {
            Log.e(A04, A08(105, 43, 38) + str + A08(0, 2, 17), e5);
        }
        if (C0662Ih.A0t(this.A00) && iA00 <= 0) {
            return null;
        }
        return bitmapDecodeStream;
    }

    private Bitmap A05(String str, int i10, int i11) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap bitmapA01 = AbstractC03836h.A01(inputStream, i10, i11);
        A0A(inputStream);
        return bitmapA01;
    }

    public static C03796d A06(C1072Ym c1072Ym) {
        if (A05 == null) {
            synchronized (C03796d.class) {
                if (A05 == null) {
                    A05 = new C03796d(c1072Ym);
                }
            }
        }
        return A05;
    }

    public static File A07(C04017f c04017f) {
        return c04017f.getCacheDir();
    }

    public static void A0A(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(Throwable th) {
        String strA08 = A08(261, 5, 43);
        if (th != null) {
            this.A00.A07().A9a(strA08, C8A.A1f, new C8B(th));
        } else {
            this.A00.A07().A9a(strA08, C8A.A1f, new C8B(A08(77, 28, 125)));
        }
    }

    private boolean A0C(int i10, int i11) {
        return i10 > 0 && i11 > 0 && C0662Ih.A1A(this.A00);
    }

    public final Bitmap A0D(C03766a c03766a) {
        return A01(this.A00, c03766a, c03766a.A04, c03766a.A03, c03766a.A01);
    }

    public final Bitmap A0E(C04017f c04017f, String str, int i10, int i11, String str2) {
        C03766a c03766a = this.A01.get(str);
        return (!C03816f.A06(c04017f) || c03766a == null) ? A01(c04017f, new C03766a(str, i10, i11, A08(270, 7, 97), A08(270, 7, 97)), i11, i10, str2) : A01(c04017f, c03766a, i11, i10, str2);
    }

    public final File A0F(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0G(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}
