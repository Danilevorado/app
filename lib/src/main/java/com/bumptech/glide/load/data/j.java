package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements d {

    /* renamed from: s, reason: collision with root package name */
    static final b f5441s = new a();

    /* renamed from: m, reason: collision with root package name */
    private final x1.g f5442m;

    /* renamed from: n, reason: collision with root package name */
    private final int f5443n;

    /* renamed from: o, reason: collision with root package name */
    private final b f5444o;

    /* renamed from: p, reason: collision with root package name */
    private HttpURLConnection f5445p;

    /* renamed from: q, reason: collision with root package name */
    private InputStream f5446q;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f5447r;

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(x1.g gVar, int i10) {
        this(gVar, i10, f5441s);
    }

    j(x1.g gVar, int i10, b bVar) {
        this.f5442m = gVar;
        this.f5443n = i10;
        this.f5444o = bVar;
    }

    private HttpURLConnection c(URL url, Map map) throws r1.e {
        try {
            HttpURLConnection httpURLConnectionA = this.f5444o.a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f5443n);
            httpURLConnectionA.setReadTimeout(this.f5443n);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e5) {
            throw new r1.e("URL.openConnection threw", 0, e5);
        }
    }

    private static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e5) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e5);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws r1.e {
        InputStream inputStream;
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                inputStream = n2.c.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                inputStream = httpURLConnection.getInputStream();
            }
            this.f5446q = inputStream;
            return this.f5446q;
        } catch (IOException e5) {
            throw new r1.e("Failed to obtain InputStream", d(httpURLConnection), e5);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map map) throws IOException {
        if (i10 >= 5) {
            throw new r1.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new r1.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f5445p = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f5446q = this.f5445p.getInputStream();
            if (this.f5447r) {
                return null;
            }
            int iD = d(this.f5445p);
            if (h(iD)) {
                return g(this.f5445p);
            }
            if (!i(iD)) {
                if (iD == -1) {
                    throw new r1.e(iD);
                }
                try {
                    throw new r1.e(this.f5445p.getResponseMessage(), iD);
                } catch (IOException e5) {
                    throw new r1.e("Failed to get a response message", iD, e5);
                }
            }
            String headerField = this.f5445p.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new r1.e("Received empty or null redirect url", iD);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e10) {
                throw new r1.e("Bad redirect url: " + headerField, iD, e10);
            }
        } catch (IOException e11) {
            throw new r1.e("Failed to connect or obtain data", d(this.f5445p), e11);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f5446q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5445p;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f5445p = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f5447r = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public r1.a e() {
        return r1.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(com.bumptech.glide.g gVar, d.a aVar) {
        StringBuilder sb2;
        long jB = n2.g.b();
        try {
            try {
                aVar.d(j(this.f5442m.h(), 0, null, this.f5442m.e()));
            } catch (IOException e5) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e5);
                }
                aVar.c(e5);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb2 = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(n2.g.a(jB));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + n2.g.a(jB));
            }
            throw th;
        }
    }
}
