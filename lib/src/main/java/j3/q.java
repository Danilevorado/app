package j3;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.bg;
import com.google.android.gms.internal.ads.ze0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class q extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f24489a;

    /* synthetic */ q(s sVar, p pVar) {
        this.f24489a = sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            s sVar = this.f24489a;
            sVar.f24503t = (bg) sVar.f24498o.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            ze0.h("", e5);
        }
        return this.f24489a.o();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        s sVar = this.f24489a;
        if (sVar.f24501r == null || str == null) {
            return;
        }
        sVar.f24501r.loadUrl(str);
    }
}
