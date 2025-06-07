package g8;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import g8.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import n7.l;
import w9.j;
import w9.k;

/* loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g8.c$c, reason: collision with other inner class name */
    interface InterfaceC0136c {
        void f(List list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0136c f23882a;

        /* renamed from: b, reason: collision with root package name */
        private final b f23883b;

        /* renamed from: c, reason: collision with root package name */
        private final int f23884c;

        public d(InterfaceC0136c interfaceC0136c, b bVar, int i10) {
            this.f23882a = interfaceC0136c;
            this.f23883b = bVar;
            this.f23884c = i10;
        }

        private List b() {
            List<Bundle> listA = ka.e.e().a();
            if (listA == null || listA.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : listA) {
                new w9.d(bundle);
                arrayList.add(new w9.d(bundle));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean e(String str, w9.d dVar) {
            return str.equals(dVar.d());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List doInBackground(Void... voidArr) {
            try {
                List listB = b();
                final String strG = c.g(this.f23884c);
                List list = Build.VERSION.SDK_INT >= 24 ? (List) listB.stream().filter(new Predicate() { // from class: g8.d
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return c.d.e(strG, (w9.d) obj);
                    }
                }).collect(Collectors.toList()) : null;
                x9.b.d(strG);
                return list;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List list) {
            super.onPostExecute(list);
            if (list == null || list.isEmpty()) {
                this.f23883b.a();
            } else {
                this.f23882a.f(list);
            }
        }
    }

    private static class e extends AsyncTask {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            ka.e.e().e();
            return null;
        }
    }

    private static class f extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final long f23885a;

        public f(long j10) {
            this.f23885a = j10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (c9.a.b() == null) {
                k9.h.k("Incorrect state of app. Context is null");
                return null;
            }
            ka.e.e().g(this.f23885a);
            return null;
        }
    }

    private static class g extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final int f23886a;

        public g(int i10) {
            this.f23886a = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            String strG;
            List listH;
            if (Build.VERSION.SDK_INT < 24 || (strG = c.g(this.f23886a)) == null || (listH = x9.b.h(strG)) == null) {
                return null;
            }
            if (listH.isEmpty()) {
                x9.b.c(strG);
                return null;
            }
            Notification notificationF = k.f(listH.size(), j.f28072c, strG);
            if (notificationF == null) {
                return null;
            }
            k.d(notificationF);
            return null;
        }
    }

    public static void d(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (intent.getBooleanExtra("is_delete_intent", false)) {
            e(intent);
        } else if (intent.getBooleanExtra("is_summary_notification", false)) {
            j(intent);
        } else {
            h(intent);
        }
    }

    private static void e(Intent intent) {
        try {
            l.i().n().d(intent.getBundleExtra("pushBundle"));
        } catch (Exception e5) {
            k9.h.o(e5);
        }
        if (intent.getBooleanExtra("is_summary_notification", false)) {
            new e().executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
            return;
        }
        long longExtra = intent.getLongExtra("row_id", 0L);
        if (longExtra > 0) {
            int intExtra = intent.getIntExtra("group_id", 0);
            new f(longExtra).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
            new g(intExtra).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(int i10) {
        try {
            return ka.e.i().g(i10);
        } catch (s7.b unused) {
            return null;
        }
    }

    private static void h(Intent intent) {
        try {
            l.i().n().c(intent.getBundleExtra("pushBundle"));
        } catch (Exception e5) {
            k9.h.o(e5);
        }
        long longExtra = intent.getLongExtra("row_id", 0L);
        if (longExtra != 0) {
            new f(longExtra).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
        int intExtra = intent.getIntExtra("group_id", 0);
        if (intExtra != 0) {
            new g(intExtra).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(List list) {
        try {
            l.i().n().e(list);
        } catch (Exception e5) {
            k9.h.o(e5);
        }
    }

    private static void j(final Intent intent) {
        int intExtra = intent.getIntExtra("group_id", 0);
        if (intExtra != 0) {
            new d(new InterfaceC0136c() { // from class: g8.b
                @Override // g8.c.InterfaceC0136c
                public final void f(List list) {
                    c.i(list);
                }
            }, new b() { // from class: g8.a
                @Override // g8.c.b
                public final void a() {
                    c.l(intent);
                }
            }, intExtra).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(Intent intent) {
        h(intent);
    }
}
