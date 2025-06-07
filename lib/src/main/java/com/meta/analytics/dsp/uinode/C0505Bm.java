package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0505Bm implements InterfaceC1002Vr {
    public static byte[] A0G;
    public static String[] A0H = {"75NS6XWtOFaqvUAv70pmXpUOnNLqFC62", "xNyAW7YuQe6", "JhVZQGcu6MYhTGFRaY9NVeSWQV9pZEhG", "Kya4laZJ5Yz4z7ubQErhqHVe", "a5xQ9UmIIc2iWER6a0yqQZDBwnw5LxXI", "JNGHth9iM2AZaEQIUYfWNR2mTS", "R", "WvGanvqVoE"};
    public static final AtomicReference<byte[]> A0I;
    public static final Pattern A0J;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C0628Gy A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final H5 A0A;
    public final H5 A0B = new H5();
    public final HG<? super C0505Bm> A0C;
    public final I1<String> A0D;
    public final String A0E;
    public final boolean A0F;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 57);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private HttpURLConnection A04(C0628Gy c0628Gy) throws IOException {
        HttpURLConnection httpURLConnectionA05;
        URL url = new URL(c0628Gy.A04.toString());
        byte[] bArr = c0628Gy.A06;
        long j10 = c0628Gy.A03;
        long j11 = c0628Gy.A02;
        boolean zA02 = c0628Gy.A02(1);
        if (!this.A0F) {
            return A05(url, bArr, j10, j11, zA02, true);
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new NoRouteToHostException(A03(125, 20, 38) + i11);
            }
            httpURLConnectionA05 = A05(url, bArr, j10, j11, zA02, false);
            int responseCode = httpURLConnectionA05.getResponseCode();
            if (A0H[5].length() == 26) {
                A0H[3] = "FxIBfHo5MrM4KwNe65t8Xtniv5kx6";
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && (bArr != null || (responseCode != 307 && responseCode != 308))) {
                    break;
                }
                bArr = null;
                String headerField = httpURLConnectionA05.getHeaderField(A03(86, 8, 11));
                httpURLConnectionA05.disconnect();
                url = A06(url, headerField);
                i10 = i11;
            } else {
                throw new RuntimeException();
            }
        }
        return httpURLConnectionA05;
    }

    public static void A09() {
        A0G = new byte[]{3, 18, 48, 48, 54, 35, 39, 126, 22, 61, 48, 60, 55, 58, 61, 52, 49, 29, 28, 6, 23, 28, 6, 95, 62, 23, 28, 21, 6, 26, 58, 22, 23, 13, 28, 23, 13, 84, 43, 24, 23, 30, 28, 62, 31, 28, 27, 15, 22, 14, 50, 14, 14, 10, 62, 27, 14, 27, 41, 21, 15, 8, 25, 31, 117, 82, 95, 83, 82, 79, 85, 79, 72, 89, 82, 72, 28, 84, 89, 93, 88, 89, 78, 79, 28, 103, 126, 93, 81, 83, 70, 91, 93, 92, 73, 114, 107, 107, 39, 107, 104, 100, 102, 115, 110, 104, 105, 39, 117, 98, 99, 110, 117, 98, 100, 115, 26, 5, 25, 30, 110, 93, 82, 91, 89, 75, 112, 112, 63, 114, 126, 113, 102, 63, 109, 122, 123, 118, 109, 122, 124, 107, 108, 37, 63, 40, 19, 28, 31, 17, 24, 93, 9, 18, 93, 30, 18, 19, 19, 24, 30, 9, 93, 9, 18, 93, 82, 105, 98, Byte.MAX_VALUE, 119, 98, 100, 115, 98, 99, 39, 68, 104, 105, 115, 98, 105, 115, 42, 75, 98, 105, 96, 115, 111, 39, 92, 106, 81, 90, 71, 79, 90, 92, 75, 90, 91, 31, 124, 80, 81, 75, 90, 81, 75, 18, 109, 94, 81, 88, 90, 31, 100, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 119, 96, 96, 125, 96, 50, 101, 122, 123, 126, 119, 50, 118, 123, 97, 113, 125, 124, 124, 119, 113, 102, 123, 124, 117, 96, 91, 70, 64, 69, 69, 90, 71, 65, 80, 81, 21, 69, 71, 90, 65, 90, 86, 90, 89, 21, 71, 80, 81, 92, 71, 80, 86, 65, 15, 21, 74, 108, 122, 109, 50, 94, 120, 122, 113, 107, 86, 104, 21, 110, 118, 74, 81, 92, 77, 91, 8, 0, 116, 76, 3, 1, 5, 0, 116, 76, 3, 1, 7, 0, 116, 76, 3, 1, 12, 115, 104, 101, 116, 98, 44, 28, 16, 18, 81, 30, 17, 27, 13, 16, 22, 27, 81, 16, 20, 23, 11, 11, 15, 81, 22, 17, 11, 26, 13, 17, 30, 19, 81, 23, 11, 11, 15, 81, 55, 11, 11, 15, 43, 13, 30, 17, 12, 15, 16, 13, 11, 91, 60, 23, 10, 17, 20, 26, 27, 54, 17, 15, 10, 11, 44, 11, 13, 26, 30, 18, 77, 65, 67, 0, 79, 64, 74, 92, 65, 71, 74, 0, 65, 69, 70, 90, 90, 94, 0, 71, 64, 90, 75, 92, 64, 79, 66, 0, 70, 90, 90, 94, 0, 102, 90, 90, 94, 122, 92, 79, 64, 93, 94, 65, 92, 90, 10, 104, 71, 86, 75, 74, 98, 75, 64, 73, 90, 70, 103, 64, 94, 91, 90, 125, 90, 92, 75, 79, 67, 57, 37, 37, 33, 65, 93, 93, 89, 90, 98, 111, 110, 101, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 114, 124, 103, 108, 113, 121, 108, 106, 125, 108, 109, 76, 103, 109, 70, 111, 64, 103, 121, 124, 125};
    }

    static {
        A09();
        A0J = Pattern.compile(A03(300, 25, 17));
        A0I = new AtomicReference<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DefaultHttpDataSource> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I1 != com.facebook.ads.internal.exoplayer2.thirdparty.util.Predicate<java.lang.String> */
    public C0505Bm(String str, I1<String> i12, HG<? super C0505Bm> hg, int i10, int i11, boolean z10, H5 h52) {
        this.A0E = AbstractC0629Ha.A02(str);
        this.A0D = i12;
        this.A0C = hg;
        this.A08 = i10;
        this.A09 = i11;
        this.A0F = z10;
        this.A0A = h52;
    }

    private int A00(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A02;
        if (j10 != -1) {
            long bytesRemaining = j10 - this.A00;
            if (bytesRemaining == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, bytesRemaining);
        }
        int i12 = this.A05.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.A02 == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.A00 += i12;
        HG<? super C0505Bm> hg = this.A0C;
        if (hg != null) {
            hg.AB1(this, i12);
        }
        return i12;
    }

    private final long A01() {
        long j10 = this.A02;
        return j10 == -1 ? j10 : j10 - this.A00;
    }

    public static long A02(HttpURLConnection httpURLConnection) throws NumberFormatException {
        long jMax = -1;
        String headerField = httpURLConnection.getHeaderField(A03(16, 14, 75));
        boolean zIsEmpty = TextUtils.isEmpty(headerField);
        String strA03 = A03(296, 1, 50);
        String strA032 = A03(43, 21, 67);
        if (!zIsEmpty) {
            try {
                jMax = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(strA032, A03(166, 27, 62) + headerField + strA03);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A03(30, 13, 64));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0J.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long j10 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (jMax < 0) {
                        return j10;
                    }
                    if (jMax != j10) {
                        Log.w(strA032, A03(64, 22, 5) + headerField + A03(297, 3, 12) + headerField2 + strA03);
                        jMax = Math.max(jMax, j10);
                        return jMax;
                    }
                    return jMax;
                } catch (NumberFormatException unused2) {
                    Log.e(strA032, A03(193, 26, 6) + headerField2 + strA03);
                    return jMax;
                }
            }
            return jMax;
        }
        return jMax;
    }

    private HttpURLConnection A05(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.A08);
        httpURLConnection.setReadTimeout(this.A09);
        H5 h52 = this.A0A;
        if (h52 != null) {
            for (Map.Entry<String, String> entry : h52.A00().entrySet()) {
                if (A0H[5].length() != 26) {
                    throw new RuntimeException();
                }
                A0H[2] = "kwRG9UknWr0Wgg7Rclu7tRHvEyTV8TJk";
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.A0B.A00().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = A03(325, 6, 40) + j10 + A03(0, 1, 23);
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnection.setRequestProperty(A03(120, 5, 5), str);
        }
        httpURLConnection.setRequestProperty(A03(286, 10, 38), this.A0E);
        if (!z10) {
            httpURLConnection.setRequestProperty(A03(1, 15, 106), A03(474, 8, 50));
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod(A03(116, 4, 115));
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public static URL A06(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!A03(469, 5, 16).equals(protocol)) {
                if (A0H[5].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[0] = "w50J2iwlOiToEn9H8bpLD3B1mxiX4OkW";
                strArr[4] = "U5WpLDBGoG2FZlKlieC8pMIdD1ZiOapt";
                if (!A03(465, 4, 104).equals(protocol)) {
                    String protocol2 = A03(255, 31, 12) + protocol;
                    throw new ProtocolException(protocol2);
                }
            }
            return url2;
        }
        throw new ProtocolException(A03(94, 22, 62));
    }

    private void A07() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e5) {
                Log.e(A03(43, 21, 67), A03(219, 36, 43), e5);
            }
            this.A06 = null;
        }
    }

    private void A08() throws IOException {
        if (this.A01 == this.A03) {
            return;
        }
        byte[] andSet = A0I.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.A01;
            long j11 = this.A03;
            if (j10 != j11) {
                int readLength = (int) Math.min(j11 - j10, andSet.length);
                int i10 = this.A05.read(andSet, 0, readLength);
                if (!Thread.currentThread().isInterrupted()) {
                    if (i10 != -1) {
                        this.A01 += i10;
                        HG<? super C0505Bm> hg = this.A0C;
                        if (hg != null) {
                            hg.AB1(this, i10);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new InterruptedIOException();
                }
            } else {
                A0I.set(andSet);
                return;
            }
        }
    }

    public static void A0A(HttpURLConnection httpURLConnection, long j10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (IF.A02 != 19) {
            int i10 = IF.A02;
            String[] strArr = A0H;
            if (strArr[6].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0H[5] = "h9vUSf3vBaluOAcyH2LsyeRcof";
            if (i10 != 20) {
                return;
            }
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if (A03(331, 65, 70).equals(name) || A03(396, 69, 23).equals(name)) {
                Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod(A03(482, 20, 48), new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final Uri A8E() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final long ADl(C0628Gy c0628Gy) throws IOException, NumberFormatException {
        String strA03 = A03(145, 21, 68);
        this.A04 = c0628Gy;
        long j10 = 0;
        this.A00 = 0L;
        this.A01 = 0L;
        try {
            HttpURLConnection httpURLConnectionA04 = A04(c0628Gy);
            this.A06 = httpURLConnectionA04;
            try {
                int responseCode = httpURLConnectionA04.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = this.A06.getHeaderFields();
                    A07();
                    C1003Vs exception = new C1003Vs(responseCode, headerFields, c0628Gy);
                    if (responseCode == 416) {
                        exception.initCause(new C0625Gv(0));
                        throw exception;
                    }
                    throw exception;
                }
                String contentType = this.A06.getContentType();
                I1<String> i12 = this.A0D;
                if (i12 == null || i12.A5b(contentType)) {
                    if (responseCode == 200 && c0628Gy.A03 != 0) {
                        j10 = c0628Gy.A03;
                    }
                    this.A03 = j10;
                    if (c0628Gy.A02(1)) {
                        long j11 = c0628Gy.A02;
                        String[] strArr = A0H;
                        String str = strArr[6];
                        String str2 = strArr[1];
                        int length = str.length();
                        int responseCode2 = str2.length();
                        if (length == responseCode2) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0H;
                        strArr2[0] = "g5QduXiMfcr3WVIXoNOmeCAyNU6k9qpH";
                        strArr2[4] = "C5YWXMFtOzaHxpxnw5jthW3Xp7pagYAJ";
                        this.A02 = j11;
                    } else {
                        if (c0628Gy.A02 != -1) {
                            this.A02 = c0628Gy.A02;
                        } else {
                            long jA02 = A02(this.A06);
                            this.A02 = jA02 != -1 ? jA02 - this.A03 : -1L;
                        }
                    }
                    try {
                        this.A05 = this.A06.getInputStream();
                        this.A07 = true;
                        HG<? super C0505Bm> hg = this.A0C;
                        if (hg != null) {
                            hg.ADP(this, c0628Gy);
                        }
                        return this.A02;
                    } catch (IOException e5) {
                        A07();
                        throw new H4(e5, c0628Gy, 1);
                    }
                }
                A07();
                throw new C1004Vt(contentType, c0628Gy);
            } catch (IOException e10) {
                A07();
                throw new H4(strA03 + c0628Gy.A04.toString(), e10, c0628Gy, 1);
            }
        } catch (IOException e11) {
            throw new H4(strA03 + c0628Gy.A04.toString(), e11, c0628Gy, 1);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final void close() throws H4 {
        try {
            if (this.A05 != null) {
                A0A(this.A06, A01());
                try {
                    this.A05.close();
                } catch (IOException e5) {
                    throw new H4(e5, this.A04, 3);
                }
            }
        } finally {
            this.A05 = null;
            A07();
            if (this.A07) {
                this.A07 = false;
                HG<? super C0505Bm> hg = this.A0C;
                if (hg != null) {
                    hg.ADO(this);
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            A08();
            return A00(bArr, i10, i11);
        } catch (IOException e5) {
            throw new H4(e5, this.A04, 2);
        }
    }
}
