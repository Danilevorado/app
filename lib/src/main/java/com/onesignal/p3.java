package com.onesignal;

import android.net.TrafficStats;
import android.os.Build;
import com.onesignal.e3;
import java.io.InputStream;
import java.lang.Thread;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class p3 {

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f22209m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ JSONObject f22210n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ g f22211o;

        a(String str, JSONObject jSONObject, g gVar) {
            this.f22209m = str;
            this.f22210n = jSONObject;
            this.f22211o = gVar;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            p3.h(this.f22209m, "PUT", this.f22210n, this.f22211o, 120000, null);
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f22212m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ JSONObject f22213n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ g f22214o;

        b(String str, JSONObject jSONObject, g gVar) {
            this.f22212m = str;
            this.f22213n = jSONObject;
            this.f22214o = gVar;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            p3.h(this.f22212m, "POST", this.f22213n, this.f22214o, 120000, null);
        }
    }

    class c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f22215m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ g f22216n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f22217o;

        c(String str, g gVar, String str2) {
            this.f22215m = str;
            this.f22216n = gVar;
            this.f22217o = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            p3.h(this.f22215m, null, null, this.f22216n, 60000, this.f22217o);
        }
    }

    class d implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Thread[] f22218m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f22219n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f22220o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ JSONObject f22221p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f22222q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f22223r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f22224s;

        d(Thread[] threadArr, String str, String str2, JSONObject jSONObject, g gVar, int i10, String str3) {
            this.f22218m = threadArr;
            this.f22219n = str;
            this.f22220o = str2;
            this.f22221p = jSONObject;
            this.f22222q = gVar;
            this.f22223r = i10;
            this.f22224s = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22218m[0] = p3.n(this.f22219n, this.f22220o, this.f22221p, this.f22222q, this.f22223r, this.f22224s);
        }
    }

    class e implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ g f22225m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f22226n;

        e(g gVar, String str) {
            this.f22225m = gVar;
            this.f22226n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22225m.b(this.f22226n);
        }
    }

    class f implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ g f22227m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f22228n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f22229o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Throwable f22230p;

        f(g gVar, int i10, String str, Throwable th) {
            this.f22227m = gVar;
            this.f22228n = i10;
            this.f22229o = str;
            this.f22230p = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22227m.a(this.f22228n, this.f22229o, this.f22230p);
        }
    }

    static abstract class g {
        g() {
        }

        void a(int i10, String str, Throwable th) {
        }

        void b(String str) {
        }
    }

    private static Thread c(g gVar, int i10, String str, Throwable th) throws InterruptedException {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new f(gVar, i10, str, th), "OS_REST_FAILURE_CALLBACK");
        OSUtils.W(thread);
        return thread;
    }

    private static Thread d(g gVar, String str) throws InterruptedException {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new e(gVar, str), "OS_REST_SUCCESS_CALLBACK");
        OSUtils.W(thread);
        return thread;
    }

    public static void e(String str, g gVar, String str2) throws InterruptedException {
        OSUtils.W(new Thread(new c(str, gVar, str2), "OS_REST_ASYNC_GET"));
    }

    public static void f(String str, g gVar, String str2) throws InterruptedException {
        h(str, null, null, gVar, 60000, str2);
    }

    private static int g(int i10) {
        return i10 + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(String str, String str2, JSONObject jSONObject, g gVar, int i10, String str3) throws InterruptedException {
        if (OSUtils.H()) {
            throw new v2("Method: " + str2 + " was called from the Main Thread!");
        }
        if (str2 == null || !e3.R1(null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new d(threadArr, str, str2, jSONObject, gVar, i10, str3), "OS_HTTPConnection");
            OSUtils.W(thread);
            try {
                thread.join(g(i10));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                if (threadArr[0] != null) {
                    threadArr[0].join();
                }
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
    }

    private static HttpURLConnection i(String str) {
        return (HttpURLConnection) new URL("https://api.onesignal.com/" + str).openConnection();
    }

    public static void j(String str, JSONObject jSONObject, g gVar) throws InterruptedException {
        OSUtils.W(new Thread(new b(str, jSONObject, gVar), "OS_REST_ASYNC_POST"));
    }

    public static void k(String str, JSONObject jSONObject, g gVar) {
        h(str, "POST", jSONObject, gVar, 120000, null);
    }

    public static void l(String str, JSONObject jSONObject, g gVar) throws InterruptedException {
        OSUtils.W(new Thread(new a(str, jSONObject, gVar), "OS_REST_ASYNC_PUT"));
    }

    public static void m(String str, JSONObject jSONObject, g gVar) {
        h(str, "PUT", jSONObject, gVar, 120000, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Thread n(String str, String str2, JSONObject jSONObject, g gVar, int i10, String str3) {
        HttpURLConnection httpURLConnectionI;
        Thread threadC;
        String next;
        String headerField;
        Throwable th;
        if (Build.VERSION.SDK_INT >= 26) {
            TrafficStats.setThreadStatsTag(10000);
        }
        int responseCode = -1;
        try {
            e3.z zVar = e3.z.DEBUG;
            e3.a(zVar, "OneSignalRestClient: Making request to: https://api.onesignal.com/" + str);
            httpURLConnectionI = i(str);
            try {
                httpURLConnectionI.setUseCaches(false);
                httpURLConnectionI.setConnectTimeout(i10);
                httpURLConnectionI.setReadTimeout(i10);
                httpURLConnectionI.setRequestProperty("SDK-Version", "onesignal/android/" + e3.w0());
                httpURLConnectionI.setRequestProperty("Accept", "application/vnd.onesignal.v1+json");
                if (jSONObject != null) {
                    httpURLConnectionI.setDoInput(true);
                }
                if (str2 != null) {
                    httpURLConnectionI.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                    httpURLConnectionI.setRequestMethod(str2);
                    httpURLConnectionI.setDoOutput(true);
                }
                if (jSONObject != null) {
                    String strG = e0.g(jSONObject);
                    e3.a(zVar, "OneSignalRestClient: " + str2 + " SEND JSON: " + strG);
                    byte[] bytes = strG.getBytes("UTF-8");
                    httpURLConnectionI.setFixedLengthStreamingMode(bytes.length);
                    httpURLConnectionI.getOutputStream().write(bytes);
                }
                if (str3 != null) {
                    String strF = n3.f(n3.f22119a, "PREFS_OS_ETAG_PREFIX_" + str3, null);
                    if (strF != null) {
                        httpURLConnectionI.setRequestProperty("if-none-match", strF);
                        e3.a(zVar, "OneSignalRestClient: Adding header if-none-match: " + strF);
                    }
                }
                responseCode = httpURLConnectionI.getResponseCode();
                try {
                    e3.a(e3.z.VERBOSE, "OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/" + str);
                    String str4 = "GET";
                    if (responseCode == 200 || responseCode == 202) {
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            sb2.append("OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/");
                            sb2.append(str);
                            e3.a(zVar, sb2.toString());
                            Scanner scanner = new Scanner(httpURLConnectionI.getInputStream(), "UTF-8");
                            next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                            scanner.close();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("OneSignalRestClient: ");
                            if (str2 != null) {
                                str4 = str2;
                            }
                            sb3.append(str4);
                            sb3.append(" RECEIVED JSON: ");
                            sb3.append(next);
                            e3.a(zVar, sb3.toString());
                            if (str3 != null && (headerField = httpURLConnectionI.getHeaderField("etag")) != null) {
                                e3.a(zVar, "OneSignalRestClient: Response has etag of " + headerField + " so caching the response.");
                                String str5 = n3.f22119a;
                                n3.m(str5, "PREFS_OS_ETAG_PREFIX_" + str3, headerField);
                                n3.m(str5, "PREFS_OS_HTTP_CACHE_PREFIX_" + str3, next);
                            }
                            threadC = d(gVar, next);
                        } catch (Throwable th2) {
                            th = th2;
                            responseCode = responseCode;
                            try {
                                if ((th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                                    e3.a(e3.z.INFO, "OneSignalRestClient: Could not send last request, device is offline. Throwable: " + th.getClass().getName());
                                } else {
                                    e3.b(e3.z.WARN, "OneSignalRestClient: " + str2 + " Error thrown from network stack. ", th);
                                }
                                threadC = c(gVar, responseCode, null, th);
                                if (httpURLConnectionI != null) {
                                    httpURLConnectionI.disconnect();
                                }
                                return threadC;
                            } catch (Throwable th3) {
                                if (httpURLConnectionI != null) {
                                    httpURLConnectionI.disconnect();
                                }
                                throw th3;
                            }
                        }
                    } else if (responseCode != 304) {
                        e3.a(zVar, "OneSignalRestClient: Failed request to: https://api.onesignal.com/" + str);
                        InputStream errorStream = httpURLConnectionI.getErrorStream();
                        if (errorStream == null) {
                            errorStream = httpURLConnectionI.getInputStream();
                        }
                        if (errorStream != null) {
                            Scanner scanner2 = new Scanner(errorStream, "UTF-8");
                            next = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                            scanner2.close();
                            e3.a(e3.z.WARN, "OneSignalRestClient: " + str2 + " RECEIVED JSON: " + next);
                            th = null;
                        } else {
                            e3.a(e3.z.WARN, "OneSignalRestClient: " + str2 + " HTTP Code: " + responseCode + " No response body!");
                            th = null;
                            next = null;
                        }
                        threadC = c(gVar, responseCode, next, th);
                    } else {
                        String strF2 = n3.f(n3.f22119a, "PREFS_OS_HTTP_CACHE_PREFIX_" + str3, null);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("OneSignalRestClient: ");
                        if (str2 != null) {
                            str4 = str2;
                        }
                        sb4.append(str4);
                        sb4.append(" - Using Cached response due to 304: ");
                        sb4.append(strF2);
                        e3.a(zVar, sb4.toString());
                        threadC = d(gVar, strF2);
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            httpURLConnectionI = null;
        }
        httpURLConnectionI.disconnect();
        return threadC;
    }
}
