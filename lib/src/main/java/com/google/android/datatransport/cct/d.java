package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.ads.AdError;
import com.google.android.datatransport.cct.d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import q2.j;
import q2.k;
import q2.l;
import q2.m;
import q2.n;
import q2.o;
import q2.p;
import r2.h;
import r2.i;
import s2.f;
import s2.g;
import s2.m;

/* loaded from: classes.dex */
final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final a6.a f5512a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f5513b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5514c;

    /* renamed from: d, reason: collision with root package name */
    final URL f5515d;

    /* renamed from: e, reason: collision with root package name */
    private final b3.a f5516e;

    /* renamed from: f, reason: collision with root package name */
    private final b3.a f5517f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5518g;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f5519a;

        /* renamed from: b, reason: collision with root package name */
        final j f5520b;

        /* renamed from: c, reason: collision with root package name */
        final String f5521c;

        a(URL url, j jVar, String str) {
            this.f5519a = url;
            this.f5520b = jVar;
            this.f5521c = str;
        }

        a a(URL url) {
            return new a(url, this.f5520b, this.f5521c);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f5522a;

        /* renamed from: b, reason: collision with root package name */
        final URL f5523b;

        /* renamed from: c, reason: collision with root package name */
        final long f5524c;

        b(int i10, URL url, long j10) {
            this.f5522a = i10;
            this.f5523b = url;
            this.f5524c = j10;
        }
    }

    d(Context context, b3.a aVar, b3.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }

    d(Context context, b3.a aVar, b3.a aVar2, int i10) {
        this.f5512a = j.b();
        this.f5514c = context;
        this.f5513b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5515d = n(com.google.android.datatransport.cct.a.f5502c);
        this.f5516e = aVar2;
        this.f5517f = aVar;
        this.f5518g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        v2.a.f("CctTransportBackend", "Making request to: %s", aVar.f5519a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f5519a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f5518g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f5521c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f5512a.a(aVar.f5520b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    v2.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    v2.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    v2.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (a6.b e5) {
            e = e5;
            v2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            v2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            v2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            v2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (o.b.b(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = o.b.COMBINED;
        }
        return bVar.d();
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.d() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            v2.a.d("CctTransportBackend", "Unable to find version code for package", e5);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strJ = iVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a aVarB = q2.m.a().f(p.DEFAULT).g(this.f5517f.a()).h(this.f5516e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(q2.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                p2.b bVarB = hVarE.b();
                if (bVarB.equals(p2.b.b("proto"))) {
                    aVarJ = l.j(hVarE.a());
                } else if (bVarB.equals(p2.b.b("json"))) {
                    aVarJ = l.i(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    v2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.b(iVar3.g("net-type"))).b(o.b.b(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarJ.b(iVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AdError.NETWORK_ERROR_CODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f5523b;
        if (url == null) {
            return null;
        }
        v2.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f5523b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e5) {
            throw new IllegalArgumentException("Invalid url: " + str, e5);
        }
    }

    @Override // s2.m
    public g a(f fVar) {
        j jVarI = i(fVar);
        URL urlN = this.f5515d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarD = com.google.android.datatransport.cct.a.d(fVar.c());
                strE = aVarD.e() != null ? aVarD.e() : null;
                if (aVarD.f() != null) {
                    urlN = n(aVarD.f());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) w2.b.a(5, new a(urlN, jVarI, strE), new w2.a() { // from class: com.google.android.datatransport.cct.b
                @Override // w2.a
                public final Object a(Object obj) {
                    return this.f5510a.e((d.a) obj);
                }
            }, new w2.c() { // from class: com.google.android.datatransport.cct.c
                @Override // w2.c
                public final Object a(Object obj, Object obj2) {
                    return d.l((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f5522a;
            if (i10 == 200) {
                return g.e(bVar.f5524c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e5) {
            v2.a.d("CctTransportBackend", "Could not make request to the backend", e5);
            return g.f();
        }
    }

    @Override // s2.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f5513b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f5514c).getSimOperator()).c("application_build", Integer.toString(h(this.f5514c))).d();
    }
}
