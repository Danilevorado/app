package com.pushwoosh.inapp.view;

import a9.i;
import android.os.AsyncTask;
import android.os.Build;
import java.util.Map;
import m9.h;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private final q9.b f22602a;

    /* renamed from: b, reason: collision with root package name */
    private final a f22603b;

    /* renamed from: c, reason: collision with root package name */
    private final h f22604c = y7.b.c();

    public interface a {
        void a();

        void b(o8.b bVar);
    }

    public d(q9.b bVar, a aVar) {
        this.f22602a = bVar;
        this.f22603b = aVar;
    }

    private void b(Map map) {
        if (map == null) {
            return;
        }
        if (ka.e.d().g().a()) {
            map.put("OS Version", Build.VERSION.RELEASE);
        }
        if (ka.e.d().f().a()) {
            map.put("Device Model", w7.a.a());
        }
        r8.a.d(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o8.b doInBackground(Void... voidArr) {
        try {
            Map mapL = k9.b.l(ka.e.d().x().b());
            b(mapL);
            this.f22602a.g(mapL);
        } catch (JSONException e5) {
            k9.h.n("Failed parse tags", e5);
        }
        return this.f22604c.n(this.f22602a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(o8.b bVar) {
        super.onPostExecute(bVar);
        if (!bVar.f()) {
            i.e(new f8.c(this.f22602a, bVar.e()));
        }
        this.f22603b.b(bVar);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        this.f22603b.a();
    }
}
