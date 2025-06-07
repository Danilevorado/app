package ta;

import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f27401a;

    /* renamed from: b, reason: collision with root package name */
    private String f27402b;

    /* renamed from: c, reason: collision with root package name */
    private String f27403c;

    /* renamed from: d, reason: collision with root package name */
    private int f27404d = 120000;

    /* renamed from: e, reason: collision with root package name */
    private final Map f27405e = new HashMap();

    public h(String str) {
        this.f27401a = str;
    }

    public HttpURLConnection a() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f27401a).openConnection();
        httpURLConnection.setConnectTimeout(this.f27404d);
        httpURLConnection.setReadTimeout(this.f27404d);
        if (!TextUtils.isEmpty(this.f27402b)) {
            httpURLConnection.setRequestMethod(this.f27402b);
            if (!TextUtils.isEmpty(this.f27403c) || this.f27402b.equalsIgnoreCase("POST") || this.f27402b.equalsIgnoreCase("PUT")) {
                httpURLConnection.setDoOutput(true);
            }
        }
        for (String str : this.f27405e.keySet()) {
            httpURLConnection.setRequestProperty(str, (String) this.f27405e.get(str));
        }
        if (!TextUtils.isEmpty(this.f27403c)) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
            bufferedWriter.write(this.f27403c);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        return httpURLConnection;
    }

    public h b(String str) {
        this.f27403c = str;
        return this;
    }

    public h c(String str, String str2) {
        this.f27405e.put(str, str2);
        return this;
    }

    public h d(String str) {
        this.f27402b = str;
        return this;
    }
}
