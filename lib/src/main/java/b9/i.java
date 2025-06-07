package b9;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class i implements e {

    /* renamed from: a, reason: collision with root package name */
    private final ka.d f4578a;

    /* renamed from: b, reason: collision with root package name */
    private final va.c f4579b;

    /* renamed from: c, reason: collision with root package name */
    private String f4580c;

    /* renamed from: e, reason: collision with root package name */
    private p9.b f4582e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4581d = false;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f4583f = new Handler(Looper.getMainLooper());

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f4584a;

        /* renamed from: b, reason: collision with root package name */
        private int f4585b;

        /* renamed from: c, reason: collision with root package name */
        private JSONObject f4586c;

        a(int i10, int i11, JSONObject jSONObject) {
            this.f4585b = i10;
            this.f4584a = i11;
            this.f4586c = jSONObject;
        }

        int a() {
            return this.f4584a;
        }

        JSONObject b() {
            return this.f4586c;
        }

        int c() {
            return this.f4585b;
        }
    }

    private static class b extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f4587a;

        /* renamed from: b, reason: collision with root package name */
        private final d f4588b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4589c;

        /* renamed from: d, reason: collision with root package name */
        private final o8.a f4590d;

        b(i iVar, d dVar, String str, o8.a aVar) {
            this.f4587a = new WeakReference(iVar);
            this.f4588b = dVar;
            this.f4589c = str;
            this.f4590d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o8.b doInBackground(Void... voidArr) {
            if (this.f4587a.get() != null) {
                return ((i) this.f4587a.get()).i(this.f4588b, this.f4589c);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(o8.b bVar) {
            o8.a aVar;
            super.onPostExecute(bVar);
            if (bVar == null || (aVar = this.f4590d) == null) {
                return;
            }
            aVar.a(bVar);
        }
    }

    i(ka.d dVar, p9.b bVar, va.c cVar) {
        this.f4578a = dVar;
        this.f4582e = bVar;
        this.f4579b = cVar;
        this.f4580c = dVar.b().a();
    }

    private a g(String str, JSONObject jSONObject, String str2) throws Exception {
        try {
            URL url = new URL(str + str2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setDoOutput(true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("request", jSONObject);
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(jSONObject2.toString().getBytes().length));
            httpURLConnection.setUseCaches(false);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(jSONObject2.toString().getBytes());
                outputStream.flush();
                outputStream.close();
                a aVarH = h(httpURLConnection);
                k9.h.s("RequestManager", "\nx\n|     Pushwoosh request:\n| Url: " + url.toString() + "\n| Payload: " + jSONObject2.toString() + "\n| Response: " + aVarH.b().toString() + "\nx");
                return aVarH;
            } finally {
            }
        } catch (Exception e5) {
            if (str.equals(this.f4580c)) {
                this.f4580c = this.f4578a.i();
            }
            throw e5;
        }
    }

    private a h(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        BufferedInputStream bufferedInputStream;
        int i10;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        int responseCode = httpURLConnection.getResponseCode();
        if (n(httpURLConnection.getResponseCode())) {
            bufferedInputStream = new BufferedInputStream(httpURLConnection.getErrorStream());
            try {
                jSONObject2.put("status_code", responseCode);
                jSONObject2.put("status_message", httpURLConnection.getResponseMessage());
            } catch (JSONException e5) {
                k9.h.l("RequestManager", e5.getMessage());
            }
            i10 = responseCode;
        } else {
            bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            i10 = 0;
        }
        try {
            if (httpURLConnection.getContentLength() != 0) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = bufferedInputStream.read(bArr);
                            if (i11 < 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i11);
                        }
                        jSONObject = new JSONObject(byteArrayOutputStream.toString().trim());
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        i10 = jSONObject.getInt("status_code");
                        byteArrayOutputStream.close();
                        jSONObject2 = jSONObject;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    jSONObject2 = null;
                    k9.h.l("RequestManager", e.getMessage());
                    bufferedInputStream.close();
                    return new a(responseCode, i10, jSONObject2);
                }
            }
            bufferedInputStream.close();
            return new a(responseCode, i10, jSONObject2);
        } catch (Throwable th5) {
            bufferedInputStream.close();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o8.b i(b9.d r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.i.i(b9.d, java.lang.String):o8.b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(d dVar, String str, o8.a aVar) {
        new b(this, dVar, str, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void l(String str) {
        this.f4580c = str;
        this.f4578a.b().b(str);
    }

    private boolean m() {
        boolean zA = this.f4578a.v().a();
        if (zA) {
            k9.h.v("RequestManager", "remove all data device is true, it is block request to server");
        }
        return zA;
    }

    private boolean n(int i10) {
        return i10 >= 400 && i10 < 600;
    }

    @Override // b9.e
    public void a(String str) {
        l(str);
    }

    @Override // b9.e
    public void b(d dVar, o8.a aVar) {
        c(dVar, this.f4580c, aVar);
    }

    @Override // b9.e
    public void c(final d dVar, final String str, final o8.a aVar) {
        if (m()) {
            if (aVar != null) {
                aVar.a(o8.b.c(new b9.a("Device data was removed from Pushwoosh and all interactions were stopped")));
            }
        } else {
            if (!dVar.j()) {
                new b(this, dVar, str, aVar).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                return;
            }
            int iNextInt = new Random().nextInt(30000);
            k9.h.h("RequestManager", "Adding jitter delay of " + iNextInt + " milliseconds to " + dVar.getClass().getCanonicalName() + " request");
            this.f4583f.postDelayed(new Runnable() { // from class: b9.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4574m.k(dVar, str, aVar);
                }
            }, (long) iNextInt);
        }
    }

    @Override // b9.e
    public o8.b d(d dVar) {
        return m() ? o8.b.b(null) : i(dVar, this.f4580c);
    }

    @Override // b9.e
    public void e(d dVar) {
        if (m()) {
            return;
        }
        b(dVar, null);
    }
}
