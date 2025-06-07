package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class dk0 extends sz2 implements zt3 {

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f7362v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e, reason: collision with root package name */
    private final int f7363e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7364f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7365g;

    /* renamed from: h, reason: collision with root package name */
    private final ys3 f7366h;

    /* renamed from: i, reason: collision with root package name */
    private ib3 f7367i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f7368j;

    /* renamed from: k, reason: collision with root package name */
    private final Queue f7369k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f7370l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7371m;

    /* renamed from: n, reason: collision with root package name */
    private int f7372n;

    /* renamed from: o, reason: collision with root package name */
    private long f7373o;

    /* renamed from: p, reason: collision with root package name */
    private long f7374p;

    /* renamed from: q, reason: collision with root package name */
    private long f7375q;

    /* renamed from: r, reason: collision with root package name */
    private long f7376r;

    /* renamed from: s, reason: collision with root package name */
    private long f7377s;

    /* renamed from: t, reason: collision with root package name */
    private final long f7378t;

    /* renamed from: u, reason: collision with root package name */
    private final long f7379u;

    dk0(String str, wy3 wy3Var, int i10, int i11, long j10, long j11) {
        super(true);
        gt1.c(str);
        this.f7365g = str;
        this.f7366h = new ys3();
        this.f7363e = i10;
        this.f7364f = i11;
        this.f7369k = new ArrayDeque();
        this.f7378t = j10;
        this.f7379u = j11;
        if (wy3Var != null) {
            b(wy3Var);
        }
    }

    private final void l() {
        while (!this.f7369k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f7369k.remove()).disconnect();
            } catch (Exception e5) {
                ze0.e("Unexpected error while disconnecting", e5);
            }
        }
        this.f7368j = null;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) throws IOException, NumberFormatException {
        long jMax;
        this.f7367i = ib3Var;
        this.f7374p = 0L;
        long j10 = ib3Var.f9674f;
        long j11 = ib3Var.f9675g;
        long jMin = j11 == -1 ? this.f7378t : Math.min(this.f7378t, j11);
        this.f7375q = j10;
        HttpURLConnection httpURLConnectionK = k(j10, (jMin + j10) - 1, 1);
        this.f7368j = httpURLConnectionK;
        String headerField = httpURLConnectionK.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f7362v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    long j14 = ib3Var.f9675g;
                    if (j14 != -1) {
                        this.f7373o = j14;
                        jMax = Math.max(j12, (this.f7375q + j14) - 1);
                    } else {
                        this.f7373o = j13 - this.f7375q;
                        jMax = j13 - 1;
                    }
                    this.f7376r = jMax;
                    this.f7377s = j12;
                    this.f7371m = true;
                    i(ib3Var);
                    return this.f7373o;
                } catch (NumberFormatException unused) {
                    ze0.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new bk0(headerField, ib3Var);
    }

    @Override // com.google.android.gms.internal.ads.sz2, com.google.android.gms.internal.ads.t53, com.google.android.gms.internal.ads.zt3
    public final Map c() {
        HttpURLConnection httpURLConnection = this.f7368j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.f7368j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        try {
            InputStream inputStream = this.f7370l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    throw new wp3(e5, this.f7367i, AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.f7370l = null;
            l();
            if (this.f7371m) {
                this.f7371m = false;
                g();
            }
        }
    }

    final HttpURLConnection k(long j10, long j11, int i10) throws IOException {
        String string = this.f7367i.f9669a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f7363e);
            httpURLConnection.setReadTimeout(this.f7364f);
            for (Map.Entry entry : this.f7366h.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty("User-Agent", this.f7365g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f7369k.add(httpURLConnection);
            String string2 = this.f7367i.f9669a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f7372n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    l();
                    throw new ck0(this.f7372n, headerFields, this.f7367i, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f7370l != null) {
                        inputStream = new SequenceInputStream(this.f7370l, inputStream);
                    }
                    this.f7370l = inputStream;
                    return httpURLConnection;
                } catch (IOException e5) {
                    l();
                    throw new wp3(e5, this.f7367i, AdError.SERVER_ERROR_CODE, i10);
                }
            } catch (IOException e10) {
                l();
                throw new wp3("Unable to connect to ".concat(String.valueOf(string2)), e10, this.f7367i, AdError.SERVER_ERROR_CODE, i10);
            }
        } catch (IOException e11) {
            throw new wp3("Unable to connect to ".concat(String.valueOf(string)), e11, this.f7367i, AdError.SERVER_ERROR_CODE, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f7373o;
            long j11 = this.f7374p;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.f7375q + j11;
            long j13 = i11;
            long j14 = j12 + j13 + this.f7379u;
            long j15 = this.f7377s;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.f7376r;
                if (j15 < j17) {
                    long jMin = Math.min(j17, Math.max(((this.f7378t + j16) - r3) - 1, (-1) + j16 + j13));
                    k(j16, jMin, 2);
                    this.f7377s = jMin;
                    j15 = jMin;
                }
            }
            int i12 = this.f7370l.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.f7375q) - this.f7374p));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.f7374p += i12;
            w(i12);
            return i12;
        } catch (IOException e5) {
            throw new wp3(e5, this.f7367i, AdError.SERVER_ERROR_CODE, 2);
        }
    }
}
