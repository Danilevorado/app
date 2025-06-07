package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ye0 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f17995c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f17996d = false;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f17999g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final List f18000a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f17994b = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final i4.e f17997e = i4.h.d();

    /* renamed from: f, reason: collision with root package name */
    private static final Set f17998f = new HashSet(Arrays.asList(new String[0]));

    public ye0(String str) {
        this.f18000a = !k() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(i4.c.a(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void b(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i10);
        jsonWriter.endObject();
        r(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (f17994b) {
            f17995c = false;
            f17996d = false;
            ze0.g("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z10) {
        synchronized (f17994b) {
            f17995c = true;
            f17996d = z10;
        }
    }

    public static boolean k() {
        boolean z10;
        synchronized (f17994b) {
            z10 = false;
            if (f17995c && f17996d) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean l() {
        boolean z10;
        synchronized (f17994b) {
            z10 = f17995c;
        }
        return z10;
    }

    private static synchronized void m(String str) {
        ze0.f("GMA Debug BEGIN");
        int i10 = 0;
        while (i10 < str.length()) {
            int i11 = i10 + 4000;
            ze0.f("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
            i10 = i11;
        }
        ze0.f("GMA Debug FINISH");
    }

    private final void n(String str, xe0 xe0Var) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f17997e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f18000a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            xe0Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e5) {
            ze0.e("unable to log", e5);
        }
        m(stringWriter.toString());
    }

    private final void o(final String str) throws IOException {
        n("onNetworkRequestError", new xe0() { // from class: com.google.android.gms.internal.ads.ue0
            @Override // com.google.android.gms.internal.ads.xe0
            public final void a(JsonWriter jsonWriter) throws IOException {
                String str2 = str;
                int i10 = ye0.f17999g;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void p(final String str, final String str2, final Map map, final byte[] bArr) throws IOException {
        n("onNetworkRequest", new xe0() { // from class: com.google.android.gms.internal.ads.ve0
            @Override // com.google.android.gms.internal.ads.xe0
            public final void a(JsonWriter jsonWriter) throws IOException {
                ye0.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void q(final Map map, final int i10) throws IOException {
        n("onNetworkResponse", new xe0() { // from class: com.google.android.gms.internal.ads.te0
            @Override // com.google.android.gms.internal.ads.xe0
            public final void a(JsonWriter jsonWriter) throws IOException {
                ye0.b(i10, map, jsonWriter);
            }
        });
    }

    private static void r(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f17998f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        ze0.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (k()) {
            p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void d(String str, String str2, Map map, byte[] bArr) throws IOException {
        if (k()) {
            p(str, "GET", map, bArr);
        }
    }

    public final void e(HttpURLConnection httpURLConnection, int i10) throws IOException {
        if (k()) {
            String responseMessage = null;
            q(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i10);
            if (i10 < 200 || i10 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e5) {
                    ze0.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e5.getMessage())));
                }
                o(responseMessage);
            }
        }
    }

    public final void f(Map map, int i10) throws IOException {
        if (k()) {
            q(map, i10);
            if (i10 < 200 || i10 >= 300) {
                o(null);
            }
        }
    }

    public final void g(String str) throws IOException {
        if (k() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) throws IOException {
        n("onNetworkResponseBody", new xe0() { // from class: com.google.android.gms.internal.ads.we0
            @Override // com.google.android.gms.internal.ads.xe0
            public final void a(JsonWriter jsonWriter) throws IOException {
                String str;
                byte[] bArr2 = bArr;
                int i10 = ye0.f17999g;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String strA = i4.c.a(bArr2);
                if (length >= 10000) {
                    strA = se0.g(strA);
                    str = strA != null ? "bodydigest" : "body";
                    jsonWriter.name("bodylength").value(length);
                    jsonWriter.endObject();
                }
                jsonWriter.name(str).value(strA);
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
