package k9;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import n7.l;

/* loaded from: classes2.dex */
public class d extends BroadcastReceiver {

    private static class b extends AsyncTask {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            ka.e.c().c();
            return null;
        }
    }

    private static class c extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final o8.a f24866a;

        public c(o8.a aVar) {
            this.f24866a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List doInBackground(Void... voidArr) {
            return ka.e.c().e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List list) {
            super.onPostExecute(list);
            this.f24866a.a(o8.b.a(list, null));
        }
    }

    /* renamed from: k9.d$d, reason: collision with other inner class name */
    private static class AsyncTaskC0154d extends AsyncTask {
        private AsyncTaskC0154d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            List listF = ka.e.c().f();
            if (listF != null && !listF.isEmpty()) {
                ma.g gVarK = l.i().k();
                if (gVarK == null) {
                    h.l("LockScreenReceiver", "RichMediaController is null");
                    return null;
                }
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    gVarK.k((ga.b) it.next());
                }
                ka.e.c().a();
            }
            return null;
        }
    }

    private void b(final Context context) {
        new c(new o8.a() { // from class: k9.c
            @Override // o8.a
            public final void a(o8.b bVar) {
                this.f24864a.c(context, bVar);
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, o8.b bVar) {
        List list = (List) bVar.d();
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((Uri) it.next(), context);
        }
        new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void d(Uri uri, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e5) {
            h.n("Can't open remote url: " + uri, e5);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (TextUtils.equals(intent.getAction(), "android.intent.action.SCREEN_ON")) {
            new AsyncTaskC0154d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (TextUtils.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            b(context);
        }
    }
}
