package ea;

import android.content.Context;
import android.os.AsyncTask;
import com.pushwoosh.inapp.view.RichMediaWebActivity;
import java.lang.ref.WeakReference;
import n7.l;

/* loaded from: classes2.dex */
class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23243a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.c f23244b;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a();
    }

    /* renamed from: ea.b$b, reason: collision with other inner class name */
    private static class AsyncTaskC0125b extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f23245a;

        /* renamed from: b, reason: collision with root package name */
        private final q9.b f23246b;

        /* renamed from: c, reason: collision with root package name */
        private final a f23247c;

        public AsyncTaskC0125b(b bVar, q9.b bVar2, a aVar) {
            this.f23245a = new WeakReference(bVar);
            this.f23246b = bVar2;
            this.f23247c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            return this.f23245a.get() != null ? Boolean.valueOf(((b) this.f23245a.get()).f23244b.e(this.f23246b.l())) : Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!bool.booleanValue() || this.f23245a.get() == null) {
                this.f23247c.a();
            } else {
                Context context = ((b) this.f23245a.get()).f23243a;
                context.startActivity(RichMediaWebActivity.n(context, this.f23246b));
            }
        }
    }

    b(Context context, s9.c cVar) {
        this.f23243a = context;
        this.f23244b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(q9.b bVar) {
        if (!this.f23244b.e(bVar.l())) {
            k9.h.v("[InApp]InAppDefaultViewStrategy", "resource is not downloaded, abort show inApp");
        } else {
            this.f23243a.startActivity(RichMediaWebActivity.n(this.f23243a, bVar));
        }
    }

    @Override // ea.d
    public void a(final q9.b bVar) {
        if (bVar == null) {
            k9.h.v("[InApp]InAppDefaultViewStrategy", "resource is empty");
            return;
        }
        l.i().t().e(bVar.l());
        l.i().t().n(null);
        new AsyncTaskC0125b(this, bVar, new a() { // from class: ea.a
            @Override // ea.b.a
            public final void a() {
                this.f23241a.e(bVar);
            }
        }).execute(new Void[0]);
    }
}
