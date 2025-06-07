package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class jj0 extends sz2 implements zt3 {

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f10521u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicReference f10522v = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final SSLSocketFactory f10523e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10524f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10525g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10526h;

    /* renamed from: i, reason: collision with root package name */
    private final ys3 f10527i;

    /* renamed from: j, reason: collision with root package name */
    private ib3 f10528j;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f10529k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f10530l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10531m;

    /* renamed from: n, reason: collision with root package name */
    private int f10532n;

    /* renamed from: o, reason: collision with root package name */
    private long f10533o;

    /* renamed from: p, reason: collision with root package name */
    private long f10534p;

    /* renamed from: q, reason: collision with root package name */
    private long f10535q;

    /* renamed from: r, reason: collision with root package name */
    private long f10536r;

    /* renamed from: s, reason: collision with root package name */
    private int f10537s;

    /* renamed from: t, reason: collision with root package name */
    private final Set f10538t;

    jj0(String str, wy3 wy3Var, int i10, int i11, int i12) {
        super(true);
        this.f10523e = new ij0(this);
        this.f10538t = new HashSet();
        gt1.c(str);
        this.f10526h = str;
        this.f10527i = new ys3();
        this.f10524f = i10;
        this.f10525g = i11;
        this.f10537s = i12;
        if (wy3Var != null) {
            b(wy3Var);
        }
    }

    private final void n() {
        HttpURLConnection httpURLConnection = this.f10529k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e5) {
                ze0.e("Unexpected error while disconnecting", e5);
            }
            this.f10529k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: IOException -> 0x0289, TryCatch #0 {IOException -> 0x0289, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:93:0x022e, B:95:0x0239, B:97:0x024a, B:100:0x0253, B:101:0x0262, B:103:0x026a, B:104:0x0271, B:105:0x0272, B:106:0x0288), top: B:110:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0239 A[Catch: IOException -> 0x0289, TryCatch #0 {IOException -> 0x0289, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:93:0x022e, B:95:0x0239, B:97:0x024a, B:100:0x0253, B:101:0x0262, B:103:0x026a, B:104:0x0271, B:105:0x0272, B:106:0x0288), top: B:110:0x000e }] */
    @Override // com.google.android.gms.internal.ads.t53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.ib3 r21) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jj0.a(com.google.android.gms.internal.ads.ib3):long");
    }

    @Override // com.google.android.gms.internal.ads.sz2, com.google.android.gms.internal.ads.t53, com.google.android.gms.internal.ads.zt3
    public final Map c() {
        HttpURLConnection httpURLConnection = this.f10529k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.f10529k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[Catch: Exception -> 0x0067, all -> 0x008d, TRY_LEAVE, TryCatch #0 {Exception -> 0x0067, blocks: (B:15:0x001f, B:17:0x0027, B:23:0x0036, B:25:0x0046, B:27:0x004e), top: B:45:0x001f }] */
    @Override // com.google.android.gms.internal.ads.t53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f10530l     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L79
            java.net.HttpURLConnection r2 = r9.f10529k     // Catch: java.lang.Throwable -> L8d
            long r3 = r9.f10534p     // Catch: java.lang.Throwable -> L8d
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.f10536r     // Catch: java.lang.Throwable -> L8d
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.sv2.f15560a     // Catch: java.lang.Throwable -> L8d
            r8 = 19
            if (r7 == r8) goto L1f
            r8 = 20
            if (r7 == r8) goto L1f
            goto L67
        L1f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L2f
            int r3 = r2.read()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            r4 = -1
            if (r3 == r4) goto L67
            goto L36
        L2f:
            r5 = 2048(0x800, double:1.012E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L36
            goto L67
        L36:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            if (r4 != 0) goto L4e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            if (r3 == 0) goto L67
        L4e:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L67 java.lang.Throwable -> L8d
        L67:
            java.io.InputStream r2 = r9.f10530l     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L8d
            r2.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L8d
            goto L79
        L6d:
            r2 = move-exception
            com.google.android.gms.internal.ads.wp3 r3 = new com.google.android.gms.internal.ads.wp3     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.ib3 r4 = r9.f10528j     // Catch: java.lang.Throwable -> L8d
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L8d
            throw r3     // Catch: java.lang.Throwable -> L8d
        L79:
            r9.f10530l = r0
            r9.n()
            boolean r0 = r9.f10531m
            if (r0 == 0) goto L87
            r9.f10531m = r1
            r9.g()
        L87:
            java.util.Set r0 = r9.f10538t
            r0.clear()
            return
        L8d:
            r2 = move-exception
            r9.f10530l = r0
            r9.n()
            boolean r0 = r9.f10531m
            if (r0 == 0) goto L9c
            r9.f10531m = r1
            r9.g()
        L9c:
            java.util.Set r0 = r9.f10538t
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jj0.f():void");
    }

    final void m(int i10) throws SocketException {
        this.f10537s = i10;
        for (Socket socket : this.f10538t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f10537s);
                } catch (SocketException e5) {
                    ze0.h("Failed to update receive buffer size.", e5);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: IOException -> 0x008e, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: IOException -> 0x008e, TRY_LEAVE, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.bh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int z(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r8.f10535q     // Catch: java.io.IOException -> L8e
            long r2 = r8.f10533o     // Catch: java.io.IOException -> L8e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = -1
            if (r0 != 0) goto Lb
            goto L53
        Lb:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.ads.jj0.f10522v     // Catch: java.io.IOException -> L8e
            r3 = 0
            java.lang.Object r0 = r0.getAndSet(r3)     // Catch: java.io.IOException -> L8e
            byte[] r0 = (byte[]) r0     // Catch: java.io.IOException -> L8e
            if (r0 != 0) goto L1a
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L8e
        L1a:
            long r3 = r8.f10535q     // Catch: java.io.IOException -> L8e
            long r5 = r8.f10533o     // Catch: java.io.IOException -> L8e
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L4e
            int r7 = r0.length     // Catch: java.io.IOException -> L8e
            long r5 = r5 - r3
            long r3 = (long) r7     // Catch: java.io.IOException -> L8e
            long r3 = java.lang.Math.min(r5, r3)     // Catch: java.io.IOException -> L8e
            int r3 = (int) r3     // Catch: java.io.IOException -> L8e
            java.io.InputStream r4 = r8.f10530l     // Catch: java.io.IOException -> L8e
            int r3 = r4.read(r0, r1, r3)     // Catch: java.io.IOException -> L8e
            boolean r4 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L8e
            if (r4 != 0) goto L48
            if (r3 == r2) goto L42
            long r4 = r8.f10535q     // Catch: java.io.IOException -> L8e
            long r6 = (long) r3     // Catch: java.io.IOException -> L8e
            long r4 = r4 + r6
            r8.f10535q = r4     // Catch: java.io.IOException -> L8e
            r8.w(r3)     // Catch: java.io.IOException -> L8e
            goto L1a
        L42:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L48:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L4e:
            java.util.concurrent.atomic.AtomicReference r3 = com.google.android.gms.internal.ads.jj0.f10522v     // Catch: java.io.IOException -> L8e
            r3.set(r0)     // Catch: java.io.IOException -> L8e
        L53:
            if (r11 != 0) goto L56
            goto L8d
        L56:
            long r0 = r8.f10534p     // Catch: java.io.IOException -> L8e
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L6f
            long r5 = r8.f10536r     // Catch: java.io.IOException -> L8e
            long r0 = r0 - r5
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L69
        L67:
            r1 = r2
            goto L8d
        L69:
            long r5 = (long) r11     // Catch: java.io.IOException -> L8e
            long r0 = java.lang.Math.min(r5, r0)     // Catch: java.io.IOException -> L8e
            int r11 = (int) r0     // Catch: java.io.IOException -> L8e
        L6f:
            java.io.InputStream r0 = r8.f10530l     // Catch: java.io.IOException -> L8e
            int r1 = r0.read(r9, r10, r11)     // Catch: java.io.IOException -> L8e
            if (r1 != r2) goto L84
            long r9 = r8.f10534p     // Catch: java.io.IOException -> L8e
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L7e
            goto L67
        L7e:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L84:
            long r9 = r8.f10536r     // Catch: java.io.IOException -> L8e
            long r2 = (long) r1     // Catch: java.io.IOException -> L8e
            long r9 = r9 + r2
            r8.f10536r = r9     // Catch: java.io.IOException -> L8e
            r8.w(r1)     // Catch: java.io.IOException -> L8e
        L8d:
            return r1
        L8e:
            r9 = move-exception
            com.google.android.gms.internal.ads.wp3 r10 = new com.google.android.gms.internal.ads.wp3
            com.google.android.gms.internal.ads.ib3 r11 = r8.f10528j
            r0 = 2000(0x7d0, float:2.803E-42)
            r1 = 2
            r10.<init>(r9, r11, r0, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jj0.z(byte[], int, int):int");
    }
}
